/*
 * This file is generated by jOOQ.
 */
package io.github.jklingsporn.qjre.schema;


import io.github.jklingsporn.qjre.schema.tables.Actor;
import io.github.jklingsporn.qjre.schema.tables.ActorInfo;
import io.github.jklingsporn.qjre.schema.tables.Address;
import io.github.jklingsporn.qjre.schema.tables.Category;
import io.github.jklingsporn.qjre.schema.tables.City;
import io.github.jklingsporn.qjre.schema.tables.Country;
import io.github.jklingsporn.qjre.schema.tables.Customer;
import io.github.jklingsporn.qjre.schema.tables.CustomerList;
import io.github.jklingsporn.qjre.schema.tables.Film;
import io.github.jklingsporn.qjre.schema.tables.FilmActor;
import io.github.jklingsporn.qjre.schema.tables.FilmCategory;
import io.github.jklingsporn.qjre.schema.tables.FilmList;
import io.github.jklingsporn.qjre.schema.tables.FilmText;
import io.github.jklingsporn.qjre.schema.tables.Inventory;
import io.github.jklingsporn.qjre.schema.tables.Language;
import io.github.jklingsporn.qjre.schema.tables.NicerButSlowerFilmList;
import io.github.jklingsporn.qjre.schema.tables.Payment;
import io.github.jklingsporn.qjre.schema.tables.Rental;
import io.github.jklingsporn.qjre.schema.tables.SalesByFilmCategory;
import io.github.jklingsporn.qjre.schema.tables.SalesByStore;
import io.github.jklingsporn.qjre.schema.tables.Staff;
import io.github.jklingsporn.qjre.schema.tables.StaffList;
import io.github.jklingsporn.qjre.schema.tables.Store;

import java.util.Arrays;
import java.util.List;

import org.jooq.Catalog;
import org.jooq.Table;
import org.jooq.impl.SchemaImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Sakila extends SchemaImpl {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of <code>sakila</code>
     */
    public static final Sakila SAKILA = new Sakila();

    /**
     * The table <code>sakila.actor</code>.
     */
    public final Actor ACTOR = Actor.ACTOR;

    /**
     * VIEW
     */
    public final ActorInfo ACTOR_INFO = ActorInfo.ACTOR_INFO;

    /**
     * The table <code>sakila.address</code>.
     */
    public final Address ADDRESS = Address.ADDRESS;

    /**
     * The table <code>sakila.category</code>.
     */
    public final Category CATEGORY = Category.CATEGORY;

    /**
     * The table <code>sakila.city</code>.
     */
    public final City CITY = City.CITY;

    /**
     * The table <code>sakila.country</code>.
     */
    public final Country COUNTRY = Country.COUNTRY;

    /**
     * The table <code>sakila.customer</code>.
     */
    public final Customer CUSTOMER = Customer.CUSTOMER;

    /**
     * VIEW
     */
    public final CustomerList CUSTOMER_LIST = CustomerList.CUSTOMER_LIST;

    /**
     * The table <code>sakila.film</code>.
     */
    public final Film FILM = Film.FILM;

    /**
     * The table <code>sakila.film_actor</code>.
     */
    public final FilmActor FILM_ACTOR = FilmActor.FILM_ACTOR;

    /**
     * The table <code>sakila.film_category</code>.
     */
    public final FilmCategory FILM_CATEGORY = FilmCategory.FILM_CATEGORY;

    /**
     * VIEW
     */
    public final FilmList FILM_LIST = FilmList.FILM_LIST;

    /**
     * The table <code>sakila.film_text</code>.
     */
    public final FilmText FILM_TEXT = FilmText.FILM_TEXT;

    /**
     * The table <code>sakila.inventory</code>.
     */
    public final Inventory INVENTORY = Inventory.INVENTORY;

    /**
     * The table <code>sakila.language</code>.
     */
    public final Language LANGUAGE = Language.LANGUAGE;

    /**
     * VIEW
     */
    public final NicerButSlowerFilmList NICER_BUT_SLOWER_FILM_LIST = NicerButSlowerFilmList.NICER_BUT_SLOWER_FILM_LIST;

    /**
     * The table <code>sakila.payment</code>.
     */
    public final Payment PAYMENT = Payment.PAYMENT;

    /**
     * The table <code>sakila.rental</code>.
     */
    public final Rental RENTAL = Rental.RENTAL;

    /**
     * VIEW
     */
    public final SalesByFilmCategory SALES_BY_FILM_CATEGORY = SalesByFilmCategory.SALES_BY_FILM_CATEGORY;

    /**
     * VIEW
     */
    public final SalesByStore SALES_BY_STORE = SalesByStore.SALES_BY_STORE;

    /**
     * The table <code>sakila.staff</code>.
     */
    public final Staff STAFF = Staff.STAFF;

    /**
     * VIEW
     */
    public final StaffList STAFF_LIST = StaffList.STAFF_LIST;

    /**
     * The table <code>sakila.store</code>.
     */
    public final Store STORE = Store.STORE;

    /**
     * No further instances allowed
     */
    private Sakila() {
        super("sakila", null);
    }


    @Override
    public Catalog getCatalog() {
        return DefaultCatalog.DEFAULT_CATALOG;
    }

    @Override
    public final List<Table<?>> getTables() {
        return Arrays.asList(
            Actor.ACTOR,
            ActorInfo.ACTOR_INFO,
            Address.ADDRESS,
            Category.CATEGORY,
            City.CITY,
            Country.COUNTRY,
            Customer.CUSTOMER,
            CustomerList.CUSTOMER_LIST,
            Film.FILM,
            FilmActor.FILM_ACTOR,
            FilmCategory.FILM_CATEGORY,
            FilmList.FILM_LIST,
            FilmText.FILM_TEXT,
            Inventory.INVENTORY,
            Language.LANGUAGE,
            NicerButSlowerFilmList.NICER_BUT_SLOWER_FILM_LIST,
            Payment.PAYMENT,
            Rental.RENTAL,
            SalesByFilmCategory.SALES_BY_FILM_CATEGORY,
            SalesByStore.SALES_BY_STORE,
            Staff.STAFF,
            StaffList.STAFF_LIST,
            Store.STORE
        );
    }
}
