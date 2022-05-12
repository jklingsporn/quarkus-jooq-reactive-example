/*
 * This file is generated by jOOQ.
 */
package io.github.jklingsporn.qjre.schema.tables.pojos;


import io.github.jklingsporn.qjre.schema.enums.NicerButSlowerFilmListRating;
import io.github.jklingsporn.qjre.schema.tables.interfaces.INicerButSlowerFilmList;
import io.github.jklingsporn.vertx.jooq.shared.internal.VertxPojo;

import java.math.BigDecimal;


import static io.github.jklingsporn.vertx.jooq.shared.internal.VertxPojo.*;
/**
 * VIEW
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class NicerButSlowerFilmList implements VertxPojo, INicerButSlowerFilmList {

    private static final long serialVersionUID = 1L;

    private Short                        fid;
    private String                       title;
    private String                       description;
    private String                       category;
    private BigDecimal                   price;
    private Short                        length;
    private NicerButSlowerFilmListRating rating;
    private String                       actors;

    public NicerButSlowerFilmList() {}

    public NicerButSlowerFilmList(INicerButSlowerFilmList value) {
        this.fid = value.getFid();
        this.title = value.getTitle();
        this.description = value.getDescription();
        this.category = value.getCategory();
        this.price = value.getPrice();
        this.length = value.getLength();
        this.rating = value.getRating();
        this.actors = value.getActors();
    }

    public NicerButSlowerFilmList(
        Short                        fid,
        String                       title,
        String                       description,
        String                       category,
        BigDecimal                   price,
        Short                        length,
        NicerButSlowerFilmListRating rating,
        String                       actors
    ) {
        this.fid = fid;
        this.title = title;
        this.description = description;
        this.category = category;
        this.price = price;
        this.length = length;
        this.rating = rating;
        this.actors = actors;
    }

        public NicerButSlowerFilmList(io.vertx.core.json.JsonObject json) {
                this();
                fromJson(json);
        }

    /**
     * Getter for <code>sakila.nicer_but_slower_film_list.FID</code>.
     */
    @Override
    public Short getFid() {
        return this.fid;
    }

    /**
     * Setter for <code>sakila.nicer_but_slower_film_list.FID</code>.
     */
    @Override
    public NicerButSlowerFilmList setFid(Short fid) {
        this.fid = fid;
        return this;
    }

    /**
     * Getter for <code>sakila.nicer_but_slower_film_list.title</code>.
     */
    @Override
    public String getTitle() {
        return this.title;
    }

    /**
     * Setter for <code>sakila.nicer_but_slower_film_list.title</code>.
     */
    @Override
    public NicerButSlowerFilmList setTitle(String title) {
        this.title = title;
        return this;
    }

    /**
     * Getter for <code>sakila.nicer_but_slower_film_list.description</code>.
     */
    @Override
    public String getDescription() {
        return this.description;
    }

    /**
     * Setter for <code>sakila.nicer_but_slower_film_list.description</code>.
     */
    @Override
    public NicerButSlowerFilmList setDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * Getter for <code>sakila.nicer_but_slower_film_list.category</code>.
     */
    @Override
    public String getCategory() {
        return this.category;
    }

    /**
     * Setter for <code>sakila.nicer_but_slower_film_list.category</code>.
     */
    @Override
    public NicerButSlowerFilmList setCategory(String category) {
        this.category = category;
        return this;
    }

    /**
     * Getter for <code>sakila.nicer_but_slower_film_list.price</code>.
     */
    @Override
    public BigDecimal getPrice() {
        return this.price;
    }

    /**
     * Setter for <code>sakila.nicer_but_slower_film_list.price</code>.
     */
    @Override
    public NicerButSlowerFilmList setPrice(BigDecimal price) {
        this.price = price;
        return this;
    }

    /**
     * Getter for <code>sakila.nicer_but_slower_film_list.length</code>.
     */
    @Override
    public Short getLength() {
        return this.length;
    }

    /**
     * Setter for <code>sakila.nicer_but_slower_film_list.length</code>.
     */
    @Override
    public NicerButSlowerFilmList setLength(Short length) {
        this.length = length;
        return this;
    }

    /**
     * Getter for <code>sakila.nicer_but_slower_film_list.rating</code>.
     */
    @Override
    public NicerButSlowerFilmListRating getRating() {
        return this.rating;
    }

    /**
     * Setter for <code>sakila.nicer_but_slower_film_list.rating</code>.
     */
    @Override
    public NicerButSlowerFilmList setRating(NicerButSlowerFilmListRating rating) {
        this.rating = rating;
        return this;
    }

    /**
     * Getter for <code>sakila.nicer_but_slower_film_list.actors</code>.
     */
    @Override
    public String getActors() {
        return this.actors;
    }

    /**
     * Setter for <code>sakila.nicer_but_slower_film_list.actors</code>.
     */
    @Override
    public NicerButSlowerFilmList setActors(String actors) {
        this.actors = actors;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("NicerButSlowerFilmList (");

        sb.append(fid);
        sb.append(", ").append(title);
        sb.append(", ").append(description);
        sb.append(", ").append(category);
        sb.append(", ").append(price);
        sb.append(", ").append(length);
        sb.append(", ").append(rating);
        sb.append(", ").append(actors);

        sb.append(")");
        return sb.toString();
    }

    // -------------------------------------------------------------------------
    // FROM and INTO
    // -------------------------------------------------------------------------

    @Override
    public void from(INicerButSlowerFilmList from) {
        setFid(from.getFid());
        setTitle(from.getTitle());
        setDescription(from.getDescription());
        setCategory(from.getCategory());
        setPrice(from.getPrice());
        setLength(from.getLength());
        setRating(from.getRating());
        setActors(from.getActors());
    }

    @Override
    public <E extends INicerButSlowerFilmList> E into(E into) {
        into.from(this);
        return into;
    }
}
