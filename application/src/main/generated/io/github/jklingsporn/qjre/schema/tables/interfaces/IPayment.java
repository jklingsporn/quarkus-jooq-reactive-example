/*
 * This file is generated by jOOQ.
 */
package io.github.jklingsporn.qjre.schema.tables.interfaces;


import io.github.jklingsporn.vertx.jooq.shared.internal.VertxPojo;

import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDateTime;


import static io.github.jklingsporn.vertx.jooq.shared.internal.VertxPojo.*;
/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public interface IPayment extends VertxPojo, Serializable {

    /**
     * Setter for <code>sakila.payment.payment_id</code>.
     */
    public IPayment setPaymentId(Short value);

    /**
     * Getter for <code>sakila.payment.payment_id</code>.
     */
    public Short getPaymentId();

    /**
     * Setter for <code>sakila.payment.customer_id</code>.
     */
    public IPayment setCustomerId(Short value);

    /**
     * Getter for <code>sakila.payment.customer_id</code>.
     */
    public Short getCustomerId();

    /**
     * Setter for <code>sakila.payment.staff_id</code>.
     */
    public IPayment setStaffId(Boolean value);

    /**
     * Getter for <code>sakila.payment.staff_id</code>.
     */
    public Boolean getStaffId();

    /**
     * Setter for <code>sakila.payment.rental_id</code>.
     */
    public IPayment setRentalId(Integer value);

    /**
     * Getter for <code>sakila.payment.rental_id</code>.
     */
    public Integer getRentalId();

    /**
     * Setter for <code>sakila.payment.amount</code>.
     */
    public IPayment setAmount(BigDecimal value);

    /**
     * Getter for <code>sakila.payment.amount</code>.
     */
    public BigDecimal getAmount();

    /**
     * Setter for <code>sakila.payment.payment_date</code>.
     */
    public IPayment setPaymentDate(LocalDateTime value);

    /**
     * Getter for <code>sakila.payment.payment_date</code>.
     */
    public LocalDateTime getPaymentDate();

    /**
     * Setter for <code>sakila.payment.last_update</code>.
     */
    public IPayment setLastUpdate(LocalDateTime value);

    /**
     * Getter for <code>sakila.payment.last_update</code>.
     */
    public LocalDateTime getLastUpdate();

    // -------------------------------------------------------------------------
    // FROM and INTO
    // -------------------------------------------------------------------------

    /**
     * Load data from another generated Record/POJO implementing the common
     * interface IPayment
     */
    public void from(IPayment from);

    /**
     * Copy data into another generated Record/POJO implementing the common
     * interface IPayment
     */
    public <E extends IPayment> E into(E into);

        @Override
        public default IPayment fromJson(io.vertx.core.json.JsonObject json) {
                setOrThrow(this::setPaymentId,key -> {Integer i = json.getInteger(key); return i==null?null:i.shortValue();},"payment_id","java.lang.Short");
                setOrThrow(this::setCustomerId,key -> {Integer i = json.getInteger(key); return i==null?null:i.shortValue();},"customer_id","java.lang.Short");
                setOrThrow(this::setStaffId,json::getBoolean,"staff_id","java.lang.Boolean");
                setOrThrow(this::setRentalId,json::getInteger,"rental_id","java.lang.Integer");
                setOrThrow(this::setAmount,key -> {String s = json.getString(key); return s==null?null:new java.math.BigDecimal(s);},"amount","java.math.BigDecimal");
                setOrThrow(this::setPaymentDate,key -> {String s = json.getString(key); return s==null?null:java.time.LocalDateTime.parse(s);},"payment_date","java.time.LocalDateTime");
                setOrThrow(this::setLastUpdate,key -> {String s = json.getString(key); return s==null?null:java.time.LocalDateTime.parse(s);},"last_update","java.time.LocalDateTime");
                return this;
        }


        @Override
        public default io.vertx.core.json.JsonObject toJson() {
                io.vertx.core.json.JsonObject json = new io.vertx.core.json.JsonObject();
                json.put("payment_id",getPaymentId());
                json.put("customer_id",getCustomerId());
                json.put("staff_id",getStaffId());
                json.put("rental_id",getRentalId());
                json.put("amount",getAmount()==null?null:getAmount().toString());
                json.put("payment_date",getPaymentDate()==null?null:getPaymentDate().toString());
                json.put("last_update",getLastUpdate()==null?null:getLastUpdate().toString());
                return json;
        }

}
