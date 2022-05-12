package io.github.jklingsporn.qjre.application.factory;

import org.jooq.Configuration;
import org.jooq.SQLDialect;
import org.jooq.impl.DefaultConfiguration;

import javax.enterprise.context.ApplicationScoped;
import javax.enterprise.inject.Produces;

public class ConfigurationFactory {

    @Produces
    @ApplicationScoped
    public Configuration createContext(){
        Configuration configuration = new DefaultConfiguration();
        configuration.set(SQLDialect.MYSQL);
        return configuration;
    }

}
