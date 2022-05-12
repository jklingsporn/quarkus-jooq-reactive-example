/*
 * This file is generated by jOOQ.
 */
package io.github.jklingsporn.qjre.schema;


import io.github.jklingsporn.qjre.schema.tables.Actor;
import io.github.jklingsporn.qjre.schema.tables.Address;
import io.github.jklingsporn.qjre.schema.tables.Category;
import io.github.jklingsporn.qjre.schema.tables.City;
import io.github.jklingsporn.qjre.schema.tables.Country;
import io.github.jklingsporn.qjre.schema.tables.Customer;
import io.github.jklingsporn.qjre.schema.tables.Film;
import io.github.jklingsporn.qjre.schema.tables.FilmActor;
import io.github.jklingsporn.qjre.schema.tables.FilmCategory;
import io.github.jklingsporn.qjre.schema.tables.FilmText;
import io.github.jklingsporn.qjre.schema.tables.Inventory;
import io.github.jklingsporn.qjre.schema.tables.Language;
import io.github.jklingsporn.qjre.schema.tables.Payment;
import io.github.jklingsporn.qjre.schema.tables.Rental;
import io.github.jklingsporn.qjre.schema.tables.Staff;
import io.github.jklingsporn.qjre.schema.tables.Store;
import io.github.jklingsporn.qjre.schema.tables.records.ActorRecord;
import io.github.jklingsporn.qjre.schema.tables.records.AddressRecord;
import io.github.jklingsporn.qjre.schema.tables.records.CategoryRecord;
import io.github.jklingsporn.qjre.schema.tables.records.CityRecord;
import io.github.jklingsporn.qjre.schema.tables.records.CountryRecord;
import io.github.jklingsporn.qjre.schema.tables.records.CustomerRecord;
import io.github.jklingsporn.qjre.schema.tables.records.FilmActorRecord;
import io.github.jklingsporn.qjre.schema.tables.records.FilmCategoryRecord;
import io.github.jklingsporn.qjre.schema.tables.records.FilmRecord;
import io.github.jklingsporn.qjre.schema.tables.records.FilmTextRecord;
import io.github.jklingsporn.qjre.schema.tables.records.InventoryRecord;
import io.github.jklingsporn.qjre.schema.tables.records.LanguageRecord;
import io.github.jklingsporn.qjre.schema.tables.records.PaymentRecord;
import io.github.jklingsporn.qjre.schema.tables.records.RentalRecord;
import io.github.jklingsporn.qjre.schema.tables.records.StaffRecord;
import io.github.jklingsporn.qjre.schema.tables.records.StoreRecord;

import org.jooq.ForeignKey;
import org.jooq.TableField;
import org.jooq.UniqueKey;
import org.jooq.impl.DSL;
import org.jooq.impl.Internal;


/**
 * A class modelling foreign key relationships and constraints of tables in
 * sakila.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Keys {

    // -------------------------------------------------------------------------
    // UNIQUE and PRIMARY KEY definitions
    // -------------------------------------------------------------------------

    public static final UniqueKey<ActorRecord> KEY_ACTOR_PRIMARY = Internal.createUniqueKey(Actor.ACTOR, DSL.name("KEY_actor_PRIMARY"), new TableField[] { Actor.ACTOR.ACTOR_ID }, true);
    public static final UniqueKey<AddressRecord> KEY_ADDRESS_PRIMARY = Internal.createUniqueKey(Address.ADDRESS, DSL.name("KEY_address_PRIMARY"), new TableField[] { Address.ADDRESS.ADDRESS_ID }, true);
    public static final UniqueKey<CategoryRecord> KEY_CATEGORY_PRIMARY = Internal.createUniqueKey(Category.CATEGORY, DSL.name("KEY_category_PRIMARY"), new TableField[] { Category.CATEGORY.CATEGORY_ID }, true);
    public static final UniqueKey<CityRecord> KEY_CITY_PRIMARY = Internal.createUniqueKey(City.CITY, DSL.name("KEY_city_PRIMARY"), new TableField[] { City.CITY.CITY_ID }, true);
    public static final UniqueKey<CountryRecord> KEY_COUNTRY_PRIMARY = Internal.createUniqueKey(Country.COUNTRY, DSL.name("KEY_country_PRIMARY"), new TableField[] { Country.COUNTRY.COUNTRY_ID }, true);
    public static final UniqueKey<CustomerRecord> KEY_CUSTOMER_PRIMARY = Internal.createUniqueKey(Customer.CUSTOMER, DSL.name("KEY_customer_PRIMARY"), new TableField[] { Customer.CUSTOMER.CUSTOMER_ID }, true);
    public static final UniqueKey<FilmRecord> KEY_FILM_PRIMARY = Internal.createUniqueKey(Film.FILM, DSL.name("KEY_film_PRIMARY"), new TableField[] { Film.FILM.FILM_ID }, true);
    public static final UniqueKey<FilmActorRecord> KEY_FILM_ACTOR_PRIMARY = Internal.createUniqueKey(FilmActor.FILM_ACTOR, DSL.name("KEY_film_actor_PRIMARY"), new TableField[] { FilmActor.FILM_ACTOR.ACTOR_ID, FilmActor.FILM_ACTOR.FILM_ID }, true);
    public static final UniqueKey<FilmCategoryRecord> KEY_FILM_CATEGORY_PRIMARY = Internal.createUniqueKey(FilmCategory.FILM_CATEGORY, DSL.name("KEY_film_category_PRIMARY"), new TableField[] { FilmCategory.FILM_CATEGORY.FILM_ID, FilmCategory.FILM_CATEGORY.CATEGORY_ID }, true);
    public static final UniqueKey<FilmTextRecord> KEY_FILM_TEXT_PRIMARY = Internal.createUniqueKey(FilmText.FILM_TEXT, DSL.name("KEY_film_text_PRIMARY"), new TableField[] { FilmText.FILM_TEXT.FILM_ID }, true);
    public static final UniqueKey<InventoryRecord> KEY_INVENTORY_PRIMARY = Internal.createUniqueKey(Inventory.INVENTORY, DSL.name("KEY_inventory_PRIMARY"), new TableField[] { Inventory.INVENTORY.INVENTORY_ID }, true);
    public static final UniqueKey<LanguageRecord> KEY_LANGUAGE_PRIMARY = Internal.createUniqueKey(Language.LANGUAGE, DSL.name("KEY_language_PRIMARY"), new TableField[] { Language.LANGUAGE.LANGUAGE_ID }, true);
    public static final UniqueKey<PaymentRecord> KEY_PAYMENT_PRIMARY = Internal.createUniqueKey(Payment.PAYMENT, DSL.name("KEY_payment_PRIMARY"), new TableField[] { Payment.PAYMENT.PAYMENT_ID }, true);
    public static final UniqueKey<RentalRecord> KEY_RENTAL_PRIMARY = Internal.createUniqueKey(Rental.RENTAL, DSL.name("KEY_rental_PRIMARY"), new TableField[] { Rental.RENTAL.RENTAL_ID }, true);
    public static final UniqueKey<RentalRecord> KEY_RENTAL_RENTAL_DATE = Internal.createUniqueKey(Rental.RENTAL, DSL.name("KEY_rental_rental_date"), new TableField[] { Rental.RENTAL.RENTAL_DATE, Rental.RENTAL.INVENTORY_ID, Rental.RENTAL.CUSTOMER_ID }, true);
    public static final UniqueKey<StaffRecord> KEY_STAFF_PRIMARY = Internal.createUniqueKey(Staff.STAFF, DSL.name("KEY_staff_PRIMARY"), new TableField[] { Staff.STAFF.STAFF_ID }, true);
    public static final UniqueKey<StoreRecord> KEY_STORE_IDX_UNIQUE_MANAGER = Internal.createUniqueKey(Store.STORE, DSL.name("KEY_store_idx_unique_manager"), new TableField[] { Store.STORE.MANAGER_STAFF_ID }, true);
    public static final UniqueKey<StoreRecord> KEY_STORE_PRIMARY = Internal.createUniqueKey(Store.STORE, DSL.name("KEY_store_PRIMARY"), new TableField[] { Store.STORE.STORE_ID }, true);

    // -------------------------------------------------------------------------
    // FOREIGN KEY definitions
    // -------------------------------------------------------------------------

    public static final ForeignKey<AddressRecord, CityRecord> FK_ADDRESS_CITY = Internal.createForeignKey(Address.ADDRESS, DSL.name("fk_address_city"), new TableField[] { Address.ADDRESS.CITY_ID }, Keys.KEY_CITY_PRIMARY, new TableField[] { City.CITY.CITY_ID }, true);
    public static final ForeignKey<CityRecord, CountryRecord> FK_CITY_COUNTRY = Internal.createForeignKey(City.CITY, DSL.name("fk_city_country"), new TableField[] { City.CITY.COUNTRY_ID }, Keys.KEY_COUNTRY_PRIMARY, new TableField[] { Country.COUNTRY.COUNTRY_ID }, true);
    public static final ForeignKey<CustomerRecord, AddressRecord> FK_CUSTOMER_ADDRESS = Internal.createForeignKey(Customer.CUSTOMER, DSL.name("fk_customer_address"), new TableField[] { Customer.CUSTOMER.ADDRESS_ID }, Keys.KEY_ADDRESS_PRIMARY, new TableField[] { Address.ADDRESS.ADDRESS_ID }, true);
    public static final ForeignKey<CustomerRecord, StoreRecord> FK_CUSTOMER_STORE = Internal.createForeignKey(Customer.CUSTOMER, DSL.name("fk_customer_store"), new TableField[] { Customer.CUSTOMER.STORE_ID }, Keys.KEY_STORE_PRIMARY, new TableField[] { Store.STORE.STORE_ID }, true);
    public static final ForeignKey<FilmRecord, LanguageRecord> FK_FILM_LANGUAGE = Internal.createForeignKey(Film.FILM, DSL.name("fk_film_language"), new TableField[] { Film.FILM.LANGUAGE_ID }, Keys.KEY_LANGUAGE_PRIMARY, new TableField[] { Language.LANGUAGE.LANGUAGE_ID }, true);
    public static final ForeignKey<FilmRecord, LanguageRecord> FK_FILM_LANGUAGE_ORIGINAL = Internal.createForeignKey(Film.FILM, DSL.name("fk_film_language_original"), new TableField[] { Film.FILM.ORIGINAL_LANGUAGE_ID }, Keys.KEY_LANGUAGE_PRIMARY, new TableField[] { Language.LANGUAGE.LANGUAGE_ID }, true);
    public static final ForeignKey<FilmActorRecord, ActorRecord> FK_FILM_ACTOR_ACTOR = Internal.createForeignKey(FilmActor.FILM_ACTOR, DSL.name("fk_film_actor_actor"), new TableField[] { FilmActor.FILM_ACTOR.ACTOR_ID }, Keys.KEY_ACTOR_PRIMARY, new TableField[] { Actor.ACTOR.ACTOR_ID }, true);
    public static final ForeignKey<FilmActorRecord, FilmRecord> FK_FILM_ACTOR_FILM = Internal.createForeignKey(FilmActor.FILM_ACTOR, DSL.name("fk_film_actor_film"), new TableField[] { FilmActor.FILM_ACTOR.FILM_ID }, Keys.KEY_FILM_PRIMARY, new TableField[] { Film.FILM.FILM_ID }, true);
    public static final ForeignKey<FilmCategoryRecord, CategoryRecord> FK_FILM_CATEGORY_CATEGORY = Internal.createForeignKey(FilmCategory.FILM_CATEGORY, DSL.name("fk_film_category_category"), new TableField[] { FilmCategory.FILM_CATEGORY.CATEGORY_ID }, Keys.KEY_CATEGORY_PRIMARY, new TableField[] { Category.CATEGORY.CATEGORY_ID }, true);
    public static final ForeignKey<FilmCategoryRecord, FilmRecord> FK_FILM_CATEGORY_FILM = Internal.createForeignKey(FilmCategory.FILM_CATEGORY, DSL.name("fk_film_category_film"), new TableField[] { FilmCategory.FILM_CATEGORY.FILM_ID }, Keys.KEY_FILM_PRIMARY, new TableField[] { Film.FILM.FILM_ID }, true);
    public static final ForeignKey<InventoryRecord, FilmRecord> FK_INVENTORY_FILM = Internal.createForeignKey(Inventory.INVENTORY, DSL.name("fk_inventory_film"), new TableField[] { Inventory.INVENTORY.FILM_ID }, Keys.KEY_FILM_PRIMARY, new TableField[] { Film.FILM.FILM_ID }, true);
    public static final ForeignKey<InventoryRecord, StoreRecord> FK_INVENTORY_STORE = Internal.createForeignKey(Inventory.INVENTORY, DSL.name("fk_inventory_store"), new TableField[] { Inventory.INVENTORY.STORE_ID }, Keys.KEY_STORE_PRIMARY, new TableField[] { Store.STORE.STORE_ID }, true);
    public static final ForeignKey<PaymentRecord, CustomerRecord> FK_PAYMENT_CUSTOMER = Internal.createForeignKey(Payment.PAYMENT, DSL.name("fk_payment_customer"), new TableField[] { Payment.PAYMENT.CUSTOMER_ID }, Keys.KEY_CUSTOMER_PRIMARY, new TableField[] { Customer.CUSTOMER.CUSTOMER_ID }, true);
    public static final ForeignKey<PaymentRecord, RentalRecord> FK_PAYMENT_RENTAL = Internal.createForeignKey(Payment.PAYMENT, DSL.name("fk_payment_rental"), new TableField[] { Payment.PAYMENT.RENTAL_ID }, Keys.KEY_RENTAL_PRIMARY, new TableField[] { Rental.RENTAL.RENTAL_ID }, true);
    public static final ForeignKey<PaymentRecord, StaffRecord> FK_PAYMENT_STAFF = Internal.createForeignKey(Payment.PAYMENT, DSL.name("fk_payment_staff"), new TableField[] { Payment.PAYMENT.STAFF_ID }, Keys.KEY_STAFF_PRIMARY, new TableField[] { Staff.STAFF.STAFF_ID }, true);
    public static final ForeignKey<RentalRecord, CustomerRecord> FK_RENTAL_CUSTOMER = Internal.createForeignKey(Rental.RENTAL, DSL.name("fk_rental_customer"), new TableField[] { Rental.RENTAL.CUSTOMER_ID }, Keys.KEY_CUSTOMER_PRIMARY, new TableField[] { Customer.CUSTOMER.CUSTOMER_ID }, true);
    public static final ForeignKey<RentalRecord, InventoryRecord> FK_RENTAL_INVENTORY = Internal.createForeignKey(Rental.RENTAL, DSL.name("fk_rental_inventory"), new TableField[] { Rental.RENTAL.INVENTORY_ID }, Keys.KEY_INVENTORY_PRIMARY, new TableField[] { Inventory.INVENTORY.INVENTORY_ID }, true);
    public static final ForeignKey<RentalRecord, StaffRecord> FK_RENTAL_STAFF = Internal.createForeignKey(Rental.RENTAL, DSL.name("fk_rental_staff"), new TableField[] { Rental.RENTAL.STAFF_ID }, Keys.KEY_STAFF_PRIMARY, new TableField[] { Staff.STAFF.STAFF_ID }, true);
    public static final ForeignKey<StaffRecord, AddressRecord> FK_STAFF_ADDRESS = Internal.createForeignKey(Staff.STAFF, DSL.name("fk_staff_address"), new TableField[] { Staff.STAFF.ADDRESS_ID }, Keys.KEY_ADDRESS_PRIMARY, new TableField[] { Address.ADDRESS.ADDRESS_ID }, true);
    public static final ForeignKey<StaffRecord, StoreRecord> FK_STAFF_STORE = Internal.createForeignKey(Staff.STAFF, DSL.name("fk_staff_store"), new TableField[] { Staff.STAFF.STORE_ID }, Keys.KEY_STORE_PRIMARY, new TableField[] { Store.STORE.STORE_ID }, true);
    public static final ForeignKey<StoreRecord, AddressRecord> FK_STORE_ADDRESS = Internal.createForeignKey(Store.STORE, DSL.name("fk_store_address"), new TableField[] { Store.STORE.ADDRESS_ID }, Keys.KEY_ADDRESS_PRIMARY, new TableField[] { Address.ADDRESS.ADDRESS_ID }, true);
    public static final ForeignKey<StoreRecord, StaffRecord> FK_STORE_STAFF = Internal.createForeignKey(Store.STORE, DSL.name("fk_store_staff"), new TableField[] { Store.STORE.MANAGER_STAFF_ID }, Keys.KEY_STAFF_PRIMARY, new TableField[] { Staff.STAFF.STAFF_ID }, true);
}
