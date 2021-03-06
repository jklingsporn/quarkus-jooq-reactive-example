/*
 * This file is generated by jOOQ.
 */
package io.github.jklingsporn.qjre.schema.tables.records;


import io.github.jklingsporn.qjre.schema.tables.Customer;
import io.github.jklingsporn.qjre.schema.tables.interfaces.ICustomer;
import io.github.jklingsporn.vertx.jooq.shared.internal.VertxPojo;

import java.time.LocalDateTime;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record9;
import org.jooq.Row9;
import org.jooq.impl.UpdatableRecordImpl;


import static io.github.jklingsporn.vertx.jooq.shared.internal.VertxPojo.*;
/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class CustomerRecord extends UpdatableRecordImpl<CustomerRecord> implements VertxPojo, Record9<Short, Boolean, String, String, String, Short, Byte, LocalDateTime, LocalDateTime>, ICustomer {

    private static final long serialVersionUID = 1L;

    /**
     * Setter for <code>sakila.customer.customer_id</code>.
     */
    @Override
    public CustomerRecord setCustomerId(Short value) {
        set(0, value);
        return this;
    }

    /**
     * Getter for <code>sakila.customer.customer_id</code>.
     */
    @Override
    public Short getCustomerId() {
        return (Short) get(0);
    }

    /**
     * Setter for <code>sakila.customer.store_id</code>.
     */
    @Override
    public CustomerRecord setStoreId(Boolean value) {
        set(1, value);
        return this;
    }

    /**
     * Getter for <code>sakila.customer.store_id</code>.
     */
    @Override
    public Boolean getStoreId() {
        return (Boolean) get(1);
    }

    /**
     * Setter for <code>sakila.customer.first_name</code>.
     */
    @Override
    public CustomerRecord setFirstName(String value) {
        set(2, value);
        return this;
    }

    /**
     * Getter for <code>sakila.customer.first_name</code>.
     */
    @Override
    public String getFirstName() {
        return (String) get(2);
    }

    /**
     * Setter for <code>sakila.customer.last_name</code>.
     */
    @Override
    public CustomerRecord setLastName(String value) {
        set(3, value);
        return this;
    }

    /**
     * Getter for <code>sakila.customer.last_name</code>.
     */
    @Override
    public String getLastName() {
        return (String) get(3);
    }

    /**
     * Setter for <code>sakila.customer.email</code>.
     */
    @Override
    public CustomerRecord setEmail(String value) {
        set(4, value);
        return this;
    }

    /**
     * Getter for <code>sakila.customer.email</code>.
     */
    @Override
    public String getEmail() {
        return (String) get(4);
    }

    /**
     * Setter for <code>sakila.customer.address_id</code>.
     */
    @Override
    public CustomerRecord setAddressId(Short value) {
        set(5, value);
        return this;
    }

    /**
     * Getter for <code>sakila.customer.address_id</code>.
     */
    @Override
    public Short getAddressId() {
        return (Short) get(5);
    }

    /**
     * Setter for <code>sakila.customer.active</code>.
     */
    @Override
    public CustomerRecord setActive(Byte value) {
        set(6, value);
        return this;
    }

    /**
     * Getter for <code>sakila.customer.active</code>.
     */
    @Override
    public Byte getActive() {
        return (Byte) get(6);
    }

    /**
     * Setter for <code>sakila.customer.create_date</code>.
     */
    @Override
    public CustomerRecord setCreateDate(LocalDateTime value) {
        set(7, value);
        return this;
    }

    /**
     * Getter for <code>sakila.customer.create_date</code>.
     */
    @Override
    public LocalDateTime getCreateDate() {
        return (LocalDateTime) get(7);
    }

    /**
     * Setter for <code>sakila.customer.last_update</code>.
     */
    @Override
    public CustomerRecord setLastUpdate(LocalDateTime value) {
        set(8, value);
        return this;
    }

    /**
     * Getter for <code>sakila.customer.last_update</code>.
     */
    @Override
    public LocalDateTime getLastUpdate() {
        return (LocalDateTime) get(8);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    @Override
    public Record1<Short> key() {
        return (Record1) super.key();
    }

    // -------------------------------------------------------------------------
    // Record9 type implementation
    // -------------------------------------------------------------------------

    @Override
    public Row9<Short, Boolean, String, String, String, Short, Byte, LocalDateTime, LocalDateTime> fieldsRow() {
        return (Row9) super.fieldsRow();
    }

    @Override
    public Row9<Short, Boolean, String, String, String, Short, Byte, LocalDateTime, LocalDateTime> valuesRow() {
        return (Row9) super.valuesRow();
    }

    @Override
    public Field<Short> field1() {
        return Customer.CUSTOMER.CUSTOMER_ID;
    }

    @Override
    public Field<Boolean> field2() {
        return Customer.CUSTOMER.STORE_ID;
    }

    @Override
    public Field<String> field3() {
        return Customer.CUSTOMER.FIRST_NAME;
    }

    @Override
    public Field<String> field4() {
        return Customer.CUSTOMER.LAST_NAME;
    }

    @Override
    public Field<String> field5() {
        return Customer.CUSTOMER.EMAIL;
    }

    @Override
    public Field<Short> field6() {
        return Customer.CUSTOMER.ADDRESS_ID;
    }

    @Override
    public Field<Byte> field7() {
        return Customer.CUSTOMER.ACTIVE;
    }

    @Override
    public Field<LocalDateTime> field8() {
        return Customer.CUSTOMER.CREATE_DATE;
    }

    @Override
    public Field<LocalDateTime> field9() {
        return Customer.CUSTOMER.LAST_UPDATE;
    }

    @Override
    public Short component1() {
        return getCustomerId();
    }

    @Override
    public Boolean component2() {
        return getStoreId();
    }

    @Override
    public String component3() {
        return getFirstName();
    }

    @Override
    public String component4() {
        return getLastName();
    }

    @Override
    public String component5() {
        return getEmail();
    }

    @Override
    public Short component6() {
        return getAddressId();
    }

    @Override
    public Byte component7() {
        return getActive();
    }

    @Override
    public LocalDateTime component8() {
        return getCreateDate();
    }

    @Override
    public LocalDateTime component9() {
        return getLastUpdate();
    }

    @Override
    public Short value1() {
        return getCustomerId();
    }

    @Override
    public Boolean value2() {
        return getStoreId();
    }

    @Override
    public String value3() {
        return getFirstName();
    }

    @Override
    public String value4() {
        return getLastName();
    }

    @Override
    public String value5() {
        return getEmail();
    }

    @Override
    public Short value6() {
        return getAddressId();
    }

    @Override
    public Byte value7() {
        return getActive();
    }

    @Override
    public LocalDateTime value8() {
        return getCreateDate();
    }

    @Override
    public LocalDateTime value9() {
        return getLastUpdate();
    }

    @Override
    public CustomerRecord value1(Short value) {
        setCustomerId(value);
        return this;
    }

    @Override
    public CustomerRecord value2(Boolean value) {
        setStoreId(value);
        return this;
    }

    @Override
    public CustomerRecord value3(String value) {
        setFirstName(value);
        return this;
    }

    @Override
    public CustomerRecord value4(String value) {
        setLastName(value);
        return this;
    }

    @Override
    public CustomerRecord value5(String value) {
        setEmail(value);
        return this;
    }

    @Override
    public CustomerRecord value6(Short value) {
        setAddressId(value);
        return this;
    }

    @Override
    public CustomerRecord value7(Byte value) {
        setActive(value);
        return this;
    }

    @Override
    public CustomerRecord value8(LocalDateTime value) {
        setCreateDate(value);
        return this;
    }

    @Override
    public CustomerRecord value9(LocalDateTime value) {
        setLastUpdate(value);
        return this;
    }

    @Override
    public CustomerRecord values(Short value1, Boolean value2, String value3, String value4, String value5, Short value6, Byte value7, LocalDateTime value8, LocalDateTime value9) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        value5(value5);
        value6(value6);
        value7(value7);
        value8(value8);
        value9(value9);
        return this;
    }

    // -------------------------------------------------------------------------
    // FROM and INTO
    // -------------------------------------------------------------------------

    @Override
    public void from(ICustomer from) {
        setCustomerId(from.getCustomerId());
        setStoreId(from.getStoreId());
        setFirstName(from.getFirstName());
        setLastName(from.getLastName());
        setEmail(from.getEmail());
        setAddressId(from.getAddressId());
        setActive(from.getActive());
        setCreateDate(from.getCreateDate());
        setLastUpdate(from.getLastUpdate());
    }

    @Override
    public <E extends ICustomer> E into(E into) {
        into.from(this);
        return into;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached CustomerRecord
     */
    public CustomerRecord() {
        super(Customer.CUSTOMER);
    }

    /**
     * Create a detached, initialised CustomerRecord
     */
    public CustomerRecord(Short customerId, Boolean storeId, String firstName, String lastName, String email, Short addressId, Byte active, LocalDateTime createDate, LocalDateTime lastUpdate) {
        super(Customer.CUSTOMER);

        setCustomerId(customerId);
        setStoreId(storeId);
        setFirstName(firstName);
        setLastName(lastName);
        setEmail(email);
        setAddressId(addressId);
        setActive(active);
        setCreateDate(createDate);
        setLastUpdate(lastUpdate);
    }

    /**
     * Create a detached, initialised CustomerRecord
     */
    public CustomerRecord(io.github.jklingsporn.qjre.schema.tables.pojos.Customer value) {
        super(Customer.CUSTOMER);

        if (value != null) {
            setCustomerId(value.getCustomerId());
            setStoreId(value.getStoreId());
            setFirstName(value.getFirstName());
            setLastName(value.getLastName());
            setEmail(value.getEmail());
            setAddressId(value.getAddressId());
            setActive(value.getActive());
            setCreateDate(value.getCreateDate());
            setLastUpdate(value.getLastUpdate());
        }
    }

        public CustomerRecord(io.vertx.core.json.JsonObject json) {
                this();
                fromJson(json);
        }
}
