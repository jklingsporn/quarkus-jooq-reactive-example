/*
 * This file is generated by jOOQ.
 */
package io.github.jklingsporn.qjre.schema.tables.daos;


import io.github.jklingsporn.qjre.schema.tables.Store;
import io.github.jklingsporn.qjre.schema.tables.records.StoreRecord;
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
public class StoreDao extends AbstractReactiveVertxDAO<StoreRecord, io.github.jklingsporn.qjre.schema.tables.pojos.Store, Boolean, Uni<List<io.github.jklingsporn.qjre.schema.tables.pojos.Store>>, Uni<io.github.jklingsporn.qjre.schema.tables.pojos.Store>, Uni<Integer>, Uni<Boolean>> implements io.github.jklingsporn.vertx.jooq.mutiny.VertxDAO<StoreRecord,io.github.jklingsporn.qjre.schema.tables.pojos.Store,Boolean> {
        @javax.inject.Inject

        /**
     * @param configuration The Configuration used for rendering and query
     * execution.
     * @param vertx the vertx instance
     */
        public StoreDao(Configuration configuration, io.vertx.mutiny.sqlclient.SqlClient delegate) {
                super(Store.STORE, io.github.jklingsporn.qjre.schema.tables.pojos.Store.class, new ReactiveMutinyQueryExecutor<StoreRecord,io.github.jklingsporn.qjre.schema.tables.pojos.Store,Boolean>(configuration,delegate,io.github.jklingsporn.qjre.schema.tables.mappers.RowMappers.getStoreMapper()));
        }

        @Override
        protected Boolean getId(io.github.jklingsporn.qjre.schema.tables.pojos.Store object) {
                return object.getStoreId();
        }

        /**
     * Find records that have <code>manager_staff_id IN (values)</code>
     * asynchronously
     */
        public Uni<List<io.github.jklingsporn.qjre.schema.tables.pojos.Store>> findManyByManagerStaffId(Collection<Boolean> values) {
                return findManyByCondition(Store.STORE.MANAGER_STAFF_ID.in(values));
        }

        /**
     * Find records that have <code>manager_staff_id IN (values)</code>
     * asynchronously limited by the given limit
     */
        public Uni<List<io.github.jklingsporn.qjre.schema.tables.pojos.Store>> findManyByManagerStaffId(Collection<Boolean> values, int limit) {
                return findManyByCondition(Store.STORE.MANAGER_STAFF_ID.in(values),limit);
        }

        /**
     * Find records that have <code>address_id IN (values)</code> asynchronously
     */
        public Uni<List<io.github.jklingsporn.qjre.schema.tables.pojos.Store>> findManyByAddressId(Collection<Short> values) {
                return findManyByCondition(Store.STORE.ADDRESS_ID.in(values));
        }

        /**
     * Find records that have <code>address_id IN (values)</code> asynchronously
     * limited by the given limit
     */
        public Uni<List<io.github.jklingsporn.qjre.schema.tables.pojos.Store>> findManyByAddressId(Collection<Short> values, int limit) {
                return findManyByCondition(Store.STORE.ADDRESS_ID.in(values),limit);
        }

        /**
     * Find records that have <code>last_update IN (values)</code>
     * asynchronously
     */
        public Uni<List<io.github.jklingsporn.qjre.schema.tables.pojos.Store>> findManyByLastUpdate(Collection<LocalDateTime> values) {
                return findManyByCondition(Store.STORE.LAST_UPDATE.in(values));
        }

        /**
     * Find records that have <code>last_update IN (values)</code>
     * asynchronously limited by the given limit
     */
        public Uni<List<io.github.jklingsporn.qjre.schema.tables.pojos.Store>> findManyByLastUpdate(Collection<LocalDateTime> values, int limit) {
                return findManyByCondition(Store.STORE.LAST_UPDATE.in(values),limit);
        }

        @Override
        public ReactiveMutinyQueryExecutor<StoreRecord,io.github.jklingsporn.qjre.schema.tables.pojos.Store,Boolean> queryExecutor(){
                return (ReactiveMutinyQueryExecutor<StoreRecord,io.github.jklingsporn.qjre.schema.tables.pojos.Store,Boolean>) super.queryExecutor();
        }

        @Override
        protected java.util.function.Function<io.vertx.sqlclient.RowSet<io.vertx.sqlclient.Row>,Long> extractMysqlLastInsertProperty(){
                return rs -> rs.property(io.vertx.mysqlclient.MySQLClient.LAST_INSERTED_ID);
        }
}
