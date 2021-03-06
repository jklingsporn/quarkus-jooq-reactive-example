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
public interface IFilmActor extends VertxPojo, Serializable {

    /**
     * Setter for <code>sakila.film_actor.actor_id</code>.
     */
    public IFilmActor setActorId(Short value);

    /**
     * Getter for <code>sakila.film_actor.actor_id</code>.
     */
    public Short getActorId();

    /**
     * Setter for <code>sakila.film_actor.film_id</code>.
     */
    public IFilmActor setFilmId(Short value);

    /**
     * Getter for <code>sakila.film_actor.film_id</code>.
     */
    public Short getFilmId();

    /**
     * Setter for <code>sakila.film_actor.last_update</code>.
     */
    public IFilmActor setLastUpdate(LocalDateTime value);

    /**
     * Getter for <code>sakila.film_actor.last_update</code>.
     */
    public LocalDateTime getLastUpdate();

    // -------------------------------------------------------------------------
    // FROM and INTO
    // -------------------------------------------------------------------------

    /**
     * Load data from another generated Record/POJO implementing the common
     * interface IFilmActor
     */
    public void from(IFilmActor from);

    /**
     * Copy data into another generated Record/POJO implementing the common
     * interface IFilmActor
     */
    public <E extends IFilmActor> E into(E into);

        @Override
        public default IFilmActor fromJson(io.vertx.core.json.JsonObject json) {
                setOrThrow(this::setActorId,key -> {Integer i = json.getInteger(key); return i==null?null:i.shortValue();},"actor_id","java.lang.Short");
                setOrThrow(this::setFilmId,key -> {Integer i = json.getInteger(key); return i==null?null:i.shortValue();},"film_id","java.lang.Short");
                setOrThrow(this::setLastUpdate,key -> {String s = json.getString(key); return s==null?null:java.time.LocalDateTime.parse(s);},"last_update","java.time.LocalDateTime");
                return this;
        }


        @Override
        public default io.vertx.core.json.JsonObject toJson() {
                io.vertx.core.json.JsonObject json = new io.vertx.core.json.JsonObject();
                json.put("actor_id",getActorId());
                json.put("film_id",getFilmId());
                json.put("last_update",getLastUpdate()==null?null:getLastUpdate().toString());
                return json;
        }

}
