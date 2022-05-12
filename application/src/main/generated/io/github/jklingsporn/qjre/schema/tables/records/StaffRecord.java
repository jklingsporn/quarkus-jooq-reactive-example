/*
 * This file is generated by jOOQ.
 */
package io.github.jklingsporn.qjre.schema.tables.records;


import io.github.jklingsporn.qjre.schema.tables.Staff;
import io.github.jklingsporn.qjre.schema.tables.interfaces.IStaff;
import io.github.jklingsporn.vertx.jooq.shared.internal.VertxPojo;

import java.time.LocalDateTime;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record11;
import org.jooq.Row11;
import org.jooq.impl.UpdatableRecordImpl;


import static io.github.jklingsporn.vertx.jooq.shared.internal.VertxPojo.*;
/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class StaffRecord extends UpdatableRecordImpl<StaffRecord> implements VertxPojo, Record11<Boolean, String, String, Short, byte[], String, Boolean, Byte, String, String, LocalDateTime>, IStaff {

    private static final long serialVersionUID = 1L;

    /**
     * Setter for <code>sakila.staff.staff_id</code>.
     */
    @Override
    public StaffRecord setStaffId(Boolean value) {
        set(0, value);
        return this;
    }

    /**
     * Getter for <code>sakila.staff.staff_id</code>.
     */
    @Override
    public Boolean getStaffId() {
        return (Boolean) get(0);
    }

    /**
     * Setter for <code>sakila.staff.first_name</code>.
     */
    @Override
    public StaffRecord setFirstName(String value) {
        set(1, value);
        return this;
    }

    /**
     * Getter for <code>sakila.staff.first_name</code>.
     */
    @Override
    public String getFirstName() {
        return (String) get(1);
    }

    /**
     * Setter for <code>sakila.staff.last_name</code>.
     */
    @Override
    public StaffRecord setLastName(String value) {
        set(2, value);
        return this;
    }

    /**
     * Getter for <code>sakila.staff.last_name</code>.
     */
    @Override
    public String getLastName() {
        return (String) get(2);
    }

    /**
     * Setter for <code>sakila.staff.address_id</code>.
     */
    @Override
    public StaffRecord setAddressId(Short value) {
        set(3, value);
        return this;
    }

    /**
     * Getter for <code>sakila.staff.address_id</code>.
     */
    @Override
    public Short getAddressId() {
        return (Short) get(3);
    }

    /**
     * Setter for <code>sakila.staff.picture</code>.
     */
    @Override
    public StaffRecord setPicture(byte[] value) {
        set(4, value);
        return this;
    }

    /**
     * Getter for <code>sakila.staff.picture</code>.
     */
    @Override
    public byte[] getPicture() {
        return (byte[]) get(4);
    }

    /**
     * Setter for <code>sakila.staff.email</code>.
     */
    @Override
    public StaffRecord setEmail(String value) {
        set(5, value);
        return this;
    }

    /**
     * Getter for <code>sakila.staff.email</code>.
     */
    @Override
    public String getEmail() {
        return (String) get(5);
    }

    /**
     * Setter for <code>sakila.staff.store_id</code>.
     */
    @Override
    public StaffRecord setStoreId(Boolean value) {
        set(6, value);
        return this;
    }

    /**
     * Getter for <code>sakila.staff.store_id</code>.
     */
    @Override
    public Boolean getStoreId() {
        return (Boolean) get(6);
    }

    /**
     * Setter for <code>sakila.staff.active</code>.
     */
    @Override
    public StaffRecord setActive(Byte value) {
        set(7, value);
        return this;
    }

    /**
     * Getter for <code>sakila.staff.active</code>.
     */
    @Override
    public Byte getActive() {
        return (Byte) get(7);
    }

    /**
     * Setter for <code>sakila.staff.username</code>.
     */
    @Override
    public StaffRecord setUsername(String value) {
        set(8, value);
        return this;
    }

    /**
     * Getter for <code>sakila.staff.username</code>.
     */
    @Override
    public String getUsername() {
        return (String) get(8);
    }

    /**
     * Setter for <code>sakila.staff.password</code>.
     */
    @Override
    public StaffRecord setPassword(String value) {
        set(9, value);
        return this;
    }

    /**
     * Getter for <code>sakila.staff.password</code>.
     */
    @Override
    public String getPassword() {
        return (String) get(9);
    }

    /**
     * Setter for <code>sakila.staff.last_update</code>.
     */
    @Override
    public StaffRecord setLastUpdate(LocalDateTime value) {
        set(10, value);
        return this;
    }

    /**
     * Getter for <code>sakila.staff.last_update</code>.
     */
    @Override
    public LocalDateTime getLastUpdate() {
        return (LocalDateTime) get(10);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    @Override
    public Record1<Boolean> key() {
        return (Record1) super.key();
    }

    // -------------------------------------------------------------------------
    // Record11 type implementation
    // -------------------------------------------------------------------------

    @Override
    public Row11<Boolean, String, String, Short, byte[], String, Boolean, Byte, String, String, LocalDateTime> fieldsRow() {
        return (Row11) super.fieldsRow();
    }

    @Override
    public Row11<Boolean, String, String, Short, byte[], String, Boolean, Byte, String, String, LocalDateTime> valuesRow() {
        return (Row11) super.valuesRow();
    }

    @Override
    public Field<Boolean> field1() {
        return Staff.STAFF.STAFF_ID;
    }

    @Override
    public Field<String> field2() {
        return Staff.STAFF.FIRST_NAME;
    }

    @Override
    public Field<String> field3() {
        return Staff.STAFF.LAST_NAME;
    }

    @Override
    public Field<Short> field4() {
        return Staff.STAFF.ADDRESS_ID;
    }

    @Override
    public Field<byte[]> field5() {
        return Staff.STAFF.PICTURE;
    }

    @Override
    public Field<String> field6() {
        return Staff.STAFF.EMAIL;
    }

    @Override
    public Field<Boolean> field7() {
        return Staff.STAFF.STORE_ID;
    }

    @Override
    public Field<Byte> field8() {
        return Staff.STAFF.ACTIVE;
    }

    @Override
    public Field<String> field9() {
        return Staff.STAFF.USERNAME;
    }

    @Override
    public Field<String> field10() {
        return Staff.STAFF.PASSWORD;
    }

    @Override
    public Field<LocalDateTime> field11() {
        return Staff.STAFF.LAST_UPDATE;
    }

    @Override
    public Boolean component1() {
        return getStaffId();
    }

    @Override
    public String component2() {
        return getFirstName();
    }

    @Override
    public String component3() {
        return getLastName();
    }

    @Override
    public Short component4() {
        return getAddressId();
    }

    @Override
    public byte[] component5() {
        return getPicture();
    }

    @Override
    public String component6() {
        return getEmail();
    }

    @Override
    public Boolean component7() {
        return getStoreId();
    }

    @Override
    public Byte component8() {
        return getActive();
    }

    @Override
    public String component9() {
        return getUsername();
    }

    @Override
    public String component10() {
        return getPassword();
    }

    @Override
    public LocalDateTime component11() {
        return getLastUpdate();
    }

    @Override
    public Boolean value1() {
        return getStaffId();
    }

    @Override
    public String value2() {
        return getFirstName();
    }

    @Override
    public String value3() {
        return getLastName();
    }

    @Override
    public Short value4() {
        return getAddressId();
    }

    @Override
    public byte[] value5() {
        return getPicture();
    }

    @Override
    public String value6() {
        return getEmail();
    }

    @Override
    public Boolean value7() {
        return getStoreId();
    }

    @Override
    public Byte value8() {
        return getActive();
    }

    @Override
    public String value9() {
        return getUsername();
    }

    @Override
    public String value10() {
        return getPassword();
    }

    @Override
    public LocalDateTime value11() {
        return getLastUpdate();
    }

    @Override
    public StaffRecord value1(Boolean value) {
        setStaffId(value);
        return this;
    }

    @Override
    public StaffRecord value2(String value) {
        setFirstName(value);
        return this;
    }

    @Override
    public StaffRecord value3(String value) {
        setLastName(value);
        return this;
    }

    @Override
    public StaffRecord value4(Short value) {
        setAddressId(value);
        return this;
    }

    @Override
    public StaffRecord value5(byte[] value) {
        setPicture(value);
        return this;
    }

    @Override
    public StaffRecord value6(String value) {
        setEmail(value);
        return this;
    }

    @Override
    public StaffRecord value7(Boolean value) {
        setStoreId(value);
        return this;
    }

    @Override
    public StaffRecord value8(Byte value) {
        setActive(value);
        return this;
    }

    @Override
    public StaffRecord value9(String value) {
        setUsername(value);
        return this;
    }

    @Override
    public StaffRecord value10(String value) {
        setPassword(value);
        return this;
    }

    @Override
    public StaffRecord value11(LocalDateTime value) {
        setLastUpdate(value);
        return this;
    }

    @Override
    public StaffRecord values(Boolean value1, String value2, String value3, Short value4, byte[] value5, String value6, Boolean value7, Byte value8, String value9, String value10, LocalDateTime value11) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        value5(value5);
        value6(value6);
        value7(value7);
        value8(value8);
        value9(value9);
        value10(value10);
        value11(value11);
        return this;
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

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached StaffRecord
     */
    public StaffRecord() {
        super(Staff.STAFF);
    }

    /**
     * Create a detached, initialised StaffRecord
     */
    public StaffRecord(Boolean staffId, String firstName, String lastName, Short addressId, byte[] picture, String email, Boolean storeId, Byte active, String username, String password, LocalDateTime lastUpdate) {
        super(Staff.STAFF);

        setStaffId(staffId);
        setFirstName(firstName);
        setLastName(lastName);
        setAddressId(addressId);
        setPicture(picture);
        setEmail(email);
        setStoreId(storeId);
        setActive(active);
        setUsername(username);
        setPassword(password);
        setLastUpdate(lastUpdate);
    }

    /**
     * Create a detached, initialised StaffRecord
     */
    public StaffRecord(io.github.jklingsporn.qjre.schema.tables.pojos.Staff value) {
        super(Staff.STAFF);

        if (value != null) {
            setStaffId(value.getStaffId());
            setFirstName(value.getFirstName());
            setLastName(value.getLastName());
            setAddressId(value.getAddressId());
            setPicture(value.getPicture());
            setEmail(value.getEmail());
            setStoreId(value.getStoreId());
            setActive(value.getActive());
            setUsername(value.getUsername());
            setPassword(value.getPassword());
            setLastUpdate(value.getLastUpdate());
        }
    }

        public StaffRecord(io.vertx.core.json.JsonObject json) {
                this();
                fromJson(json);
        }
}