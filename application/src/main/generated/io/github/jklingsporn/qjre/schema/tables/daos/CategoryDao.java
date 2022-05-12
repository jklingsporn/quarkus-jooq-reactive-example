/*
 * This file is generated by jOOQ.
 */
package io.github.jklingsporn.qjre.schema.tables.daos;


import io.github.jklingsporn.qjre.schema.tables.Category;
import io.github.jklingsporn.qjre.schema.tables.records.CategoryRecord;
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
public class CategoryDao extends AbstractReactiveVertxDAO<CategoryRecord, io.github.jklingsporn.qjre.schema.tables.pojos.Category, Boolean, Uni<List<io.github.jklingsporn.qjre.schema.tables.pojos.Category>>, Uni<io.github.jklingsporn.qjre.schema.tables.pojos.Category>, Uni<Integer>, Uni<Boolean>> implements io.github.jklingsporn.vertx.jooq.mutiny.VertxDAO<CategoryRecord,io.github.jklingsporn.qjre.schema.tables.pojos.Category,Boolean> {
        @javax.inject.Inject

        /**
     * @param configuration The Configuration used for rendering and query
     * execution.
     * @param vertx the vertx instance
     */
        public CategoryDao(Configuration configuration, io.vertx.mutiny.sqlclient.SqlClient delegate) {
                super(Category.CATEGORY, io.github.jklingsporn.qjre.schema.tables.pojos.Category.class, new ReactiveMutinyQueryExecutor<CategoryRecord,io.github.jklingsporn.qjre.schema.tables.pojos.Category,Boolean>(configuration,delegate,io.github.jklingsporn.qjre.schema.tables.mappers.RowMappers.getCategoryMapper()));
        }

        @Override
        protected Boolean getId(io.github.jklingsporn.qjre.schema.tables.pojos.Category object) {
                return object.getCategoryId();
        }

        /**
     * Find records that have <code>name IN (values)</code> asynchronously
     */
        public Uni<List<io.github.jklingsporn.qjre.schema.tables.pojos.Category>> findManyByName(Collection<String> values) {
                return findManyByCondition(Category.CATEGORY.NAME.in(values));
        }

        /**
     * Find records that have <code>name IN (values)</code> asynchronously
     * limited by the given limit
     */
        public Uni<List<io.github.jklingsporn.qjre.schema.tables.pojos.Category>> findManyByName(Collection<String> values, int limit) {
                return findManyByCondition(Category.CATEGORY.NAME.in(values),limit);
        }

        /**
     * Find records that have <code>last_update IN (values)</code>
     * asynchronously
     */
        public Uni<List<io.github.jklingsporn.qjre.schema.tables.pojos.Category>> findManyByLastUpdate(Collection<LocalDateTime> values) {
                return findManyByCondition(Category.CATEGORY.LAST_UPDATE.in(values));
        }

        /**
     * Find records that have <code>last_update IN (values)</code>
     * asynchronously limited by the given limit
     */
        public Uni<List<io.github.jklingsporn.qjre.schema.tables.pojos.Category>> findManyByLastUpdate(Collection<LocalDateTime> values, int limit) {
                return findManyByCondition(Category.CATEGORY.LAST_UPDATE.in(values),limit);
        }

        @Override
        public ReactiveMutinyQueryExecutor<CategoryRecord,io.github.jklingsporn.qjre.schema.tables.pojos.Category,Boolean> queryExecutor(){
                return (ReactiveMutinyQueryExecutor<CategoryRecord,io.github.jklingsporn.qjre.schema.tables.pojos.Category,Boolean>) super.queryExecutor();
        }

        @Override
        protected java.util.function.Function<io.vertx.sqlclient.RowSet<io.vertx.sqlclient.Row>,Long> extractMysqlLastInsertProperty(){
                return rs -> rs.property(io.vertx.mysqlclient.MySQLClient.LAST_INSERTED_ID);
        }
}
