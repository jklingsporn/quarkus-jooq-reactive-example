# How to go reactive with Quarkus and jOOQ
## Why
At the time of writing, there is currently no way to leverage the power of [jOOQ](https://www.jooq.org) together with Quarkus' reactive API.
The [existing extension](https://github.com/quarkiverse/quarkus-jooq) enables vanilla jOOQ for Quarkus with it's blocking
API.

## How
[vertx-jooq](https://github.com/jklingsporn/vertx-jooq) unlocks reactive APIs for jOOQ by using vertx' reactive database
drivers. It supports several API-variants including Smallrye Mutiny-API which is also used by Quarkus. 
Quarkus however uses its own dependency injection framework. To support it, one must render the proper annotations in the generated jOOQ files.
[vertx-jooq](https://github.com/jklingsporn/vertx-jooq) provides out-of-the-box support for GuiceDI. With a little adjustment
to the [code-generator](https://github.com/jklingsporn/quarkus-jooq-reactive-example/blob/main/codegen/src/main/java/io/github/jklingsporn/qjre/QuarkusReactiveGenerator.java) 
we can render `@Inject`-annotations and omit the creation of Guice-Modules which are rendered by default:
```
public class QuarkusReactiveGenerator extends DelegatingVertxGenerator {

    public QuarkusReactiveGenerator() {
        super(VertxGeneratorBuilder.init().withMutinyAPI().withPostgresReactiveDriver().withGuice(false, PredefinedNamedInjectionStrategy.DISABLED).build());
    }
}
```
After we've built the generator, we can use it to generate our files. However - similar to Guice - QuarkusDI needs to know
how to create the `org.jooq.Configuration`, `SqlClient`, etc. For those classes we need
to give QuarkusDI a hint how these classes are created. Take a look at this example for the `Configuration`-object:
```
public class ConfigurationFactory {

    @Produces
    @ApplicationScoped
    public Configuration createContext(){
        Configuration configuration = new DefaultConfiguration();
        configuration.set(SQLDialect.MYSQL);
        return configuration;
    }

}
```
The other classes are handled in a similar fashion. Just put the factories somewhere in your classpath so Quarkus can find it, and you're good to go (**Hint**: don't forget to [configure
your project](https://quarkus.io/guides/cdi-reference#bean_discovery) properly in a multi-module maven-setup).

## Bootstrap
Step 1: build code generator so the jOOQ-code generation plugin can find it
```
cd codegen && mvn clean install
```
Step 2: boot sakila database
```
docker run -d -e MYSQL_ROOT_PASSWORD=root -p 127.0.0.1:3306:3306 --name sakila 1maa/sakila:latest
```
Step 3 (optional): generate sources
```
mvn clean generate-sources 
```
Step 4 (for IntelliJ): add generated sources as source root 
```
1. Open File->Project Structure->Modules->application
2. Add src/main/generated as source root
```
Step 5: start dev-server
```
./mvnw compile quarkus:dev -pl application
```
Step 6: open browser 
```
http://localhost:8080/film?limit=10&offset=0
```