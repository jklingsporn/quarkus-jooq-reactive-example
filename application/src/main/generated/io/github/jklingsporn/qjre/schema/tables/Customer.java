/*
 * This file is generated by jOOQ.
 */
package io.github.jklingsporn.qjre.schema.tables;


import io.github.jklingsporn.qjre.schema.Indexes;
import io.github.jklingsporn.qjre.schema.Keys;
import io.github.jklingsporn.qjre.schema.Sakila;
import io.github.jklingsporn.qjre.schema.tables.records.CustomerRecord;

import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.List;

import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Identity;
import org.jooq.Index;
import org.jooq.Name;
import org.jooq.Record;
import org.jooq.Row9;
import org.jooq.Schema;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.TableOptions;
import org.jooq.UniqueKey;
import org.jooq.impl.DSL;
import org.jooq.impl.SQLDataType;
import org.jooq.impl.TableImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Customer extends TableImpl<CustomerRecord> {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of <code>sakila.customer</code>
     */
    public static final Customer CUSTOMER = new Customer();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<CustomerRecord> getRecordType() {
        return CustomerRecord.class;
    }

    /**
     * The column <code>sakila.customer.customer_id</code>.
     */
    public final TableField<CustomerRecord, Short> CUSTOMER_ID = createField(DSL.name("customer_id"), SQLDataType.SMALLINT.nullable(false).identity(true), this, "");

    /**
     * The column <code>sakila.customer.store_id</code>.
     */
    public final TableField<CustomerRecord, Boolean> STORE_ID = createField(DSL.name("store_id"), SQLDataType.BOOLEAN.nullable(false), this, "");

    /**
     * The column <code>sakila.customer.first_name</code>.
     */
    public final TableField<CustomerRecord, String> FIRST_NAME = createField(DSL.name("first_name"), SQLDataType.VARCHAR(45).nullable(false), this, "");

    /**
     * The column <code>sakila.customer.last_name</code>.
     */
    public final TableField<CustomerRecord, String> LAST_NAME = createField(DSL.name("last_name"), SQLDataType.VARCHAR(45).nullable(false), this, "");

    /**
     * The column <code>sakila.customer.email</code>.
     */
    public final TableField<CustomerRecord, String> EMAIL = createField(DSL.name("email"), SQLDataType.VARCHAR(50), this, "");

    /**
     * The column <code>sakila.customer.address_id</code>.
     */
    public final TableField<CustomerRecord, Short> ADDRESS_ID = createField(DSL.name("address_id"), SQLDataType.SMALLINT.nullable(false), this, "");

    /**
     * The column <code>sakila.customer.active</code>.
     */
    public final TableField<CustomerRecord, Byte> ACTIVE = createField(DSL.name("active"), SQLDataType.TINYINT.nullable(false).defaultValue(DSL.inline("1", SQLDataType.TINYINT)), this, "");

    /**
     * The column <code>sakila.customer.create_date</code>.
     */
    public final TableField<CustomerRecord, LocalDateTime> CREATE_DATE = createField(DSL.name("create_date"), SQLDataType.LOCALDATETIME(0).nullable(false), this, "");

    /**
     * The column <code>sakila.customer.last_update</code>.
     */
    public final TableField<CustomerRecord, LocalDateTime> LAST_UPDATE = createField(DSL.name("last_update"), SQLDataType.LOCALDATETIME(0), this, "");

    private Customer(Name alias, Table<CustomerRecord> aliased) {
        this(alias, aliased, null);
    }

    private Customer(Name alias, Table<CustomerRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.table());
    }

    /**
     * Create an aliased <code>sakila.customer</code> table reference
     */
    public Customer(String alias) {
        this(DSL.name(alias), CUSTOMER);
    }

    /**
     * Create an aliased <code>sakila.customer</code> table reference
     */
    public Customer(Name alias) {
        this(alias, CUSTOMER);
    }

    /**
     * Create a <code>sakila.customer</code> table reference
     */
    public Customer() {
        this(DSL.name("customer"), null);
    }

    public <O extends Record> Customer(Table<O> child, ForeignKey<O, CustomerRecord> key) {
        super(child, key, CUSTOMER);
    }

    @Override
    public Schema getSchema() {
        return aliased() ? null : Sakila.SAKILA;
    }

    @Override
    public List<Index> getIndexes() {
        return Arrays.asList(Indexes.CUSTOMER_IDX_FK_ADDRESS_ID, Indexes.CUSTOMER_IDX_FK_STORE_ID, Indexes.CUSTOMER_IDX_LAST_NAME);
    }

    @Override
    public Identity<CustomerRecord, Short> getIdentity() {
        return (Identity<CustomerRecord, Short>) super.getIdentity();
    }

    @Override
    public UniqueKey<CustomerRecord> getPrimaryKey() {
        return Keys.KEY_CUSTOMER_PRIMARY;
    }

    @Override
    public List<ForeignKey<CustomerRecord, ?>> getReferences() {
        return Arrays.asList(Keys.FK_CUSTOMER_STORE, Keys.FK_CUSTOMER_ADDRESS);
    }

    private transient Store _store;
    private transient Address _address;

    /**
     * Get the implicit join path to the <code>sakila.store</code> table.
     */
    public Store store() {
        if (_store == null)
            _store = new Store(this, Keys.FK_CUSTOMER_STORE);

        return _store;
    }

    /**
     * Get the implicit join path to the <code>sakila.address</code> table.
     */
    public Address address() {
        if (_address == null)
            _address = new Address(this, Keys.FK_CUSTOMER_ADDRESS);

        return _address;
    }

    @Override
    public Customer as(String alias) {
        return new Customer(DSL.name(alias), this);
    }

    @Override
    public Customer as(Name alias) {
        return new Customer(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public Customer rename(String name) {
        return new Customer(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public Customer rename(Name name) {
        return new Customer(name, null);
    }

    // -------------------------------------------------------------------------
    // Row9 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row9<Short, Boolean, String, String, String, Short, Byte, LocalDateTime, LocalDateTime> fieldsRow() {
        return (Row9) super.fieldsRow();
    }
}
