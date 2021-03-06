/*
 * This file is generated by jOOQ.
 */
package io.github.jklingsporn.qjre.schema.tables.pojos;


import io.github.jklingsporn.qjre.schema.tables.interfaces.IStaff;
import io.github.jklingsporn.vertx.jooq.shared.internal.VertxPojo;

import java.time.LocalDateTime;


import static io.github.jklingsporn.vertx.jooq.shared.internal.VertxPojo.*;
/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Staff implements VertxPojo, IStaff {

    private static final long serialVersionUID = 1L;

    private Boolean       staffId;
    private String        firstName;
    private String        lastName;
    private Short         addressId;
    private byte[]        picture;
    private String        email;
    private Boolean       storeId;
    private Byte          active;
    private String        username;
    private String        password;
    private LocalDateTime lastUpdate;

    public Staff() {}

    public Staff(IStaff value) {
        this.staffId = value.getStaffId();
        this.firstName = value.getFirstName();
        this.lastName = value.getLastName();
        this.addressId = value.getAddressId();
        this.picture = value.getPicture();
        this.email = value.getEmail();
        this.storeId = value.getStoreId();
        this.active = value.getActive();
        this.username = value.getUsername();
        this.password = value.getPassword();
        this.lastUpdate = value.getLastUpdate();
    }

    public Staff(
        Boolean       staffId,
        String        firstName,
        String        lastName,
        Short         addressId,
        byte[]        picture,
        String        email,
        Boolean       storeId,
        Byte          active,
        String        username,
        String        password,
        LocalDateTime lastUpdate
    ) {
        this.staffId = staffId;
        this.firstName = firstName;
        this.lastName = lastName;
        this.addressId = addressId;
        this.picture = picture;
        this.email = email;
        this.storeId = storeId;
        this.active = active;
        this.username = username;
        this.password = password;
        this.lastUpdate = lastUpdate;
    }

        public Staff(io.vertx.core.json.JsonObject json) {
                this();
                fromJson(json);
        }

    /**
     * Getter for <code>sakila.staff.staff_id</code>.
     */
    @Override
    public Boolean getStaffId() {
        return this.staffId;
    }

    /**
     * Setter for <code>sakila.staff.staff_id</code>.
     */
    @Override
    public Staff setStaffId(Boolean staffId) {
        this.staffId = staffId;
        return this;
    }

    /**
     * Getter for <code>sakila.staff.first_name</code>.
     */
    @Override
    public String getFirstName() {
        return this.firstName;
    }

    /**
     * Setter for <code>sakila.staff.first_name</code>.
     */
    @Override
    public Staff setFirstName(String firstName) {
        this.firstName = firstName;
        return this;
    }

    /**
     * Getter for <code>sakila.staff.last_name</code>.
     */
    @Override
    public String getLastName() {
        return this.lastName;
    }

    /**
     * Setter for <code>sakila.staff.last_name</code>.
     */
    @Override
    public Staff setLastName(String lastName) {
        this.lastName = lastName;
        return this;
    }

    /**
     * Getter for <code>sakila.staff.address_id</code>.
     */
    @Override
    public Short getAddressId() {
        return this.addressId;
    }

    /**
     * Setter for <code>sakila.staff.address_id</code>.
     */
    @Override
    public Staff setAddressId(Short addressId) {
        this.addressId = addressId;
        return this;
    }

    /**
     * Getter for <code>sakila.staff.picture</code>.
     */
    @Override
    public byte[] getPicture() {
        return this.picture;
    }

    /**
     * Setter for <code>sakila.staff.picture</code>.
     */
    @Override
    public Staff setPicture(byte[] picture) {
        this.picture = picture;
        return this;
    }

    /**
     * Getter for <code>sakila.staff.email</code>.
     */
    @Override
    public String getEmail() {
        return this.email;
    }

    /**
     * Setter for <code>sakila.staff.email</code>.
     */
    @Override
    public Staff setEmail(String email) {
        this.email = email;
        return this;
    }

    /**
     * Getter for <code>sakila.staff.store_id</code>.
     */
    @Override
    public Boolean getStoreId() {
        return this.storeId;
    }

    /**
     * Setter for <code>sakila.staff.store_id</code>.
     */
    @Override
    public Staff setStoreId(Boolean storeId) {
        this.storeId = storeId;
        return this;
    }

    /**
     * Getter for <code>sakila.staff.active</code>.
     */
    @Override
    public Byte getActive() {
        return this.active;
    }

    /**
     * Setter for <code>sakila.staff.active</code>.
     */
    @Override
    public Staff setActive(Byte active) {
        this.active = active;
        return this;
    }

    /**
     * Getter for <code>sakila.staff.username</code>.
     */
    @Override
    public String getUsername() {
        return this.username;
    }

    /**
     * Setter for <code>sakila.staff.username</code>.
     */
    @Override
    public Staff setUsername(String username) {
        this.username = username;
        return this;
    }

    /**
     * Getter for <code>sakila.staff.password</code>.
     */
    @Override
    public String getPassword() {
        return this.password;
    }

    /**
     * Setter for <code>sakila.staff.password</code>.
     */
    @Override
    public Staff setPassword(String password) {
        this.password = password;
        return this;
    }

    /**
     * Getter for <code>sakila.staff.last_update</code>.
     */
    @Override
    public LocalDateTime getLastUpdate() {
        return this.lastUpdate;
    }

    /**
     * Setter for <code>sakila.staff.last_update</code>.
     */
    @Override
    public Staff setLastUpdate(LocalDateTime lastUpdate) {
        this.lastUpdate = lastUpdate;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("Staff (");

        sb.append(staffId);
        sb.append(", ").append(firstName);
        sb.append(", ").append(lastName);
        sb.append(", ").append(addressId);
        sb.append(", ").append("[binary...]");
        sb.append(", ").append(email);
        sb.append(", ").append(storeId);
        sb.append(", ").append(active);
        sb.append(", ").append(username);
        sb.append(", ").append(password);
        sb.append(", ").append(lastUpdate);

        sb.append(")");
        return sb.toString();
    }

    // -------------------------------------------------------------------------
    // FROM and INTO
    // -------------------------------------------------------------------------

    @Override
    public void from(IStaff from) {
        setStaffId(from.getStaffId());
        setFirstName(from.getFirstName());
        setLastName(from.getLastName());
        setAddressId(from.getAddressId());
        setPicture(from.getPicture());
        setEmail(from.getEmail());
        setStoreId(from.getStoreId());
        setActive(from.getActive());
        setUsername(from.getUsername());
        setPassword(from.getPassword());
        setLastUpdate(from.getLastUpdate());
    }

    @Override
    public <E extends IStaff> E into(E into) {
        into.from(this);
        return into;
    }
}
