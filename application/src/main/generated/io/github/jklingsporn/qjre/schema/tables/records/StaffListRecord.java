/*
 * This file is generated by jOOQ.
 */
package io.github.jklingsporn.qjre.schema.tables.records;


import io.github.jklingsporn.qjre.schema.tables.StaffList;
import io.github.jklingsporn.qjre.schema.tables.interfaces.IStaffList;
import io.github.jklingsporn.vertx.jooq.shared.internal.VertxPojo;

import org.jooq.Field;
import org.jooq.Record8;
import org.jooq.Row8;
import org.jooq.impl.TableRecordImpl;


import static io.github.jklingsporn.vertx.jooq.shared.internal.VertxPojo.*;
/**
 * VIEW
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class StaffListRecord extends TableRecordImpl<StaffListRecord> implements VertxPojo, Record8<Boolean, String, String, String, String, String, String, Boolean>, IStaffList {

    private static final long serialVersionUID = 1L;

    /**
     * Setter for <code>sakila.staff_list.ID</code>.
     */
    @Override
    public StaffListRecord setId(Boolean value) {
        set(0, value);
        return this;
    }

    /**
     * Getter for <code>sakila.staff_list.ID</code>.
     */
    @Override
    public Boolean getId() {
        return (Boolean) get(0);
    }

    /**
     * Setter for <code>sakila.staff_list.name</code>.
     */
    @Override
    public StaffListRecord setName(String value) {
        set(1, value);
        return this;
    }

    /**
     * Getter for <code>sakila.staff_list.name</code>.
     */
    @Override
    public String getName() {
        return (String) get(1);
    }

    /**
     * Setter for <code>sakila.staff_list.address</code>.
     */
    @Override
    public StaffListRecord setAddress(String value) {
        set(2, value);
        return this;
    }

    /**
     * Getter for <code>sakila.staff_list.address</code>.
     */
    @Override
    public String getAddress() {
        return (String) get(2);
    }

    /**
     * Setter for <code>sakila.staff_list.zip code</code>.
     */
    @Override
    public StaffListRecord setZipCode(String value) {
        set(3, value);
        return this;
    }

    /**
     * Getter for <code>sakila.staff_list.zip code</code>.
     */
    @Override
    public String getZipCode() {
        return (String) get(3);
    }

    /**
     * Setter for <code>sakila.staff_list.phone</code>.
     */
    @Override
    public StaffListRecord setPhone(String value) {
        set(4, value);
        return this;
    }

    /**
     * Getter for <code>sakila.staff_list.phone</code>.
     */
    @Override
    public String getPhone() {
        return (String) get(4);
    }

    /**
     * Setter for <code>sakila.staff_list.city</code>.
     */
    @Override
    public StaffListRecord setCity(String value) {
        set(5, value);
        return this;
    }

    /**
     * Getter for <code>sakila.staff_list.city</code>.
     */
    @Override
    public String getCity() {
        return (String) get(5);
    }

    /**
     * Setter for <code>sakila.staff_list.country</code>.
     */
    @Override
    public StaffListRecord setCountry(String value) {
        set(6, value);
        return this;
    }

    /**
     * Getter for <code>sakila.staff_list.country</code>.
     */
    @Override
    public String getCountry() {
        return (String) get(6);
    }

    /**
     * Setter for <code>sakila.staff_list.SID</code>.
     */
    @Override
    public StaffListRecord setSid(Boolean value) {
        set(7, value);
        return this;
    }

    /**
     * Getter for <code>sakila.staff_list.SID</code>.
     */
    @Override
    public Boolean getSid() {
        return (Boolean) get(7);
    }

    // -------------------------------------------------------------------------
    // Record8 type implementation
    // -------------------------------------------------------------------------

    @Override
    public Row8<Boolean, String, String, String, String, String, String, Boolean> fieldsRow() {
        return (Row8) super.fieldsRow();
    }

    @Override
    public Row8<Boolean, String, String, String, String, String, String, Boolean> valuesRow() {
        return (Row8) super.valuesRow();
    }

    @Override
    public Field<Boolean> field1() {
        return StaffList.STAFF_LIST.ID;
    }

    @Override
    public Field<String> field2() {
        return StaffList.STAFF_LIST.NAME;
    }

    @Override
    public Field<String> field3() {
        return StaffList.STAFF_LIST.ADDRESS;
    }

    @Override
    public Field<String> field4() {
        return StaffList.STAFF_LIST.ZIP_CODE;
    }

    @Override
    public Field<String> field5() {
        return StaffList.STAFF_LIST.PHONE;
    }

    @Override
    public Field<String> field6() {
        return StaffList.STAFF_LIST.CITY;
    }

    @Override
    public Field<String> field7() {
        return StaffList.STAFF_LIST.COUNTRY;
    }

    @Override
    public Field<Boolean> field8() {
        return StaffList.STAFF_LIST.SID;
    }

    @Override
    public Boolean component1() {
        return getId();
    }

    @Override
    public String component2() {
        return getName();
    }

    @Override
    public String component3() {
        return getAddress();
    }

    @Override
    public String component4() {
        return getZipCode();
    }

    @Override
    public String component5() {
        return getPhone();
    }

    @Override
    public String component6() {
        return getCity();
    }

    @Override
    public String component7() {
        return getCountry();
    }

    @Override
    public Boolean component8() {
        return getSid();
    }

    @Override
    public Boolean value1() {
        return getId();
    }

    @Override
    public String value2() {
        return getName();
    }

    @Override
    public String value3() {
        return getAddress();
    }

    @Override
    public String value4() {
        return getZipCode();
    }

    @Override
    public String value5() {
        return getPhone();
    }

    @Override
    public String value6() {
        return getCity();
    }

    @Override
    public String value7() {
        return getCountry();
    }

    @Override
    public Boolean value8() {
        return getSid();
    }

    @Override
    public StaffListRecord value1(Boolean value) {
        setId(value);
        return this;
    }

    @Override
    public StaffListRecord value2(String value) {
        setName(value);
        return this;
    }

    @Override
    public StaffListRecord value3(String value) {
        setAddress(value);
        return this;
    }

    @Override
    public StaffListRecord value4(String value) {
        setZipCode(value);
        return this;
    }

    @Override
    public StaffListRecord value5(String value) {
        setPhone(value);
        return this;
    }

    @Override
    public StaffListRecord value6(String value) {
        setCity(value);
        return this;
    }

    @Override
    public StaffListRecord value7(String value) {
        setCountry(value);
        return this;
    }

    @Override
    public StaffListRecord value8(Boolean value) {
        setSid(value);
        return this;
    }

    @Override
    public StaffListRecord values(Boolean value1, String value2, String value3, String value4, String value5, String value6, String value7, Boolean value8) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        value5(value5);
        value6(value6);
        value7(value7);
        value8(value8);
        return this;
    }

    // -------------------------------------------------------------------------
    // FROM and INTO
    // -------------------------------------------------------------------------

    @Override
    public void from(IStaffList from) {
        setId(from.getId());
        setName(from.getName());
        setAddress(from.getAddress());
        setZipCode(from.getZipCode());
        setPhone(from.getPhone());
        setCity(from.getCity());
        setCountry(from.getCountry());
        setSid(from.getSid());
    }

    @Override
    public <E extends IStaffList> E into(E into) {
        into.from(this);
        return into;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached StaffListRecord
     */
    public StaffListRecord() {
        super(StaffList.STAFF_LIST);
    }

    /**
     * Create a detached, initialised StaffListRecord
     */
    public StaffListRecord(Boolean id, String name, String address, String zipCode, String phone, String city, String country, Boolean sid) {
        super(StaffList.STAFF_LIST);

        setId(id);
        setName(name);
        setAddress(address);
        setZipCode(zipCode);
        setPhone(phone);
        setCity(city);
        setCountry(country);
        setSid(sid);
    }

    /**
     * Create a detached, initialised StaffListRecord
     */
    public StaffListRecord(io.github.jklingsporn.qjre.schema.tables.pojos.StaffList value) {
        super(StaffList.STAFF_LIST);

        if (value != null) {
            setId(value.getId());
            setName(value.getName());
            setAddress(value.getAddress());
            setZipCode(value.getZipCode());
            setPhone(value.getPhone());
            setCity(value.getCity());
            setCountry(value.getCountry());
            setSid(value.getSid());
        }
    }

        public StaffListRecord(io.vertx.core.json.JsonObject json) {
                this();
                fromJson(json);
        }
}