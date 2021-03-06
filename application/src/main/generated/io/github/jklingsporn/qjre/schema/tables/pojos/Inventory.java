/*
 * This file is generated by jOOQ.
 */
package io.github.jklingsporn.qjre.schema.tables.pojos;


import io.github.jklingsporn.qjre.schema.tables.interfaces.IInventory;
import io.github.jklingsporn.vertx.jooq.shared.internal.VertxPojo;

import java.time.LocalDateTime;


import static io.github.jklingsporn.vertx.jooq.shared.internal.VertxPojo.*;
/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Inventory implements VertxPojo, IInventory {

    private static final long serialVersionUID = 1L;

    private Integer       inventoryId;
    private Short         filmId;
    private Boolean       storeId;
    private LocalDateTime lastUpdate;

    public Inventory() {}

    public Inventory(IInventory value) {
        this.inventoryId = value.getInventoryId();
        this.filmId = value.getFilmId();
        this.storeId = value.getStoreId();
        this.lastUpdate = value.getLastUpdate();
    }

    public Inventory(
        Integer       inventoryId,
        Short         filmId,
        Boolean       storeId,
        LocalDateTime lastUpdate
    ) {
        this.inventoryId = inventoryId;
        this.filmId = filmId;
        this.storeId = storeId;
        this.lastUpdate = lastUpdate;
    }

        public Inventory(io.vertx.core.json.JsonObject json) {
                this();
                fromJson(json);
        }

    /**
     * Getter for <code>sakila.inventory.inventory_id</code>.
     */
    @Override
    public Integer getInventoryId() {
        return this.inventoryId;
    }

    /**
     * Setter for <code>sakila.inventory.inventory_id</code>.
     */
    @Override
    public Inventory setInventoryId(Integer inventoryId) {
        this.inventoryId = inventoryId;
        return this;
    }

    /**
     * Getter for <code>sakila.inventory.film_id</code>.
     */
    @Override
    public Short getFilmId() {
        return this.filmId;
    }

    /**
     * Setter for <code>sakila.inventory.film_id</code>.
     */
    @Override
    public Inventory setFilmId(Short filmId) {
        this.filmId = filmId;
        return this;
    }

    /**
     * Getter for <code>sakila.inventory.store_id</code>.
     */
    @Override
    public Boolean getStoreId() {
        return this.storeId;
    }

    /**
     * Setter for <code>sakila.inventory.store_id</code>.
     */
    @Override
    public Inventory setStoreId(Boolean storeId) {
        this.storeId = storeId;
        return this;
    }

    /**
     * Getter for <code>sakila.inventory.last_update</code>.
     */
    @Override
    public LocalDateTime getLastUpdate() {
        return this.lastUpdate;
    }

    /**
     * Setter for <code>sakila.inventory.last_update</code>.
     */
    @Override
    public Inventory setLastUpdate(LocalDateTime lastUpdate) {
        this.lastUpdate = lastUpdate;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("Inventory (");

        sb.append(inventoryId);
        sb.append(", ").append(filmId);
        sb.append(", ").append(storeId);
        sb.append(", ").append(lastUpdate);

        sb.append(")");
        return sb.toString();
    }

    // -------------------------------------------------------------------------
    // FROM and INTO
    // -------------------------------------------------------------------------

    @Override
    public void from(IInventory from) {
        setInventoryId(from.getInventoryId());
        setFilmId(from.getFilmId());
        setStoreId(from.getStoreId());
        setLastUpdate(from.getLastUpdate());
    }

    @Override
    public <E extends IInventory> E into(E into) {
        into.from(this);
        return into;
    }
}
