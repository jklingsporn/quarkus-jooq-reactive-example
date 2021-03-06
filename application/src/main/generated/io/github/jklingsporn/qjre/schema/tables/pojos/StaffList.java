/*
 * This file is generated by jOOQ.
 */
package io.github.jklingsporn.qjre.schema.tables.pojos;


import io.github.jklingsporn.qjre.schema.tables.interfaces.IStaffList;
import io.github.jklingsporn.vertx.jooq.shared.internal.VertxPojo;


import static io.github.jklingsporn.vertx.jooq.shared.internal.VertxPojo.*;
/**
 * VIEW
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class StaffList implements VertxPojo, IStaffList {

    private static final long serialVersionUID = 1L;

    private Boolean id;
    private String  name;
    private String  address;
    private String  zipCode;
    private String  phone;
    private String  city;
    private String  country;
    private Boolean sid;

    public StaffList() {}

    public StaffList(IStaffList value) {
        this.id = value.getId();
        this.name = value.getName();
        this.address = value.getAddress();
        this.zipCode = value.getZipCode();
        this.phone = value.getPhone();
        this.city = value.getCity();
        this.country = value.getCountry();
        this.sid = value.getSid();
    }

    public StaffList(
        Boolean id,
        String  name,
        String  address,
        String  zipCode,
        String  phone,
        String  city,
        String  country,
        Boolean sid
    ) {
        this.id = id;
        this.name = name;
        this.address = address;
        this.zipCode = zipCode;
        this.phone = phone;
        this.city = city;
        this.country = country;
        this.sid = sid;
    }

        public StaffList(io.vertx.core.json.JsonObject json) {
                this();
                fromJson(json);
        }

    /**
     * Getter for <code>sakila.staff_list.ID</code>.
     */
    @Override
    public Boolean getId() {
        return this.id;
    }

    /**
     * Setter for <code>sakila.staff_list.ID</code>.
     */
    @Override
    public StaffList setId(Boolean id) {
        this.id = id;
        return this;
    }

    /**
     * Getter for <code>sakila.staff_list.name</code>.
     */
    @Override
    public String getName() {
        return this.name;
    }

    /**
     * Setter for <code>sakila.staff_list.name</code>.
     */
    @Override
    public StaffList setName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Getter for <code>sakila.staff_list.address</code>.
     */
    @Override
    public String getAddress() {
        return this.address;
    }

    /**
     * Setter for <code>sakila.staff_list.address</code>.
     */
    @Override
    public StaffList setAddress(String address) {
        this.address = address;
        return this;
    }

    /**
     * Getter for <code>sakila.staff_list.zip code</code>.
     */
    @Override
    public String getZipCode() {
        return this.zipCode;
    }

    /**
     * Setter for <code>sakila.staff_list.zip code</code>.
     */
    @Override
    public StaffList setZipCode(String zipCode) {
        this.zipCode = zipCode;
        return this;
    }

    /**
     * Getter for <code>sakila.staff_list.phone</code>.
     */
    @Override
    public String getPhone() {
        return this.phone;
    }

    /**
     * Setter for <code>sakila.staff_list.phone</code>.
     */
    @Override
    public StaffList setPhone(String phone) {
        this.phone = phone;
        return this;
    }

    /**
     * Getter for <code>sakila.staff_list.city</code>.
     */
    @Override
    public String getCity() {
        return this.city;
    }

    /**
     * Setter for <code>sakila.staff_list.city</code>.
     */
    @Override
    public StaffList setCity(String city) {
        this.city = city;
        return this;
    }

    /**
     * Getter for <code>sakila.staff_list.country</code>.
     */
    @Override
    public String getCountry() {
        return this.country;
    }

    /**
     * Setter for <code>sakila.staff_list.country</code>.
     */
    @Override
    public StaffList setCountry(String country) {
        this.country = country;
        return this;
    }

    /**
     * Getter for <code>sakila.staff_list.SID</code>.
     */
    @Override
    public Boolean getSid() {
        return this.sid;
    }

    /**
     * Setter for <code>sakila.staff_list.SID</code>.
     */
    @Override
    public StaffList setSid(Boolean sid) {
        this.sid = sid;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("StaffList (");

        sb.append(id);
        sb.append(", ").append(name);
        sb.append(", ").append(address);
        sb.append(", ").append(zipCode);
        sb.append(", ").append(phone);
        sb.append(", ").append(city);
        sb.append(", ").append(country);
        sb.append(", ").append(sid);

        sb.append(")");
        return sb.toString();
    }

    // -------------------------------------------------------------------------
    // FROM and INTO
    // -------------------------------------------------------------------------

    @Override
    public void from(IStaffList from) {
        setId(from.getId());
        setName(from.getName());
        setAddress(from.getAddress());
        setZipCode(from.getZipCode());
        setPhone(from.getPhone());
        setCity(from.getCity());
        setCountry(from.getCountry());
        setSid(from.getSid());
    }

    @Override
    public <E extends IStaffList> E into(E into) {
        into.from(this);
        return into;
    }
}
