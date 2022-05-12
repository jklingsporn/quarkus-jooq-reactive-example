package io.github.jklingsporn.qjre.application.factory;

import io.github.jklingsporn.vertx.jooq.mutiny.reactive.ReactiveMutinyGenericQueryExecutor;
import io.vertx.mutiny.sqlclient.SqlClient;
import org.jooq.Configuration;

import javax.enterprise.context.ApplicationScoped;
import javax.enterprise.inject.Produces;
import javax.inject.Inject;

public class QueryExecutorFactory {

    private final SqlClient sqlClient;
    private final Configuration configuration;

    @Inject
    public QueryExecutorFactory(SqlClient sqlClient, Configuration configuration) {
        this.sqlClient = sqlClient;
        this.configuration = configuration;
    }

    @Produces
    @ApplicationScoped
    public ReactiveMutinyGenericQueryExecutor createExecutor(){
        return new ReactiveMutinyGenericQueryExecutor(configuration,sqlClient);
    }
}
