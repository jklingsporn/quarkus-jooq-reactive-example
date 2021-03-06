/*
 * This file is generated by jOOQ.
 */
package io.github.jklingsporn.qjre.schema.tables.daos;


import io.github.jklingsporn.qjre.schema.tables.Address;
import io.github.jklingsporn.qjre.schema.tables.records.AddressRecord;
import io.github.jklingsporn.vertx.jooq.shared.reactive.AbstractReactiveVertxDAO;

import java.time.LocalDateTime;
import java.util.Collection;

import org.jooq.Configuration;
import org.jooq.Geometry;


import java.util.List;
import io.smallrye.mutiny.Uni;
import io.github.jklingsporn.vertx.jooq.mutiny.reactive.ReactiveMutinyQueryExecutor;
/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
@javax.inject.Singleton
public class AddressDao extends AbstractReactiveVertxDAO<AddressRecord, io.github.jklingsporn.qjre.schema.tables.pojos.Address, Short, Uni<List<io.github.jklingsporn.qjre.schema.tables.pojos.Address>>, Uni<io.github.jklingsporn.qjre.schema.tables.pojos.Address>, Uni<Integer>, Uni<Short>> implements io.github.jklingsporn.vertx.jooq.mutiny.VertxDAO<AddressRecord,io.github.jklingsporn.qjre.schema.tables.pojos.Address,Short> {
        @javax.inject.Inject

        /**
     * @param configuration The Configuration used for rendering and query
     * execution.
     * @param vertx the vertx instance
     */
        public AddressDao(Configuration configuration, io.vertx.mutiny.sqlclient.SqlClient delegate) {
                super(Address.ADDRESS, io.github.jklingsporn.qjre.schema.tables.pojos.Address.class, new ReactiveMutinyQueryExecutor<AddressRecord,io.github.jklingsporn.qjre.schema.tables.pojos.Address,Short>(configuration,delegate,io.github.jklingsporn.qjre.schema.tables.mappers.RowMappers.getAddressMapper()));
        }

        @Override
        protected Short getId(io.github.jklingsporn.qjre.schema.tables.pojos.Address object) {
                return object.getAddressId();
        }

        /**
     * Find records that have <code>address IN (values)</code> asynchronously
     */
        public Uni<List<io.github.jklingsporn.qjre.schema.tables.pojos.Address>> findManyByAddress(Collection<String> values) {
                return findManyByCondition(Address.ADDRESS.ADDRESS_.in(values));
        }

        /**
     * Find records that have <code>address IN (values)</code> asynchronously
     * limited by the given limit
     */
        public Uni<List<io.github.jklingsporn.qjre.schema.tables.pojos.Address>> findManyByAddress(Collection<String> values, int limit) {
                return findManyByCondition(Address.ADDRESS.ADDRESS_.in(values),limit);
        }

        /**
     * Find records that have <code>address2 IN (values)</code> asynchronously
     */
        public Uni<List<io.github.jklingsporn.qjre.schema.tables.pojos.Address>> findManyByAddress2(Collection<String> values) {
                return findManyByCondition(Address.ADDRESS.ADDRESS2.in(values));
        }

        /**
     * Find records that have <code>address2 IN (values)</code> asynchronously
     * limited by the given limit
     */
        public Uni<List<io.github.jklingsporn.qjre.schema.tables.pojos.Address>> findManyByAddress2(Collection<String> values, int limit) {
                return findManyByCondition(Address.ADDRESS.ADDRESS2.in(values),limit);
        }

        /**
     * Find records that have <code>district IN (values)</code> asynchronously
     */
        public Uni<List<io.github.jklingsporn.qjre.schema.tables.pojos.Address>> findManyByDistrict(Collection<String> values) {
                return findManyByCondition(Address.ADDRESS.DISTRICT.in(values));
        }

        /**
     * Find records that have <code>district IN (values)</code> asynchronously
     * limited by the given limit
     */
        public Uni<List<io.github.jklingsporn.qjre.schema.tables.pojos.Address>> findManyByDistrict(Collection<String> values, int limit) {
                return findManyByCondition(Address.ADDRESS.DISTRICT.in(values),limit);
        }

        /**
     * Find records that have <code>city_id IN (values)</code> asynchronously
     */
        public Uni<List<io.github.jklingsporn.qjre.schema.tables.pojos.Address>> findManyByCityId(Collection<Short> values) {
                return findManyByCondition(Address.ADDRESS.CITY_ID.in(values));
        }

        /**
     * Find records that have <code>city_id IN (values)</code> asynchronously
     * limited by the given limit
     */
        public Uni<List<io.github.jklingsporn.qjre.schema.tables.pojos.Address>> findManyByCityId(Collection<Short> values, int limit) {
                return findManyByCondition(Address.ADDRESS.CITY_ID.in(values),limit);
        }

        /**
     * Find records that have <code>postal_code IN (values)</code>
     * asynchronously
     */
        public Uni<List<io.github.jklingsporn.qjre.schema.tables.pojos.Address>> findManyByPostalCode(Collection<String> values) {
                return findManyByCondition(Address.ADDRESS.POSTAL_CODE.in(values));
        }

        /**
     * Find records that have <code>postal_code IN (values)</code>
     * asynchronously limited by the given limit
     */
        public Uni<List<io.github.jklingsporn.qjre.schema.tables.pojos.Address>> findManyByPostalCode(Collection<String> values, int limit) {
                return findManyByCondition(Address.ADDRESS.POSTAL_CODE.in(values),limit);
        }

        /**
     * Find records that have <code>phone IN (values)</code> asynchronously
     */
        public Uni<List<io.github.jklingsporn.qjre.schema.tables.pojos.Address>> findManyByPhone(Collection<String> values) {
                return findManyByCondition(Address.ADDRESS.PHONE.in(values));
        }

        /**
     * Find records that have <code>phone IN (values)</code> asynchronously
     * limited by the given limit
     */
        public Uni<List<io.github.jklingsporn.qjre.schema.tables.pojos.Address>> findManyByPhone(Collection<String> values, int limit) {
                return findManyByCondition(Address.ADDRESS.PHONE.in(values),limit);
        }

        /**
     * Find records that have <code>location IN (values)</code> asynchronously
     */
        public Uni<List<io.github.jklingsporn.qjre.schema.tables.pojos.Address>> findManyByLocation(Collection<Geometry> values) {
                return findManyByCondition(Address.ADDRESS.LOCATION.in(values));
        }

        /**
     * Find records that have <code>location IN (values)</code> asynchronously
     * limited by the given limit
     */
        public Uni<List<io.github.jklingsporn.qjre.schema.tables.pojos.Address>> findManyByLocation(Collection<Geometry> values, int limit) {
                return findManyByCondition(Address.ADDRESS.LOCATION.in(values),limit);
        }

        /**
     * Find records that have <code>last_update IN (values)</code>
     * asynchronously
     */
        public Uni<List<io.github.jklingsporn.qjre.schema.tables.pojos.Address>> findManyByLastUpdate(Collection<LocalDateTime> values) {
                return findManyByCondition(Address.ADDRESS.LAST_UPDATE.in(values));
        }

        /**
     * Find records that have <code>last_update IN (values)</code>
     * asynchronously limited by the given limit
     */
        public Uni<List<io.github.jklingsporn.qjre.schema.tables.pojos.Address>> findManyByLastUpdate(Collection<LocalDateTime> values, int limit) {
                return findManyByCondition(Address.ADDRESS.LAST_UPDATE.in(values),limit);
        }

        @Override
        public ReactiveMutinyQueryExecutor<AddressRecord,io.github.jklingsporn.qjre.schema.tables.pojos.Address,Short> queryExecutor(){
                return (ReactiveMutinyQueryExecutor<AddressRecord,io.github.jklingsporn.qjre.schema.tables.pojos.Address,Short>) super.queryExecutor();
        }

        @Override
        protected java.util.function.Function<io.vertx.sqlclient.RowSet<io.vertx.sqlclient.Row>,Long> extractMysqlLastInsertProperty(){
                return rs -> rs.property(io.vertx.mysqlclient.MySQLClient.LAST_INSERTED_ID);
        }
}
