/*
 * This file is generated by jOOQ.
 */
package io.github.jklingsporn.qjre.schema.tables.pojos;


import io.github.jklingsporn.qjre.schema.tables.interfaces.IFilmActor;
import io.github.jklingsporn.vertx.jooq.shared.internal.VertxPojo;

import java.time.LocalDateTime;


import static io.github.jklingsporn.vertx.jooq.shared.internal.VertxPojo.*;
/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class FilmActor implements VertxPojo, IFilmActor {

    private static final long serialVersionUID = 1L;

    private Short         actorId;
    private Short         filmId;
    private LocalDateTime lastUpdate;

    public FilmActor() {}

    public FilmActor(IFilmActor value) {
        this.actorId = value.getActorId();
        this.filmId = value.getFilmId();
        this.lastUpdate = value.getLastUpdate();
    }

    public FilmActor(
        Short         actorId,
        Short         filmId,
        LocalDateTime lastUpdate
    ) {
        this.actorId = actorId;
        this.filmId = filmId;
        this.lastUpdate = lastUpdate;
    }

        public FilmActor(io.vertx.core.json.JsonObject json) {
                this();
                fromJson(json);
        }

    /**
     * Getter for <code>sakila.film_actor.actor_id</code>.
     */
    @Override
    public Short getActorId() {
        return this.actorId;
    }

    /**
     * Setter for <code>sakila.film_actor.actor_id</code>.
     */
    @Override
    public FilmActor setActorId(Short actorId) {
        this.actorId = actorId;
        return this;
    }

    /**
     * Getter for <code>sakila.film_actor.film_id</code>.
     */
    @Override
    public Short getFilmId() {
        return this.filmId;
    }

    /**
     * Setter for <code>sakila.film_actor.film_id</code>.
     */
    @Override
    public FilmActor setFilmId(Short filmId) {
        this.filmId = filmId;
        return this;
    }

    /**
     * Getter for <code>sakila.film_actor.last_update</code>.
     */
    @Override
    public LocalDateTime getLastUpdate() {
        return this.lastUpdate;
    }

    /**
     * Setter for <code>sakila.film_actor.last_update</code>.
     */
    @Override
    public FilmActor setLastUpdate(LocalDateTime lastUpdate) {
        this.lastUpdate = lastUpdate;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("FilmActor (");

        sb.append(actorId);
        sb.append(", ").append(filmId);
        sb.append(", ").append(lastUpdate);

        sb.append(")");
        return sb.toString();
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
}