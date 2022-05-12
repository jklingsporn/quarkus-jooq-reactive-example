/*
 * This file is generated by jOOQ.
 */
package io.github.jklingsporn.qjre.schema.tables.daos;


import io.github.jklingsporn.qjre.schema.tables.Inventory;
import io.github.jklingsporn.qjre.schema.tables.records.InventoryRecord;
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
public class InventoryDao extends AbstractReactiveVertxDAO<InventoryRecord, io.github.jklingsporn.qjre.schema.tables.pojos.Inventory, Integer, Uni<List<io.github.jklingsporn.qjre.schema.tables.pojos.Inventory>>, Uni<io.github.jklingsporn.qjre.schema.tables.pojos.Inventory>, Uni<Integer>, Uni<Integer>> implements io.github.jklingsporn.vertx.jooq.mutiny.VertxDAO<InventoryRecord,io.github.jklingsporn.qjre.schema.tables.pojos.Inventory,Integer> {
        @javax.inject.Inject

        /**
     * @param configuration The Configuration used for rendering and query
     * execution.
     * @param vertx the vertx instance
     */
        public InventoryDao(Configuration configuration, io.vertx.mutiny.sqlclient.SqlClient delegate) {
                super(Inventory.INVENTORY, io.github.jklingsporn.qjre.schema.tables.pojos.Inventory.class, new ReactiveMutinyQueryExecutor<InventoryRecord,io.github.jklingsporn.qjre.schema.tables.pojos.Inventory,Integer>(configuration,delegate,io.github.jklingsporn.qjre.schema.tables.mappers.RowMappers.getInventoryMapper()));
        }

        @Override
        protected Integer getId(io.github.jklingsporn.qjre.schema.tables.pojos.Inventory object) {
                return object.getInventoryId();
        }

        /**
     * Find records that have <code>film_id IN (values)</code> asynchronously
     */
        public Uni<List<io.github.jklingsporn.qjre.schema.tables.pojos.Inventory>> findManyByFilmId(Collection<Short> values) {
                return findManyByCondition(Inventory.INVENTORY.FILM_ID.in(values));
        }

        /**
     * Find records that have <code>film_id IN (values)</code> asynchronously
     * limited by the given limit
     */
        public Uni<List<io.github.jklingsporn.qjre.schema.tables.pojos.Inventory>> findManyByFilmId(Collection<Short> values, int limit) {
                return findManyByCondition(Inventory.INVENTORY.FILM_ID.in(values),limit);
        }

        /**
     * Find records that have <code>store_id IN (values)</code> asynchronously
     */
        public Uni<List<io.github.jklingsporn.qjre.schema.tables.pojos.Inventory>> findManyByStoreId(Collection<Boolean> values) {
                return findManyByCondition(Inventory.INVENTORY.STORE_ID.in(values));
        }

        /**
     * Find records that have <code>store_id IN (values)</code> asynchronously
     * limited by the given limit
     */
        public Uni<List<io.github.jklingsporn.qjre.schema.tables.pojos.Inventory>> findManyByStoreId(Collection<Boolean> values, int limit) {
                return findManyByCondition(Inventory.INVENTORY.STORE_ID.in(values),limit);
        }

        /**
     * Find records that have <code>last_update IN (values)</code>
     * asynchronously
     */
        public Uni<List<io.github.jklingsporn.qjre.schema.tables.pojos.Inventory>> findManyByLastUpdate(Collection<LocalDateTime> values) {
                return findManyByCondition(Inventory.INVENTORY.LAST_UPDATE.in(values));
        }

        /**
     * Find records that have <code>last_update IN (values)</code>
     * asynchronously limited by the given limit
     */
        public Uni<List<io.github.jklingsporn.qjre.schema.tables.pojos.Inventory>> findManyByLastUpdate(Collection<LocalDateTime> values, int limit) {
                return findManyByCondition(Inventory.INVENTORY.LAST_UPDATE.in(values),limit);
        }

        @Override
        public ReactiveMutinyQueryExecutor<InventoryRecord,io.github.jklingsporn.qjre.schema.tables.pojos.Inventory,Integer> queryExecutor(){
                return (ReactiveMutinyQueryExecutor<InventoryRecord,io.github.jklingsporn.qjre.schema.tables.pojos.Inventory,Integer>) super.queryExecutor();
        }

        @Override
        protected java.util.function.Function<io.vertx.sqlclient.RowSet<io.vertx.sqlclient.Row>,Long> extractMysqlLastInsertProperty(){
                return rs -> rs.property(io.vertx.mysqlclient.MySQLClient.LAST_INSERTED_ID);
        }
}