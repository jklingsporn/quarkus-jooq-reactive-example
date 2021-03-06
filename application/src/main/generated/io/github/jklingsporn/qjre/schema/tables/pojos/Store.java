/*
 * This file is generated by jOOQ.
 */
package io.github.jklingsporn.qjre.schema.tables.pojos;


import io.github.jklingsporn.qjre.schema.tables.interfaces.IStore;
import io.github.jklingsporn.vertx.jooq.shared.internal.VertxPojo;

import java.time.LocalDateTime;


import static io.github.jklingsporn.vertx.jooq.shared.internal.VertxPojo.*;
/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Store implements VertxPojo, IStore {

    private static final long serialVersionUID = 1L;

    private Boolean       storeId;
    private Boolean       managerStaffId;
    private Short         addressId;
    private LocalDateTime lastUpdate;

    public Store() {}

    public Store(IStore value) {
        this.storeId = value.getStoreId();
        this.managerStaffId = value.getManagerStaffId();
        this.addressId = value.getAddressId();
        this.lastUpdate = value.getLastUpdate();
    }

    public Store(
        Boolean       storeId,
        Boolean       managerStaffId,
        Short         addressId,
        LocalDateTime lastUpdate
    ) {
        this.storeId = storeId;
        this.managerStaffId = managerStaffId;
        this.addressId = addressId;
        this.lastUpdate = lastUpdate;
    }

        public Store(io.vertx.core.json.JsonObject json) {
                this();
                fromJson(json);
        }

    /**
     * Getter for <code>sakila.store.store_id</code>.
     */
    @Override
    public Boolean getStoreId() {
        return this.storeId;
    }

    /**
     * Setter for <code>sakila.store.store_id</code>.
     */
    @Override
    public Store setStoreId(Boolean storeId) {
        this.storeId = storeId;
        return this;
    }

    /**
     * Getter for <code>sakila.store.manager_staff_id</code>.
     */
    @Override
    public Boolean getManagerStaffId() {
        return this.managerStaffId;
    }

    /**
     * Setter for <code>sakila.store.manager_staff_id</code>.
     */
    @Override
    public Store setManagerStaffId(Boolean managerStaffId) {
        this.managerStaffId = managerStaffId;
        return this;
    }

    /**
     * Getter for <code>sakila.store.address_id</code>.
     */
    @Override
    public Short getAddressId() {
        return this.addressId;
    }

    /**
     * Setter for <code>sakila.store.address_id</code>.
     */
    @Override
    public Store setAddressId(Short addressId) {
        this.addressId = addressId;
        return this;
    }

    /**
     * Getter for <code>sakila.store.last_update</code>.
     */
    @Override
    public LocalDateTime getLastUpdate() {
        return this.lastUpdate;
    }

    /**
     * Setter for <code>sakila.store.last_update</code>.
     */
    @Override
    public Store setLastUpdate(LocalDateTime lastUpdate) {
        this.lastUpdate = lastUpdate;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("Store (");

        sb.append(storeId);
        sb.append(", ").append(managerStaffId);
        sb.append(", ").append(addressId);
        sb.append(", ").append(lastUpdate);

        sb.append(")");
        return sb.toString();
    }

    // -------------------------------------------------------------------------
    // FROM and INTO
    // -------------------------------------------------------------------------

    @Override
    public void from(IStore from) {
        setStoreId(from.getStoreId());
        setManagerStaffId(from.getManagerStaffId());
        setAddressId(from.getAddressId());
        setLastUpdate(from.getLastUpdate());
    }

    @Override
    public <E extends IStore> E into(E into) {
        into.from(this);
        return into;
    }
}
