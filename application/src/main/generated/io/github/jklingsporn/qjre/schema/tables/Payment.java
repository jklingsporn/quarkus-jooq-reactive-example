/*
 * This file is generated by jOOQ.
 */
package io.github.jklingsporn.qjre.schema.tables;


import io.github.jklingsporn.qjre.schema.Indexes;
import io.github.jklingsporn.qjre.schema.Keys;
import io.github.jklingsporn.qjre.schema.Sakila;
import io.github.jklingsporn.qjre.schema.tables.records.PaymentRecord;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.List;

import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Identity;
import org.jooq.Index;
import org.jooq.Name;
import org.jooq.Record;
import org.jooq.Row7;
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
public class Payment extends TableImpl<PaymentRecord> {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of <code>sakila.payment</code>
     */
    public static final Payment PAYMENT = new Payment();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<PaymentRecord> getRecordType() {
        return PaymentRecord.class;
    }

    /**
     * The column <code>sakila.payment.payment_id</code>.
     */
    public final TableField<PaymentRecord, Short> PAYMENT_ID = createField(DSL.name("payment_id"), SQLDataType.SMALLINT.nullable(false).identity(true), this, "");

    /**
     * The column <code>sakila.payment.customer_id</code>.
     */
    public final TableField<PaymentRecord, Short> CUSTOMER_ID = createField(DSL.name("customer_id"), SQLDataType.SMALLINT.nullable(false), this, "");

    /**
     * The column <code>sakila.payment.staff_id</code>.
     */
    public final TableField<PaymentRecord, Boolean> STAFF_ID = createField(DSL.name("staff_id"), SQLDataType.BOOLEAN.nullable(false), this, "");

    /**
     * The column <code>sakila.payment.rental_id</code>.
     */
    public final TableField<PaymentRecord, Integer> RENTAL_ID = createField(DSL.name("rental_id"), SQLDataType.INTEGER, this, "");

    /**
     * The column <code>sakila.payment.amount</code>.
     */
    public final TableField<PaymentRecord, BigDecimal> AMOUNT = createField(DSL.name("amount"), SQLDataType.DECIMAL(5, 2).nullable(false), this, "");

    /**
     * The column <code>sakila.payment.payment_date</code>.
     */
    public final TableField<PaymentRecord, LocalDateTime> PAYMENT_DATE = createField(DSL.name("payment_date"), SQLDataType.LOCALDATETIME(0).nullable(false), this, "");

    /**
     * The column <code>sakila.payment.last_update</code>.
     */
    public final TableField<PaymentRecord, LocalDateTime> LAST_UPDATE = createField(DSL.name("last_update"), SQLDataType.LOCALDATETIME(0), this, "");

    private Payment(Name alias, Table<PaymentRecord> aliased) {
        this(alias, aliased, null);
    }

    private Payment(Name alias, Table<PaymentRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.table());
    }

    /**
     * Create an aliased <code>sakila.payment</code> table reference
     */
    public Payment(String alias) {
        this(DSL.name(alias), PAYMENT);
    }

    /**
     * Create an aliased <code>sakila.payment</code> table reference
     */
    public Payment(Name alias) {
        this(alias, PAYMENT);
    }

    /**
     * Create a <code>sakila.payment</code> table reference
     */
    public Payment() {
        this(DSL.name("payment"), null);
    }

    public <O extends Record> Payment(Table<O> child, ForeignKey<O, PaymentRecord> key) {
        super(child, key, PAYMENT);
    }

    @Override
    public Schema getSchema() {
        return aliased() ? null : Sakila.SAKILA;
    }

    @Override
    public List<Index> getIndexes() {
        return Arrays.asList(Indexes.PAYMENT_IDX_FK_CUSTOMER_ID, Indexes.PAYMENT_IDX_FK_STAFF_ID);
    }

    @Override
    public Identity<PaymentRecord, Short> getIdentity() {
        return (Identity<PaymentRecord, Short>) super.getIdentity();
    }

    @Override
    public UniqueKey<PaymentRecord> getPrimaryKey() {
        return Keys.KEY_PAYMENT_PRIMARY;
    }

    @Override
    public List<ForeignKey<PaymentRecord, ?>> getReferences() {
        return Arrays.asList(Keys.FK_PAYMENT_CUSTOMER, Keys.FK_PAYMENT_STAFF, Keys.FK_PAYMENT_RENTAL);
    }

    private transient Customer _customer;
    private transient Staff _staff;
    private transient Rental _rental;

    /**
     * Get the implicit join path to the <code>sakila.customer</code> table.
     */
    public Customer customer() {
        if (_customer == null)
            _customer = new Customer(this, Keys.FK_PAYMENT_CUSTOMER);

        return _customer;
    }

    /**
     * Get the implicit join path to the <code>sakila.staff</code> table.
     */
    public Staff staff() {
        if (_staff == null)
            _staff = new Staff(this, Keys.FK_PAYMENT_STAFF);

        return _staff;
    }

    /**
     * Get the implicit join path to the <code>sakila.rental</code> table.
     */
    public Rental rental() {
        if (_rental == null)
            _rental = new Rental(this, Keys.FK_PAYMENT_RENTAL);

        return _rental;
    }

    @Override
    public Payment as(String alias) {
        return new Payment(DSL.name(alias), this);
    }

    @Override
    public Payment as(Name alias) {
        return new Payment(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public Payment rename(String name) {
        return new Payment(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public Payment rename(Name name) {
        return new Payment(name, null);
    }

    // -------------------------------------------------------------------------
    // Row7 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row7<Short, Short, Boolean, Integer, BigDecimal, LocalDateTime, LocalDateTime> fieldsRow() {
        return (Row7) super.fieldsRow();
    }
}
