/*
 * This file is generated by jOOQ.
 */
package io.github.jklingsporn.qjre.schema.tables.records;


import io.github.jklingsporn.qjre.schema.tables.FilmActor;
import io.github.jklingsporn.qjre.schema.tables.interfaces.IFilmActor;
import io.github.jklingsporn.vertx.jooq.shared.internal.VertxPojo;

import java.time.LocalDateTime;

import org.jooq.Field;
import org.jooq.Record2;
import org.jooq.Record3;
import org.jooq.Row3;
import org.jooq.impl.UpdatableRecordImpl;


import static io.github.jklingsporn.vertx.jooq.shared.internal.VertxPojo.*;
/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class FilmActorRecord extends UpdatableRecordImpl<FilmActorRecord> implements VertxPojo, Record3<Short, Short, LocalDateTime>, IFilmActor {

    private static final long serialVersionUID = 1L;

    /**
     * Setter for <code>sakila.film_actor.actor_id</code>.
     */
    @Override
    public FilmActorRecord setActorId(Short value) {
        set(0, value);
        return this;
    }

    /**
     * Getter for <code>sakila.film_actor.actor_id</code>.
     */
    @Override
    public Short getActorId() {
        return (Short) get(0);
    }

    /**
     * Setter for <code>sakila.film_actor.film_id</code>.
     */
    @Override
    public FilmActorRecord setFilmId(Short value) {
        set(1, value);
        return this;
    }

    /**
     * Getter for <code>sakila.film_actor.film_id</code>.
     */
    @Override
    public Short getFilmId() {
        return (Short) get(1);
    }

    /**
     * Setter for <code>sakila.film_actor.last_update</code>.
     */
    @Override
    public FilmActorRecord setLastUpdate(LocalDateTime value) {
        set(2, value);
        return this;
    }

    /**
     * Getter for <code>sakila.film_actor.last_update</code>.
     */
    @Override
    public LocalDateTime getLastUpdate() {
        return (LocalDateTime) get(2);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    @Override
    public Record2<Short, Short> key() {
        return (Record2) super.key();
    }

    // -------------------------------------------------------------------------
    // Record3 type implementation
    // -------------------------------------------------------------------------

    @Override
    public Row3<Short, Short, LocalDateTime> fieldsRow() {
        return (Row3) super.fieldsRow();
    }

    @Override
    public Row3<Short, Short, LocalDateTime> valuesRow() {
        return (Row3) super.valuesRow();
    }

    @Override
    public Field<Short> field1() {
        return FilmActor.FILM_ACTOR.ACTOR_ID;
    }

    @Override
    public Field<Short> field2() {
        return FilmActor.FILM_ACTOR.FILM_ID;
    }

    @Override
    public Field<LocalDateTime> field3() {
        return FilmActor.FILM_ACTOR.LAST_UPDATE;
    }

    @Override
    public Short component1() {
        return getActorId();
    }

    @Override
    public Short component2() {
        return getFilmId();
    }

    @Override
    public LocalDateTime component3() {
        return getLastUpdate();
    }

    @Override
    public Short value1() {
        return getActorId();
    }

    @Override
    public Short value2() {
        return getFilmId();
    }

    @Override
    public LocalDateTime value3() {
        return getLastUpdate();
    }

    @Override
    public FilmActorRecord value1(Short value) {
        setActorId(value);
        return this;
    }

    @Override
    public FilmActorRecord value2(Short value) {
        setFilmId(value);
        return this;
    }

    @Override
    public FilmActorRecord value3(LocalDateTime value) {
        setLastUpdate(value);
        return this;
    }

    @Override
    public FilmActorRecord values(Short value1, Short value2, LocalDateTime value3) {
        value1(value1);
        value2(value2);
        value3(value3);
        return this;
    }

    // -------------------------------------------------------------------------
    // FROM and INTO
    // -------------------------------------------------------------------------

    @Override
    public void from(IFilmActor from) {
        setActorId(from.getActorId());
        setFilmId(from.getFilmId());
        setLastUpdate(from.getLastUpdate());
    }

    @Override
    public <E extends IFilmActor> E into(E into) {
        into.from(this);
        return into;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached FilmActorRecord
     */
    public FilmActorRecord() {
        super(FilmActor.FILM_ACTOR);
    }

    /**
     * Create a detached, initialised FilmActorRecord
     */
    public FilmActorRecord(Short actorId, Short filmId, LocalDateTime lastUpdate) {
        super(FilmActor.FILM_ACTOR);

        setActorId(actorId);
        setFilmId(filmId);
        setLastUpdate(lastUpdate);
    }

    /**
     * Create a detached, initialised FilmActorRecord
     */
    public FilmActorRecord(io.github.jklingsporn.qjre.schema.tables.pojos.FilmActor value) {
        super(FilmActor.FILM_ACTOR);

        if (value != null) {
            setActorId(value.getActorId());
            setFilmId(value.getFilmId());
            setLastUpdate(value.getLastUpdate());
        }
    }

        public FilmActorRecord(io.vertx.core.json.JsonObject json) {
                this();
                fromJson(json);
        }
}
