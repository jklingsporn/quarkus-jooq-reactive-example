/*
 * This file is generated by jOOQ.
 */
package io.github.jklingsporn.qjre.schema;


import io.github.jklingsporn.qjre.schema.tables.Actor;
import io.github.jklingsporn.qjre.schema.tables.Address;
import io.github.jklingsporn.qjre.schema.tables.City;
import io.github.jklingsporn.qjre.schema.tables.Customer;
import io.github.jklingsporn.qjre.schema.tables.Film;
import io.github.jklingsporn.qjre.schema.tables.FilmActor;
import io.github.jklingsporn.qjre.schema.tables.FilmText;
import io.github.jklingsporn.qjre.schema.tables.Inventory;
import io.github.jklingsporn.qjre.schema.tables.Payment;
import io.github.jklingsporn.qjre.schema.tables.Rental;
import io.github.jklingsporn.qjre.schema.tables.Staff;
import io.github.jklingsporn.qjre.schema.tables.Store;

import org.jooq.Index;
import org.jooq.OrderField;
import org.jooq.impl.DSL;
import org.jooq.impl.Internal;


/**
 * A class modelling indexes of tables in sakila.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Indexes {

    // -------------------------------------------------------------------------
    // INDEX definitions
    // -------------------------------------------------------------------------

    public static final Index ACTOR_IDX_ACTOR_LAST_NAME = Internal.createIndex(DSL.name("idx_actor_last_name"), Actor.ACTOR, new OrderField[] { Actor.ACTOR.LAST_NAME }, false);
    public static final Index CUSTOMER_IDX_FK_ADDRESS_ID = Internal.createIndex(DSL.name("idx_fk_address_id"), Customer.CUSTOMER, new OrderField[] { Customer.CUSTOMER.ADDRESS_ID }, false);
    public static final Index STAFF_IDX_FK_ADDRESS_ID = Internal.createIndex(DSL.name("idx_fk_address_id"), Staff.STAFF, new OrderField[] { Staff.STAFF.ADDRESS_ID }, false);
    public static final Index STORE_IDX_FK_ADDRESS_ID = Internal.createIndex(DSL.name("idx_fk_address_id"), Store.STORE, new OrderField[] { Store.STORE.ADDRESS_ID }, false);
    public static final Index ADDRESS_IDX_FK_CITY_ID = Internal.createIndex(DSL.name("idx_fk_city_id"), Address.ADDRESS, new OrderField[] { Address.ADDRESS.CITY_ID }, false);
    public static final Index CITY_IDX_FK_COUNTRY_ID = Internal.createIndex(DSL.name("idx_fk_country_id"), City.CITY, new OrderField[] { City.CITY.COUNTRY_ID }, false);
    public static final Index PAYMENT_IDX_FK_CUSTOMER_ID = Internal.createIndex(DSL.name("idx_fk_customer_id"), Payment.PAYMENT, new OrderField[] { Payment.PAYMENT.CUSTOMER_ID }, false);
    public static final Index RENTAL_IDX_FK_CUSTOMER_ID = Internal.createIndex(DSL.name("idx_fk_customer_id"), Rental.RENTAL, new OrderField[] { Rental.RENTAL.CUSTOMER_ID }, false);
    public static final Index FILM_ACTOR_IDX_FK_FILM_ID = Internal.createIndex(DSL.name("idx_fk_film_id"), FilmActor.FILM_ACTOR, new OrderField[] { FilmActor.FILM_ACTOR.FILM_ID }, false);
    public static final Index INVENTORY_IDX_FK_FILM_ID = Internal.createIndex(DSL.name("idx_fk_film_id"), Inventory.INVENTORY, new OrderField[] { Inventory.INVENTORY.FILM_ID }, false);
    public static final Index RENTAL_IDX_FK_INVENTORY_ID = Internal.createIndex(DSL.name("idx_fk_inventory_id"), Rental.RENTAL, new OrderField[] { Rental.RENTAL.INVENTORY_ID }, false);
    public static final Index FILM_IDX_FK_LANGUAGE_ID = Internal.createIndex(DSL.name("idx_fk_language_id"), Film.FILM, new OrderField[] { Film.FILM.LANGUAGE_ID }, false);
    public static final Index FILM_IDX_FK_ORIGINAL_LANGUAGE_ID = Internal.createIndex(DSL.name("idx_fk_original_language_id"), Film.FILM, new OrderField[] { Film.FILM.ORIGINAL_LANGUAGE_ID }, false);
    public static final Index PAYMENT_IDX_FK_STAFF_ID = Internal.createIndex(DSL.name("idx_fk_staff_id"), Payment.PAYMENT, new OrderField[] { Payment.PAYMENT.STAFF_ID }, false);
    public static final Index RENTAL_IDX_FK_STAFF_ID = Internal.createIndex(DSL.name("idx_fk_staff_id"), Rental.RENTAL, new OrderField[] { Rental.RENTAL.STAFF_ID }, false);
    public static final Index CUSTOMER_IDX_FK_STORE_ID = Internal.createIndex(DSL.name("idx_fk_store_id"), Customer.CUSTOMER, new OrderField[] { Customer.CUSTOMER.STORE_ID }, false);
    public static final Index STAFF_IDX_FK_STORE_ID = Internal.createIndex(DSL.name("idx_fk_store_id"), Staff.STAFF, new OrderField[] { Staff.STAFF.STORE_ID }, false);
    public static final Index CUSTOMER_IDX_LAST_NAME = Internal.createIndex(DSL.name("idx_last_name"), Customer.CUSTOMER, new OrderField[] { Customer.CUSTOMER.LAST_NAME }, false);
    public static final Index ADDRESS_IDX_LOCATION = Internal.createIndex(DSL.name("idx_location"), Address.ADDRESS, new OrderField[] { Address.ADDRESS.LOCATION }, false);
    public static final Index INVENTORY_IDX_STORE_ID_FILM_ID = Internal.createIndex(DSL.name("idx_store_id_film_id"), Inventory.INVENTORY, new OrderField[] { Inventory.INVENTORY.STORE_ID, Inventory.INVENTORY.FILM_ID }, false);
    public static final Index FILM_IDX_TITLE = Internal.createIndex(DSL.name("idx_title"), Film.FILM, new OrderField[] { Film.FILM.TITLE }, false);
    public static final Index FILM_TEXT_IDX_TITLE_DESCRIPTION = Internal.createIndex(DSL.name("idx_title_description"), FilmText.FILM_TEXT, new OrderField[] { FilmText.FILM_TEXT.TITLE, FilmText.FILM_TEXT.DESCRIPTION }, false);
}
