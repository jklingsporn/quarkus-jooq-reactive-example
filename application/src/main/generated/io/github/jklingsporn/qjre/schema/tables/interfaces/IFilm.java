/*
 * This file is generated by jOOQ.
 */
package io.github.jklingsporn.qjre.schema.tables.interfaces;


import io.github.jklingsporn.qjre.schema.enums.FilmRating;
import io.github.jklingsporn.vertx.jooq.shared.internal.VertxPojo;

import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDateTime;


import static io.github.jklingsporn.vertx.jooq.shared.internal.VertxPojo.*;
/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public interface IFilm extends VertxPojo, Serializable {

    /**
     * Setter for <code>sakila.film.film_id</code>.
     */
    public IFilm setFilmId(Short value);

    /**
     * Getter for <code>sakila.film.film_id</code>.
     */
    public Short getFilmId();

    /**
     * Setter for <code>sakila.film.title</code>.
     */
    public IFilm setTitle(String value);

    /**
     * Getter for <code>sakila.film.title</code>.
     */
    public String getTitle();

    /**
     * Setter for <code>sakila.film.description</code>.
     */
    public IFilm setDescription(String value);

    /**
     * Getter for <code>sakila.film.description</code>.
     */
    public String getDescription();

    /**
     * Setter for <code>sakila.film.release_year</code>.
     */
    public IFilm setReleaseYear(Short value);

    /**
     * Getter for <code>sakila.film.release_year</code>.
     */
    public Short getReleaseYear();

    /**
     * Setter for <code>sakila.film.language_id</code>.
     */
    public IFilm setLanguageId(Boolean value);

    /**
     * Getter for <code>sakila.film.language_id</code>.
     */
    public Boolean getLanguageId();

    /**
     * Setter for <code>sakila.film.original_language_id</code>.
     */
    public IFilm setOriginalLanguageId(Boolean value);

    /**
     * Getter for <code>sakila.film.original_language_id</code>.
     */
    public Boolean getOriginalLanguageId();

    /**
     * Setter for <code>sakila.film.rental_duration</code>.
     */
    public IFilm setRentalDuration(Boolean value);

    /**
     * Getter for <code>sakila.film.rental_duration</code>.
     */
    public Boolean getRentalDuration();

    /**
     * Setter for <code>sakila.film.rental_rate</code>.
     */
    public IFilm setRentalRate(BigDecimal value);

    /**
     * Getter for <code>sakila.film.rental_rate</code>.
     */
    public BigDecimal getRentalRate();

    /**
     * Setter for <code>sakila.film.length</code>.
     */
    public IFilm setLength(Short value);

    /**
     * Getter for <code>sakila.film.length</code>.
     */
    public Short getLength();

    /**
     * Setter for <code>sakila.film.replacement_cost</code>.
     */
    public IFilm setReplacementCost(BigDecimal value);

    /**
     * Getter for <code>sakila.film.replacement_cost</code>.
     */
    public BigDecimal getReplacementCost();

    /**
     * Setter for <code>sakila.film.rating</code>.
     */
    public IFilm setRating(FilmRating value);

    /**
     * Getter for <code>sakila.film.rating</code>.
     */
    public FilmRating getRating();

    /**
     * Setter for <code>sakila.film.special_features</code>.
     */
    public IFilm setSpecialFeatures(String value);

    /**
     * Getter for <code>sakila.film.special_features</code>.
     */
    public String getSpecialFeatures();

    /**
     * Setter for <code>sakila.film.last_update</code>.
     */
    public IFilm setLastUpdate(LocalDateTime value);

    /**
     * Getter for <code>sakila.film.last_update</code>.
     */
    public LocalDateTime getLastUpdate();

    // -------------------------------------------------------------------------
    // FROM and INTO
    // -------------------------------------------------------------------------

    /**
     * Load data from another generated Record/POJO implementing the common
     * interface IFilm
     */
    public void from(IFilm from);

    /**
     * Copy data into another generated Record/POJO implementing the common
     * interface IFilm
     */
    public <E extends IFilm> E into(E into);

        @Override
        public default IFilm fromJson(io.vertx.core.json.JsonObject json) {
                setOrThrow(this::setFilmId,key -> {Integer i = json.getInteger(key); return i==null?null:i.shortValue();},"film_id","java.lang.Short");
                setOrThrow(this::setTitle,json::getString,"title","java.lang.String");
                setOrThrow(this::setDescription,json::getString,"description","java.lang.String");
                setOrThrow(this::setReleaseYear,key -> {Integer i = json.getInteger(key); return i==null?null:i.shortValue();},"release_year","java.lang.Short");
                setOrThrow(this::setLanguageId,json::getBoolean,"language_id","java.lang.Boolean");
                setOrThrow(this::setOriginalLanguageId,json::getBoolean,"original_language_id","java.lang.Boolean");
                setOrThrow(this::setRentalDuration,json::getBoolean,"rental_duration","java.lang.Boolean");
                setOrThrow(this::setRentalRate,key -> {String s = json.getString(key); return s==null?null:new java.math.BigDecimal(s);},"rental_rate","java.math.BigDecimal");
                setOrThrow(this::setLength,key -> {Integer i = json.getInteger(key); return i==null?null:i.shortValue();},"length","java.lang.Short");
                setOrThrow(this::setReplacementCost,key -> {String s = json.getString(key); return s==null?null:new java.math.BigDecimal(s);},"replacement_cost","java.math.BigDecimal");
                setOrThrow(this::setRating,key -> java.util.Arrays.stream(io.github.jklingsporn.qjre.schema.enums.FilmRating.values()).filter(td -> td.getLiteral().equals(json.getString(key))).findFirst().orElse(null),"rating","io.github.jklingsporn.qjre.schema.enums.FilmRating");
                setOrThrow(this::setSpecialFeatures,json::getString,"special_features","java.lang.String");
                setOrThrow(this::setLastUpdate,key -> {String s = json.getString(key); return s==null?null:java.time.LocalDateTime.parse(s);},"last_update","java.time.LocalDateTime");
                return this;
        }


        @Override
        public default io.vertx.core.json.JsonObject toJson() {
                io.vertx.core.json.JsonObject json = new io.vertx.core.json.JsonObject();
                json.put("film_id",getFilmId());
                json.put("title",getTitle());
                json.put("description",getDescription());
                json.put("release_year",getReleaseYear());
                json.put("language_id",getLanguageId());
                json.put("original_language_id",getOriginalLanguageId());
                json.put("rental_duration",getRentalDuration());
                json.put("rental_rate",getRentalRate()==null?null:getRentalRate().toString());
                json.put("length",getLength());
                json.put("replacement_cost",getReplacementCost()==null?null:getReplacementCost().toString());
                json.put("rating",getRating()==null?null:getRating().getLiteral());
                json.put("special_features",getSpecialFeatures());
                json.put("last_update",getLastUpdate()==null?null:getLastUpdate().toString());
                return json;
        }

}
