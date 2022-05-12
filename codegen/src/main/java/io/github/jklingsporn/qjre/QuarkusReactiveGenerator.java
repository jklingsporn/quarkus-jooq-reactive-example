package io.github.jklingsporn.qjre;

import io.github.jklingsporn.vertx.jooq.generate.builder.DelegatingVertxGenerator;
import io.github.jklingsporn.vertx.jooq.generate.builder.PredefinedNamedInjectionStrategy;
import io.github.jklingsporn.vertx.jooq.generate.builder.VertxGeneratorBuilder;

public class QuarkusReactiveGenerator extends DelegatingVertxGenerator {

    public QuarkusReactiveGenerator() {
        super(VertxGeneratorBuilder.init().withMutinyAPI().withPostgresReactiveDriver().withGuice(false, PredefinedNamedInjectionStrategy.DISABLED).build());
    }
}

