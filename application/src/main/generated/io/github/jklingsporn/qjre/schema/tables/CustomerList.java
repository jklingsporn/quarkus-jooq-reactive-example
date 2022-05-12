/*
 * This file is generated by jOOQ.
 */
package io.github.jklingsporn.qjre.schema.tables;


import io.github.jklingsporn.qjre.schema.Sakila;
import io.github.jklingsporn.qjre.schema.tables.records.CustomerListRecord;

import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Name;
import org.jooq.Record;
import org.jooq.Row9;
import org.jooq.Schema;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.TableOptions;
import org.jooq.impl.DSL;
import org.jooq.impl.SQLDataType;
import org.jooq.impl.TableImpl;


/**
 * VIEW
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class CustomerList extends TableImpl<CustomerListRecord> {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of <code>sakila.customer_list</code>
     */
    public static final CustomerList CUSTOMER_LIST = new CustomerList();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<CustomerListRecord> getRecordType() {
        return CustomerListRecord.class;
    }

    /**
     * The column <code>sakila.customer_list.ID</code>.
     */
    public final TableField<CustomerListRecord, Short> ID = createField(DSL.name("ID"), SQLDataType.SMALLINT.nullable(false).defaultValue(DSL.inline("0", SQLDataType.SMALLINT)), this, "");

    /**
     * The column <code>sakila.customer_list.name</code>.
     */
    public final TableField<CustomerListRecord, String> NAME = createField(DSL.name("name"), SQLDataType.VARCHAR(91), this, "");

    /**
     * The column <code>sakila.customer_list.address</code>.
     */
    public final TableField<CustomerListRecord, String> ADDRESS = createField(DSL.name("address"), SQLDataType.VARCHAR(50).nullable(false), this, "");

    /**
     * The column <code>sakila.customer_list.zip code</code>.
     */
    public final TableField<CustomerListRecord, String> ZIP_CODE = createField(DSL.name("zip code"), SQLDataType.VARCHAR(10), this, "");

    /**
     * The column <code>sakila.customer_list.phone</code>.
     */
    public final TableField<CustomerListRecord, String> PHONE = createField(DSL.name("phone"), SQLDataType.VARCHAR(20).nullable(false), this, "");

    /**
     * The column <code>sakila.customer_list.city</code>.
     */
    public final TableField<CustomerListRecord, String> CITY = createField(DSL.name("city"), SQLDataType.VARCHAR(50).nullable(false), this, "");

    /**
     * The column <code>sakila.customer_list.country</code>.
     */
    public final TableField<CustomerListRecord, String> COUNTRY = createField(DSL.name("country"), SQLDataType.VARCHAR(50).nullable(false), this, "");

    /**
     * The column <code>sakila.customer_list.notes</code>.
     */
    public final TableField<CustomerListRecord, String> NOTES = createField(DSL.name("notes"), SQLDataType.VARCHAR(6).nullable(false).defaultValue(DSL.inline("", SQLDataType.VARCHAR)), this, "");

    /**
     * The column <code>sakila.customer_list.SID</code>.
     */
    public final TableField<CustomerListRecord, Boolean> SID = createField(DSL.name("SID"), SQLDataType.BOOLEAN.nullable(false), this, "");

    private CustomerList(Name alias, Table<CustomerListRecord> aliased) {
        this(alias, aliased, null);
    }

    private CustomerList(Name alias, Table<CustomerListRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment("VIEW"), TableOptions.view("create view `customer_list` as select `cu`.`customer_id` AS `ID`,concat(`cu`.`first_name`,' ',`cu`.`last_name`) AS `name`,`a`.`address` AS `address`,`a`.`postal_code` AS `zip code`,`a`.`phone` AS `phone`,`sakila`.`city`.`city` AS `city`,`sakila`.`country`.`country` AS `country`,if(`cu`.`active`,'active','') AS `notes`,`cu`.`store_id` AS `SID` from (((`sakila`.`customer` `cu` join `sakila`.`address` `a` on((`cu`.`address_id` = `a`.`address_id`))) join `sakila`.`city` on((`a`.`city_id` = `sakila`.`city`.`city_id`))) join `sakila`.`country` on((`sakila`.`city`.`country_id` = `sakila`.`country`.`country_id`)))"));
    }

    /**
     * Create an aliased <code>sakila.customer_list</code> table reference
     */
    public CustomerList(String alias) {
        this(DSL.name(alias), CUSTOMER_LIST);
    }

    /**
     * Create an aliased <code>sakila.customer_list</code> table reference
     */
    public CustomerList(Name alias) {
        this(alias, CUSTOMER_LIST);
    }

    /**
     * Create a <code>sakila.customer_list</code> table reference
     */
    public CustomerList() {
        this(DSL.name("customer_list"), null);
    }

    public <O extends Record> CustomerList(Table<O> child, ForeignKey<O, CustomerListRecord> key) {
        super(child, key, CUSTOMER_LIST);
    }

    @Override
    public Schema getSchema() {
        return aliased() ? null : Sakila.SAKILA;
    }

    @Override
    public CustomerList as(String alias) {
        return new CustomerList(DSL.name(alias), this);
    }

    @Override
    public CustomerList as(Name alias) {
        return new CustomerList(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public CustomerList rename(String name) {
        return new CustomerList(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public CustomerList rename(Name name) {
        return new CustomerList(name, null);
    }

    // -------------------------------------------------------------------------
    // Row9 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row9<Short, String, String, String, String, String, String, String, Boolean> fieldsRow() {
        return (Row9) super.fieldsRow();
    }
}