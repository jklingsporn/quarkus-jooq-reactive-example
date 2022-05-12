/*
 * This file is generated by jOOQ.
 */
package io.github.jklingsporn.qjre.schema.tables.daos;


import io.github.jklingsporn.qjre.schema.tables.Country;
import io.github.jklingsporn.qjre.schema.tables.records.CountryRecord;
import io.github.jklingsporn.vertx.jooq.shared.reactive.AbstractReactiveVertxDAO;

import java.time.LocalDateTime;
import java.util.Collection;

import org.jooq.Configuration;


import java.util.List;
import io.smallrye.mutiny.Uni;
import io.github.jklingsporn.vertx.jooq.mutiny.reactive.ReactiveMutinyQueryExecutor;
/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
@javax.inject.Singleton
public class CountryDao extends AbstractReactiveVertxDAO<CountryRecord, io.github.jklingsporn.qjre.schema.tables.pojos.Country, Short, Uni<List<io.github.jklingsporn.qjre.schema.tables.pojos.Country>>, Uni<io.github.jklingsporn.qjre.schema.tables.pojos.Country>, Uni<Integer>, Uni<Short>> implements io.github.jklingsporn.vertx.jooq.mutiny.VertxDAO<CountryRecord,io.github.jklingsporn.qjre.schema.tables.pojos.Country,Short> {
        @javax.inject.Inject

        /**
     * @param configuration The Configuration used for rendering and query
     * execution.
     * @param vertx the vertx instance
     */
        public CountryDao(Configuration configuration, io.vertx.mutiny.sqlclient.SqlClient delegate) {
                super(Country.COUNTRY, io.github.jklingsporn.qjre.schema.tables.pojos.Country.class, new ReactiveMutinyQueryExecutor<CountryRecord,io.github.jklingsporn.qjre.schema.tables.pojos.Country,Short>(configuration,delegate,io.github.jklingsporn.qjre.schema.tables.mappers.RowMappers.getCountryMapper()));
        }

        @Override
        protected Short getId(io.github.jklingsporn.qjre.schema.tables.pojos.Country object) {
                return object.getCountryId();
        }

        /**
     * Find records that have <code>country IN (values)</code> asynchronously
     */
        public Uni<List<io.github.jklingsporn.qjre.schema.tables.pojos.Country>> findManyByCountry(Collection<String> values) {
                return findManyByCondition(Country.COUNTRY.COUNTRY_.in(values));
        }

        /**
     * Find records that have <code>country IN (values)</code> asynchronously
     * limited by the given limit
     */
        public Uni<List<io.github.jklingsporn.qjre.schema.tables.pojos.Country>> findManyByCountry(Collection<String> values, int limit) {
                return findManyByCondition(Country.COUNTRY.COUNTRY_.in(values),limit);
        }

        /**
     * Find records that have <code>last_update IN (values)</code>
     * asynchronously
     */
        public Uni<List<io.github.jklingsporn.qjre.schema.tables.pojos.Country>> findManyByLastUpdate(Collection<LocalDateTime> values) {
                return findManyByCondition(Country.COUNTRY.LAST_UPDATE.in(values));
        }

        /**
     * Find records that have <code>last_update IN (values)</code>
     * asynchronously limited by the given limit
     */
        public Uni<List<io.github.jklingsporn.qjre.schema.tables.pojos.Country>> findManyByLastUpdate(Collection<LocalDateTime> values, int limit) {
                return findManyByCondition(Country.COUNTRY.LAST_UPDATE.in(values),limit);
        }

        @Override
        public ReactiveMutinyQueryExecutor<CountryRecord,io.github.jklingsporn.qjre.schema.tables.pojos.Country,Short> queryExecutor(){
                return (ReactiveMutinyQueryExecutor<CountryRecord,io.github.jklingsporn.qjre.schema.tables.pojos.Country,Short>) super.queryExecutor();
        }

        @Override
        protected java.util.function.Function<io.vertx.sqlclient.RowSet<io.vertx.sqlclient.Row>,Long> extractMysqlLastInsertProperty(){
                return rs -> rs.property(io.vertx.mysqlclient.MySQLClient.LAST_INSERTED_ID);
        }
}
