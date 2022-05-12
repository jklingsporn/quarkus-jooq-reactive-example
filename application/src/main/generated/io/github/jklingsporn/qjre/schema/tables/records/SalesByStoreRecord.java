/*
 * This file is generated by jOOQ.
 */
package io.github.jklingsporn.qjre.schema.tables.records;


import io.github.jklingsporn.qjre.schema.tables.SalesByStore;
import io.github.jklingsporn.qjre.schema.tables.interfaces.ISalesByStore;
import io.github.jklingsporn.vertx.jooq.shared.internal.VertxPojo;

import java.math.BigDecimal;

import org.jooq.Field;
import org.jooq.Record3;
import org.jooq.Row3;
import org.jooq.impl.TableRecordImpl;


import static io.github.jklingsporn.vertx.jooq.shared.internal.VertxPojo.*;
/**
 * VIEW
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class SalesByStoreRecord extends TableRecordImpl<SalesByStoreRecord> implements VertxPojo, Record3<String, String, BigDecimal>, ISalesByStore {

    private static final long serialVersionUID = 1L;

    /**
     * Setter for <code>sakila.sales_by_store.store</code>.
     */
    @Override
    public SalesByStoreRecord setStore(String value) {
        set(0, value);
        return this;
    }

    /**
     * Getter for <code>sakila.sales_by_store.store</code>.
     */
    @Override
    public String getStore() {
        return (String) get(0);
    }

    /**
     * Setter for <code>sakila.sales_by_store.manager</code>.
     */
    @Override
    public SalesByStoreRecord setManager(String value) {
        set(1, value);
        return this;
    }

    /**
     * Getter for <code>sakila.sales_by_store.manager</code>.
     */
    @Override
    public String getManager() {
        return (String) get(1);
    }

    /**
     * Setter for <code>sakila.sales_by_store.total_sales</code>.
     */
    @Override
    public SalesByStoreRecord setTotalSales(BigDecimal value) {
        set(2, value);
        return this;
    }

    /**
     * Getter for <code>sakila.sales_by_store.total_sales</code>.
     */
    @Override
    public BigDecimal getTotalSales() {
        return (BigDecimal) get(2);
    }

    // -------------------------------------------------------------------------
    // Record3 type implementation
    // -------------------------------------------------------------------------

    @Override
    public Row3<String, String, BigDecimal> fieldsRow() {
        return (Row3) super.fieldsRow();
    }

    @Override
    public Row3<String, String, BigDecimal> valuesRow() {
        return (Row3) super.valuesRow();
    }

    @Override
    public Field<String> field1() {
        return SalesByStore.SALES_BY_STORE.STORE;
    }

    @Override
    public Field<String> field2() {
        return SalesByStore.SALES_BY_STORE.MANAGER;
    }

    @Override
    public Field<BigDecimal> field3() {
        return SalesByStore.SALES_BY_STORE.TOTAL_SALES;
    }

    @Override
    public String component1() {
        return getStore();
    }

    @Override
    public String component2() {
        return getManager();
    }

    @Override
    public BigDecimal component3() {
        return getTotalSales();
    }

    @Override
    public String value1() {
        return getStore();
    }

    @Override
    public String value2() {
        return getManager();
    }

    @Override
    public BigDecimal value3() {
        return getTotalSales();
    }

    @Override
    public SalesByStoreRecord value1(String value) {
        setStore(value);
        return this;
    }

    @Override
    public SalesByStoreRecord value2(String value) {
        setManager(value);
        return this;
    }

    @Override
    public SalesByStoreRecord value3(BigDecimal value) {
        setTotalSales(value);
        return this;
    }

    @Override
    public SalesByStoreRecord values(String value1, String value2, BigDecimal value3) {
        value1(value1);
        value2(value2);
        value3(value3);
        return this;
    }

    // -------------------------------------------------------------------------
    // FROM and INTO
    // -------------------------------------------------------------------------

    @Override
    public void from(ISalesByStore from) {
        setStore(from.getStore());
        setManager(from.getManager());
        setTotalSales(from.getTotalSales());
    }

    @Override
    public <E extends ISalesByStore> E into(E into) {
        into.from(this);
        return into;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached SalesByStoreRecord
     */
    public SalesByStoreRecord() {
        super(SalesByStore.SALES_BY_STORE);
    }

    /**
     * Create a detached, initialised SalesByStoreRecord
     */
    public SalesByStoreRecord(String store, String manager, BigDecimal totalSales) {
        super(SalesByStore.SALES_BY_STORE);

        setStore(store);
        setManager(manager);
        setTotalSales(totalSales);
    }

    /**
     * Create a detached, initialised SalesByStoreRecord
     */
    public SalesByStoreRecord(io.github.jklingsporn.qjre.schema.tables.pojos.SalesByStore value) {
        super(SalesByStore.SALES_BY_STORE);

        if (value != null) {
            setStore(value.getStore());
            setManager(value.getManager());
            setTotalSales(value.getTotalSales());
        }
    }

        public SalesByStoreRecord(io.vertx.core.json.JsonObject json) {
                this();
                fromJson(json);
        }
}