package io.github.jklingsporn.qjre.application.factory;

import io.vertx.mutiny.mysqlclient.MySQLPool;
import io.vertx.mutiny.sqlclient.SqlClient;

import javax.enterprise.context.ApplicationScoped;
import javax.enterprise.inject.Produces;
import javax.inject.Inject;

public class SqlClientFactory {

    private MySQLPool mySQLClient;

    @Inject
    public SqlClientFactory(MySQLPool mySQLClient) {
        this.mySQLClient = mySQLClient;
    }


    @Produces
    @ApplicationScoped
    public SqlClient createClient(){
        return mySQLClient;
    }

}
