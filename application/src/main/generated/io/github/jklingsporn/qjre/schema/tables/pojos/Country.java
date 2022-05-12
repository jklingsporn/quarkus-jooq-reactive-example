/*
 * This file is generated by jOOQ.
 */
package io.github.jklingsporn.qjre.schema.tables.pojos;


import io.github.jklingsporn.qjre.schema.tables.interfaces.ICountry;
import io.github.jklingsporn.vertx.jooq.shared.internal.VertxPojo;

import java.time.LocalDateTime;


import static io.github.jklingsporn.vertx.jooq.shared.internal.VertxPojo.*;
/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Country implements VertxPojo, ICountry {

    private static final long serialVersionUID = 1L;

    private Short         countryId;
    private String        country;
    private LocalDateTime lastUpdate;

    public Country() {}

    public Country(ICountry value) {
        this.countryId = value.getCountryId();
        this.country = value.getCountry();
        this.lastUpdate = value.getLastUpdate();
    }

    public Country(
        Short         countryId,
        String        country,
        LocalDateTime lastUpdate
    ) {
        this.countryId = countryId;
        this.country = country;
        this.lastUpdate = lastUpdate;
    }

        public Country(io.vertx.core.json.JsonObject json) {
                this();
                fromJson(json);
        }

    /**
     * Getter for <code>sakila.country.country_id</code>.
     */
    @Override
    public Short getCountryId() {
        return this.countryId;
    }

    /**
     * Setter for <code>sakila.country.country_id</code>.
     */
    @Override
    public Country setCountryId(Short countryId) {
        this.countryId = countryId;
        return this;
    }

    /**
     * Getter for <code>sakila.country.country</code>.
     */
    @Override
    public String getCountry() {
        return this.country;
    }

    /**
     * Setter for <code>sakila.country.country</code>.
     */
    @Override
    public Country setCountry(String country) {
        this.country = country;
        return this;
    }

    /**
     * Getter for <code>sakila.country.last_update</code>.
     */
    @Override
    public LocalDateTime getLastUpdate() {
        return this.lastUpdate;
    }

    /**
     * Setter for <code>sakila.country.last_update</code>.
     */
    @Override
    public Country setLastUpdate(LocalDateTime lastUpdate) {
        this.lastUpdate = lastUpdate;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("Country (");

        sb.append(countryId);
        sb.append(", ").append(country);
        sb.append(", ").append(lastUpdate);

        sb.append(")");
        return sb.toString();
    }

    // -------------------------------------------------------------------------
    // FROM and INTO
    // -------------------------------------------------------------------------

    @Override
    public void from(ICountry from) {
        setCountryId(from.getCountryId());
        setCountry(from.getCountry());
        setLastUpdate(from.getLastUpdate());
    }

    @Override
    public <E extends ICountry> E into(E into) {
        into.from(this);
        return into;
    }
}