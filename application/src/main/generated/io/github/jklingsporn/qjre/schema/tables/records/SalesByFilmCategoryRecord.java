/*
 * This file is generated by jOOQ.
 */
package io.github.jklingsporn.qjre.schema.tables.records;


import io.github.jklingsporn.qjre.schema.tables.SalesByFilmCategory;
import io.github.jklingsporn.qjre.schema.tables.interfaces.ISalesByFilmCategory;
import io.github.jklingsporn.vertx.jooq.shared.internal.VertxPojo;

import java.math.BigDecimal;

import org.jooq.Field;
import org.jooq.Record2;
import org.jooq.Row2;
import org.jooq.impl.TableRecordImpl;


import static io.github.jklingsporn.vertx.jooq.shared.internal.VertxPojo.*;
/**
 * VIEW
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class SalesByFilmCategoryRecord extends TableRecordImpl<SalesByFilmCategoryRecord> implements VertxPojo, Record2<String, BigDecimal>, ISalesByFilmCategory {

    private static final long serialVersionUID = 1L;

    /**
     * Setter for <code>sakila.sales_by_film_category.category</code>.
     */
    @Override
    public SalesByFilmCategoryRecord setCategory(String value) {
        set(0, value);
        return this;
    }

    /**
     * Getter for <code>sakila.sales_by_film_category.category</code>.
     */
    @Override
    public String getCategory() {
        return (String) get(0);
    }

    /**
     * Setter for <code>sakila.sales_by_film_category.total_sales</code>.
     */
    @Override
    public SalesByFilmCategoryRecord setTotalSales(BigDecimal value) {
        set(1, value);
        return this;
    }

    /**
     * Getter for <code>sakila.sales_by_film_category.total_sales</code>.
     */
    @Override
    public BigDecimal getTotalSales() {
        return (BigDecimal) get(1);
    }

    // -------------------------------------------------------------------------
    // Record2 type implementation
    // -------------------------------------------------------------------------

    @Override
    public Row2<String, BigDecimal> fieldsRow() {
        return (Row2) super.fieldsRow();
    }

    @Override
    public Row2<String, BigDecimal> valuesRow() {
        return (Row2) super.valuesRow();
    }

    @Override
    public Field<String> field1() {
        return SalesByFilmCategory.SALES_BY_FILM_CATEGORY.CATEGORY;
    }

    @Override
    public Field<BigDecimal> field2() {
        return SalesByFilmCategory.SALES_BY_FILM_CATEGORY.TOTAL_SALES;
    }

    @Override
    public String component1() {
        return getCategory();
    }

    @Override
    public BigDecimal component2() {
        return getTotalSales();
    }

    @Override
    public String value1() {
        return getCategory();
    }

    @Override
    public BigDecimal value2() {
        return getTotalSales();
    }

    @Override
    public SalesByFilmCategoryRecord value1(String value) {
        setCategory(value);
        return this;
    }

    @Override
    public SalesByFilmCategoryRecord value2(BigDecimal value) {
        setTotalSales(value);
        return this;
    }

    @Override
    public SalesByFilmCategoryRecord values(String value1, BigDecimal value2) {
        value1(value1);
        value2(value2);
        return this;
    }

    // -------------------------------------------------------------------------
    // FROM and INTO
    // -------------------------------------------------------------------------

    @Override
    public void from(ISalesByFilmCategory from) {
        setCategory(from.getCategory());
        setTotalSales(from.getTotalSales());
    }

    @Override
    public <E extends ISalesByFilmCategory> E into(E into) {
        into.from(this);
        return into;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached SalesByFilmCategoryRecord
     */
    public SalesByFilmCategoryRecord() {
        super(SalesByFilmCategory.SALES_BY_FILM_CATEGORY);
    }

    /**
     * Create a detached, initialised SalesByFilmCategoryRecord
     */
    public SalesByFilmCategoryRecord(String category, BigDecimal totalSales) {
        super(SalesByFilmCategory.SALES_BY_FILM_CATEGORY);

        setCategory(category);
        setTotalSales(totalSales);
    }

    /**
     * Create a detached, initialised SalesByFilmCategoryRecord
     */
    public SalesByFilmCategoryRecord(io.github.jklingsporn.qjre.schema.tables.pojos.SalesByFilmCategory value) {
        super(SalesByFilmCategory.SALES_BY_FILM_CATEGORY);

        if (value != null) {
            setCategory(value.getCategory());
            setTotalSales(value.getTotalSales());
        }
    }

        public SalesByFilmCategoryRecord(io.vertx.core.json.JsonObject json) {
                this();
                fromJson(json);
        }
}
