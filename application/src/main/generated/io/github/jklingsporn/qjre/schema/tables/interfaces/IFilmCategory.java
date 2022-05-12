/*
 * This file is generated by jOOQ.
 */
package io.github.jklingsporn.qjre.schema.tables.interfaces;


import io.github.jklingsporn.vertx.jooq.shared.internal.VertxPojo;

import java.io.Serializable;
import java.time.LocalDateTime;


import static io.github.jklingsporn.vertx.jooq.shared.internal.VertxPojo.*;
/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public interface IFilmCategory extends VertxPojo, Serializable {

    /**
     * Setter for <code>sakila.film_category.film_id</code>.
     */
    public IFilmCategory setFilmId(Short value);

    /**
     * Getter for <code>sakila.film_category.film_id</code>.
     */
    public Short getFilmId();

    /**
     * Setter for <code>sakila.film_category.category_id</code>.
     */
    public IFilmCategory setCategoryId(Boolean value);

    /**
     * Getter for <code>sakila.film_category.category_id</code>.
     */
    public Boolean getCategoryId();

    /**
     * Setter for <code>sakila.film_category.last_update</code>.
     */
    public IFilmCategory setLastUpdate(LocalDateTime value);

    /**
     * Getter for <code>sakila.film_category.last_update</code>.
     */
    public LocalDateTime getLastUpdate();

    // -------------------------------------------------------------------------
    // FROM and INTO
    // -------------------------------------------------------------------------

    /**
     * Load data from another generated Record/POJO implementing the common
     * interface IFilmCategory
     */
    public void from(IFilmCategory from);

    /**
     * Copy data into another generated Record/POJO implementing the common
     * interface IFilmCategory
     */
    public <E extends IFilmCategory> E into(E into);

        @Override
        public default IFilmCategory fromJson(io.vertx.core.json.JsonObject json) {
                setOrThrow(this::setFilmId,key -> {Integer i = json.getInteger(key); return i==null?null:i.shortValue();},"film_id","java.lang.Short");
                setOrThrow(this::setCategoryId,json::getBoolean,"category_id","java.lang.Boolean");
                setOrThrow(this::setLastUpdate,key -> {String s = json.getString(key); return s==null?null:java.time.LocalDateTime.parse(s);},"last_update","java.time.LocalDateTime");
                return this;
        }


        @Override
        public default io.vertx.core.json.JsonObject toJson() {
                io.vertx.core.json.JsonObject json = new io.vertx.core.json.JsonObject();
                json.put("film_id",getFilmId());
                json.put("category_id",getCategoryId());
                json.put("last_update",getLastUpdate()==null?null:getLastUpdate().toString());
                return json;
        }

}
