package io.github.jklingsporn.qjre.schema.tables.mappers;

import io.vertx.sqlclient.Row;
import java.util.function.Function;

public class RowMappers {

        private RowMappers(){}

        public static Function<Row,io.github.jklingsporn.qjre.schema.tables.pojos.Actor> getActorMapper() {
                return row -> {
                        io.github.jklingsporn.qjre.schema.tables.pojos.Actor pojo = new io.github.jklingsporn.qjre.schema.tables.pojos.Actor();
                        pojo.setActorId(row.getShort("actor_id"));
                        pojo.setFirstName(row.getString("first_name"));
                        pojo.setLastName(row.getString("last_name"));
                        pojo.setLastUpdate(row.getLocalDateTime("last_update"));
                        return pojo;
                };
        }

        public static Function<Row,io.github.jklingsporn.qjre.schema.tables.pojos.Address> getAddressMapper() {
                return row -> {
                        io.github.jklingsporn.qjre.schema.tables.pojos.Address pojo = new io.github.jklingsporn.qjre.schema.tables.pojos.Address();
                        pojo.setAddressId(row.getShort("address_id"));
                        pojo.setAddress(row.getString("address"));
                        pojo.setAddress2(row.getString("address2"));
                        pojo.setDistrict(row.getString("district"));
                        pojo.setCityId(row.getShort("city_id"));
                        pojo.setPostalCode(row.getString("postal_code"));
                        pojo.setPhone(row.getString("phone"));
                        // Omitting unrecognized type DataType [ t=geometry; p=0; s=0; u="sakila"."address_location"; j=null ] (org.jooq.Geometry) for column location!
                        pojo.setLastUpdate(row.getLocalDateTime("last_update"));
                        return pojo;
                };
        }

        public static Function<Row,io.github.jklingsporn.qjre.schema.tables.pojos.Category> getCategoryMapper() {
                return row -> {
                        io.github.jklingsporn.qjre.schema.tables.pojos.Category pojo = new io.github.jklingsporn.qjre.schema.tables.pojos.Category();
                        pojo.setCategoryId(row.getBoolean("category_id"));
                        pojo.setName(row.getString("name"));
                        pojo.setLastUpdate(row.getLocalDateTime("last_update"));
                        return pojo;
                };
        }

        public static Function<Row,io.github.jklingsporn.qjre.schema.tables.pojos.City> getCityMapper() {
                return row -> {
                        io.github.jklingsporn.qjre.schema.tables.pojos.City pojo = new io.github.jklingsporn.qjre.schema.tables.pojos.City();
                        pojo.setCityId(row.getShort("city_id"));
                        pojo.setCity(row.getString("city"));
                        pojo.setCountryId(row.getShort("country_id"));
                        pojo.setLastUpdate(row.getLocalDateTime("last_update"));
                        return pojo;
                };
        }

        public static Function<Row,io.github.jklingsporn.qjre.schema.tables.pojos.Country> getCountryMapper() {
                return row -> {
                        io.github.jklingsporn.qjre.schema.tables.pojos.Country pojo = new io.github.jklingsporn.qjre.schema.tables.pojos.Country();
                        pojo.setCountryId(row.getShort("country_id"));
                        pojo.setCountry(row.getString("country"));
                        pojo.setLastUpdate(row.getLocalDateTime("last_update"));
                        return pojo;
                };
        }

        public static Function<Row,io.github.jklingsporn.qjre.schema.tables.pojos.Customer> getCustomerMapper() {
                return row -> {
                        io.github.jklingsporn.qjre.schema.tables.pojos.Customer pojo = new io.github.jklingsporn.qjre.schema.tables.pojos.Customer();
                        pojo.setCustomerId(row.getShort("customer_id"));
                        pojo.setStoreId(row.getBoolean("store_id"));
                        pojo.setFirstName(row.getString("first_name"));
                        pojo.setLastName(row.getString("last_name"));
                        pojo.setEmail(row.getString("email"));
                        pojo.setAddressId(row.getShort("address_id"));
                        // Omitting unrecognized type DataType [ t=tinyint(1); p=3; s=0; u="sakila"."customer_active"; j=null ] (java.lang.Byte) for column active!
                        pojo.setCreateDate(row.getLocalDateTime("create_date"));
                        pojo.setLastUpdate(row.getLocalDateTime("last_update"));
                        return pojo;
                };
        }

        public static Function<Row,io.github.jklingsporn.qjre.schema.tables.pojos.Film> getFilmMapper() {
                return row -> {
                        io.github.jklingsporn.qjre.schema.tables.pojos.Film pojo = new io.github.jklingsporn.qjre.schema.tables.pojos.Film();
                        pojo.setFilmId(row.getShort("film_id"));
                        pojo.setTitle(row.getString("title"));
                        pojo.setDescription(row.getString("description"));
                        pojo.setReleaseYear(row.getShort("release_year"));
                        pojo.setLanguageId(row.getBoolean("language_id"));
                        pojo.setOriginalLanguageId(row.getBoolean("original_language_id"));
                        pojo.setRentalDuration(row.getBoolean("rental_duration"));
                        pojo.setRentalRate(row.getBigDecimal("rental_rate"));
                        pojo.setLength(row.getShort("length"));
                        pojo.setReplacementCost(row.getBigDecimal("replacement_cost"));
                        pojo.setRating(java.util.Arrays.stream(io.github.jklingsporn.qjre.schema.enums.FilmRating.values()).filter(td -> td.getLiteral().equals(row.getString("rating"))).findFirst().orElse(null));
                        pojo.setSpecialFeatures(row.getString("special_features"));
                        pojo.setLastUpdate(row.getLocalDateTime("last_update"));
                        return pojo;
                };
        }

        public static Function<Row,io.github.jklingsporn.qjre.schema.tables.pojos.FilmActor> getFilmActorMapper() {
                return row -> {
                        io.github.jklingsporn.qjre.schema.tables.pojos.FilmActor pojo = new io.github.jklingsporn.qjre.schema.tables.pojos.FilmActor();
                        pojo.setActorId(row.getShort("actor_id"));
                        pojo.setFilmId(row.getShort("film_id"));
                        pojo.setLastUpdate(row.getLocalDateTime("last_update"));
                        return pojo;
                };
        }

        public static Function<Row,io.github.jklingsporn.qjre.schema.tables.pojos.FilmCategory> getFilmCategoryMapper() {
                return row -> {
                        io.github.jklingsporn.qjre.schema.tables.pojos.FilmCategory pojo = new io.github.jklingsporn.qjre.schema.tables.pojos.FilmCategory();
                        pojo.setFilmId(row.getShort("film_id"));
                        pojo.setCategoryId(row.getBoolean("category_id"));
                        pojo.setLastUpdate(row.getLocalDateTime("last_update"));
                        return pojo;
                };
        }

        public static Function<Row,io.github.jklingsporn.qjre.schema.tables.pojos.FilmText> getFilmTextMapper() {
                return row -> {
                        io.github.jklingsporn.qjre.schema.tables.pojos.FilmText pojo = new io.github.jklingsporn.qjre.schema.tables.pojos.FilmText();
                        pojo.setFilmId(row.getShort("film_id"));
                        pojo.setTitle(row.getString("title"));
                        pojo.setDescription(row.getString("description"));
                        return pojo;
                };
        }

        public static Function<Row,io.github.jklingsporn.qjre.schema.tables.pojos.Inventory> getInventoryMapper() {
                return row -> {
                        io.github.jklingsporn.qjre.schema.tables.pojos.Inventory pojo = new io.github.jklingsporn.qjre.schema.tables.pojos.Inventory();
                        pojo.setInventoryId(row.getInteger("inventory_id"));
                        pojo.setFilmId(row.getShort("film_id"));
                        pojo.setStoreId(row.getBoolean("store_id"));
                        pojo.setLastUpdate(row.getLocalDateTime("last_update"));
                        return pojo;
                };
        }

        public static Function<Row,io.github.jklingsporn.qjre.schema.tables.pojos.Language> getLanguageMapper() {
                return row -> {
                        io.github.jklingsporn.qjre.schema.tables.pojos.Language pojo = new io.github.jklingsporn.qjre.schema.tables.pojos.Language();
                        pojo.setLanguageId(row.getBoolean("language_id"));
                        pojo.setName(row.getString("name"));
                        pojo.setLastUpdate(row.getLocalDateTime("last_update"));
                        return pojo;
                };
        }

        public static Function<Row,io.github.jklingsporn.qjre.schema.tables.pojos.Payment> getPaymentMapper() {
                return row -> {
                        io.github.jklingsporn.qjre.schema.tables.pojos.Payment pojo = new io.github.jklingsporn.qjre.schema.tables.pojos.Payment();
                        pojo.setPaymentId(row.getShort("payment_id"));
                        pojo.setCustomerId(row.getShort("customer_id"));
                        pojo.setStaffId(row.getBoolean("staff_id"));
                        pojo.setRentalId(row.getInteger("rental_id"));
                        pojo.setAmount(row.getBigDecimal("amount"));
                        pojo.setPaymentDate(row.getLocalDateTime("payment_date"));
                        pojo.setLastUpdate(row.getLocalDateTime("last_update"));
                        return pojo;
                };
        }

        public static Function<Row,io.github.jklingsporn.qjre.schema.tables.pojos.Rental> getRentalMapper() {
                return row -> {
                        io.github.jklingsporn.qjre.schema.tables.pojos.Rental pojo = new io.github.jklingsporn.qjre.schema.tables.pojos.Rental();
                        pojo.setRentalId(row.getInteger("rental_id"));
                        pojo.setRentalDate(row.getLocalDateTime("rental_date"));
                        pojo.setInventoryId(row.getInteger("inventory_id"));
                        pojo.setCustomerId(row.getShort("customer_id"));
                        pojo.setReturnDate(row.getLocalDateTime("return_date"));
                        pojo.setStaffId(row.getBoolean("staff_id"));
                        pojo.setLastUpdate(row.getLocalDateTime("last_update"));
                        return pojo;
                };
        }

        public static Function<Row,io.github.jklingsporn.qjre.schema.tables.pojos.Staff> getStaffMapper() {
                return row -> {
                        io.github.jklingsporn.qjre.schema.tables.pojos.Staff pojo = new io.github.jklingsporn.qjre.schema.tables.pojos.Staff();
                        pojo.setStaffId(row.getBoolean("staff_id"));
                        pojo.setFirstName(row.getString("first_name"));
                        pojo.setLastName(row.getString("last_name"));
                        pojo.setAddressId(row.getShort("address_id"));
                        io.vertx.core.buffer.Buffer pictureBuffer = row.getBuffer("picture");
                        pojo.setPicture(pictureBuffer == null?null:pictureBuffer.getBytes());
                        pojo.setEmail(row.getString("email"));
                        pojo.setStoreId(row.getBoolean("store_id"));
                        // Omitting unrecognized type DataType [ t=tinyint(1); p=3; s=0; u="sakila"."staff_active"; j=null ] (java.lang.Byte) for column active!
                        pojo.setUsername(row.getString("username"));
                        pojo.setPassword(row.getString("password"));
                        pojo.setLastUpdate(row.getLocalDateTime("last_update"));
                        return pojo;
                };
        }

        public static Function<Row,io.github.jklingsporn.qjre.schema.tables.pojos.Store> getStoreMapper() {
                return row -> {
                        io.github.jklingsporn.qjre.schema.tables.pojos.Store pojo = new io.github.jklingsporn.qjre.schema.tables.pojos.Store();
                        pojo.setStoreId(row.getBoolean("store_id"));
                        pojo.setManagerStaffId(row.getBoolean("manager_staff_id"));
                        pojo.setAddressId(row.getShort("address_id"));
                        pojo.setLastUpdate(row.getLocalDateTime("last_update"));
                        return pojo;
                };
        }

}
