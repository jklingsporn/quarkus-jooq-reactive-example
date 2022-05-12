/*
 * This file is generated by jOOQ.
 */
package io.github.jklingsporn.qjre.schema.tables;


import io.github.jklingsporn.qjre.schema.Sakila;
import io.github.jklingsporn.qjre.schema.tables.records.StaffListRecord;

import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Name;
import org.jooq.Record;
import org.jooq.Row8;
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
public class StaffList extends TableImpl<StaffListRecord> {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of <code>sakila.staff_list</code>
     */
    public static final StaffList STAFF_LIST = new StaffList();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<StaffListRecord> getRecordType() {
        return StaffListRecord.class;
    }

    /**
     * The column <code>sakila.staff_list.ID</code>.
     */
    public final TableField<StaffListRecord, Boolean> ID = createField(DSL.name("ID"), SQLDataType.BOOLEAN.nullable(false).defaultValue(DSL.inline("0", SQLDataType.BOOLEAN)), this, "");

    /**
     * The column <code>sakila.staff_list.name</code>.
     */
    public final TableField<StaffListRecord, String> NAME = createField(DSL.name("name"), SQLDataType.VARCHAR(91), this, "");

    /**
     * The column <code>sakila.staff_list.address</code>.
     */
    public final TableField<StaffListRecord, String> ADDRESS = createField(DSL.name("address"), SQLDataType.VARCHAR(50).nullable(false), this, "");

    /**
     * The column <code>sakila.staff_list.zip code</code>.
     */
    public final TableField<StaffListRecord, String> ZIP_CODE = createField(DSL.name("zip code"), SQLDataType.VARCHAR(10), this, "");

    /**
     * The column <code>sakila.staff_list.phone</code>.
     */
    public final TableField<StaffListRecord, String> PHONE = createField(DSL.name("phone"), SQLDataType.VARCHAR(20).nullable(false), this, "");

    /**
     * The column <code>sakila.staff_list.city</code>.
     */
    public final TableField<StaffListRecord, String> CITY = createField(DSL.name("city"), SQLDataType.VARCHAR(50).nullable(false), this, "");

    /**
     * The column <code>sakila.staff_list.country</code>.
     */
    public final TableField<StaffListRecord, String> COUNTRY = createField(DSL.name("country"), SQLDataType.VARCHAR(50).nullable(false), this, "");

    /**
     * The column <code>sakila.staff_list.SID</code>.
     */
    public final TableField<StaffListRecord, Boolean> SID = createField(DSL.name("SID"), SQLDataType.BOOLEAN.nullable(false), this, "");

    private StaffList(Name alias, Table<StaffListRecord> aliased) {
        this(alias, aliased, null);
    }

    private StaffList(Name alias, Table<StaffListRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment("VIEW"), TableOptions.view("create view `staff_list` as select `s`.`staff_id` AS `ID`,concat(`s`.`first_name`,' ',`s`.`last_name`) AS `name`,`a`.`address` AS `address`,`a`.`postal_code` AS `zip code`,`a`.`phone` AS `phone`,`sakila`.`city`.`city` AS `city`,`sakila`.`country`.`country` AS `country`,`s`.`store_id` AS `SID` from (((`sakila`.`staff` `s` join `sakila`.`address` `a` on((`s`.`address_id` = `a`.`address_id`))) join `sakila`.`city` on((`a`.`city_id` = `sakila`.`city`.`city_id`))) join `sakila`.`country` on((`sakila`.`city`.`country_id` = `sakila`.`country`.`country_id`)))"));
    }

    /**
     * Create an aliased <code>sakila.staff_list</code> table reference
     */
    public StaffList(String alias) {
        this(DSL.name(alias), STAFF_LIST);
    }

    /**
     * Create an aliased <code>sakila.staff_list</code> table reference
     */
    public StaffList(Name alias) {
        this(alias, STAFF_LIST);
    }

    /**
     * Create a <code>sakila.staff_list</code> table reference
     */
    public StaffList() {
        this(DSL.name("staff_list"), null);
    }

    public <O extends Record> StaffList(Table<O> child, ForeignKey<O, StaffListRecord> key) {
        super(child, key, STAFF_LIST);
    }

    @Override
    public Schema getSchema() {
        return aliased() ? null : Sakila.SAKILA;
    }

    @Override
    public StaffList as(String alias) {
        return new StaffList(DSL.name(alias), this);
    }

    @Override
    public StaffList as(Name alias) {
        return new StaffList(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public StaffList rename(String name) {
        return new StaffList(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public StaffList rename(Name name) {
        return new StaffList(name, null);
    }

    // -------------------------------------------------------------------------
    // Row8 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row8<Boolean, String, String, String, String, String, String, Boolean> fieldsRow() {
        return (Row8) super.fieldsRow();
    }
}
