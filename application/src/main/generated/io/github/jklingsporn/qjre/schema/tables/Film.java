/*
 * This file is generated by jOOQ.
 */
package io.github.jklingsporn.qjre.schema.tables;


import io.github.jklingsporn.qjre.schema.Indexes;
import io.github.jklingsporn.qjre.schema.Keys;
import io.github.jklingsporn.qjre.schema.Sakila;
import io.github.jklingsporn.qjre.schema.enums.FilmRating;
import io.github.jklingsporn.qjre.schema.tables.records.FilmRecord;

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
import org.jooq.Row13;
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
public class Film extends TableImpl<FilmRecord> {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of <code>sakila.film</code>
     */
    public static final Film FILM = new Film();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<FilmRecord> getRecordType() {
        return FilmRecord.class;
    }

    /**
     * The column <code>sakila.film.film_id</code>.
     */
    public final TableField<FilmRecord, Short> FILM_ID = createField(DSL.name("film_id"), SQLDataType.SMALLINT.nullable(false).identity(true), this, "");

    /**
     * The column <code>sakila.film.title</code>.
     */
    public final TableField<FilmRecord, String> TITLE = createField(DSL.name("title"), SQLDataType.VARCHAR(128).nullable(false), this, "");

    /**
     * The column <code>sakila.film.description</code>.
     */
    public final TableField<FilmRecord, String> DESCRIPTION = createField(DSL.name("description"), SQLDataType.CLOB, this, "");

    /**
     * The column <code>sakila.film.release_year</code>.
     */
    public final TableField<FilmRecord, Short> RELEASE_YEAR = createField(DSL.name("release_year"), SQLDataType.SMALLINT, this, "");

    /**
     * The column <code>sakila.film.language_id</code>.
     */
    public final TableField<FilmRecord, Boolean> LANGUAGE_ID = createField(DSL.name("language_id"), SQLDataType.BOOLEAN.nullable(false), this, "");

    /**
     * The column <code>sakila.film.original_language_id</code>.
     */
    public final TableField<FilmRecord, Boolean> ORIGINAL_LANGUAGE_ID = createField(DSL.name("original_language_id"), SQLDataType.BOOLEAN, this, "");

    /**
     * The column <code>sakila.film.rental_duration</code>.
     */
    public final TableField<FilmRecord, Boolean> RENTAL_DURATION = createField(DSL.name("rental_duration"), SQLDataType.BOOLEAN.nullable(false).defaultValue(DSL.inline("3", SQLDataType.BOOLEAN)), this, "");

    /**
     * The column <code>sakila.film.rental_rate</code>.
     */
    public final TableField<FilmRecord, BigDecimal> RENTAL_RATE = createField(DSL.name("rental_rate"), SQLDataType.DECIMAL(4, 2).nullable(false).defaultValue(DSL.inline("4.99", SQLDataType.DECIMAL)), this, "");

    /**
     * The column <code>sakila.film.length</code>.
     */
    public final TableField<FilmRecord, Short> LENGTH = createField(DSL.name("length"), SQLDataType.SMALLINT, this, "");

    /**
     * The column <code>sakila.film.replacement_cost</code>.
     */
    public final TableField<FilmRecord, BigDecimal> REPLACEMENT_COST = createField(DSL.name("replacement_cost"), SQLDataType.DECIMAL(5, 2).nullable(false).defaultValue(DSL.inline("19.99", SQLDataType.DECIMAL)), this, "");

    /**
     * The column <code>sakila.film.rating</code>.
     */
    public final TableField<FilmRecord, FilmRating> RATING = createField(DSL.name("rating"), SQLDataType.VARCHAR(5).defaultValue(DSL.inline("G", SQLDataType.VARCHAR)).asEnumDataType(io.github.jklingsporn.qjre.schema.enums.FilmRating.class), this, "");

    /**
     * The column <code>sakila.film.special_features</code>.
     */
    public final TableField<FilmRecord, String> SPECIAL_FEATURES = createField(DSL.name("special_features"), SQLDataType.VARCHAR(54), this, "");

    /**
     * The column <code>sakila.film.last_update</code>.
     */
    public final TableField<FilmRecord, LocalDateTime> LAST_UPDATE = createField(DSL.name("last_update"), SQLDataType.LOCALDATETIME(0).nullable(false), this, "");

    private Film(Name alias, Table<FilmRecord> aliased) {
        this(alias, aliased, null);
    }

    private Film(Name alias, Table<FilmRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.table());
    }

    /**
     * Create an aliased <code>sakila.film</code> table reference
     */
    public Film(String alias) {
        this(DSL.name(alias), FILM);
    }

    /**
     * Create an aliased <code>sakila.film</code> table reference
     */
    public Film(Name alias) {
        this(alias, FILM);
    }

    /**
     * Create a <code>sakila.film</code> table reference
     */
    public Film() {
        this(DSL.name("film"), null);
    }

    public <O extends Record> Film(Table<O> child, ForeignKey<O, FilmRecord> key) {
        super(child, key, FILM);
    }

    @Override
    public Schema getSchema() {
        return aliased() ? null : Sakila.SAKILA;
    }

    @Override
    public List<Index> getIndexes() {
        return Arrays.asList(Indexes.FILM_IDX_FK_LANGUAGE_ID, Indexes.FILM_IDX_FK_ORIGINAL_LANGUAGE_ID, Indexes.FILM_IDX_TITLE);
    }

    @Override
    public Identity<FilmRecord, Short> getIdentity() {
        return (Identity<FilmRecord, Short>) super.getIdentity();
    }

    @Override
    public UniqueKey<FilmRecord> getPrimaryKey() {
        return Keys.KEY_FILM_PRIMARY;
    }

    @Override
    public List<ForeignKey<FilmRecord, ?>> getReferences() {
        return Arrays.asList(Keys.FK_FILM_LANGUAGE, Keys.FK_FILM_LANGUAGE_ORIGINAL);
    }

    private transient Language _fkFilmLanguage;
    private transient Language _fkFilmLanguageOriginal;

    /**
     * Get the implicit join path to the <code>sakila.language</code> table, via
     * the <code>fk_film_language</code> key.
     */
    public Language fkFilmLanguage() {
        if (_fkFilmLanguage == null)
            _fkFilmLanguage = new Language(this, Keys.FK_FILM_LANGUAGE);

        return _fkFilmLanguage;
    }

    /**
     * Get the implicit join path to the <code>sakila.language</code> table, via
     * the <code>fk_film_language_original</code> key.
     */
    public Language fkFilmLanguageOriginal() {
        if (_fkFilmLanguageOriginal == null)
            _fkFilmLanguageOriginal = new Language(this, Keys.FK_FILM_LANGUAGE_ORIGINAL);

        return _fkFilmLanguageOriginal;
    }

    @Override
    public Film as(String alias) {
        return new Film(DSL.name(alias), this);
    }

    @Override
    public Film as(Name alias) {
        return new Film(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public Film rename(String name) {
        return new Film(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public Film rename(Name name) {
        return new Film(name, null);
    }

    // -------------------------------------------------------------------------
    // Row13 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row13<Short, String, String, Short, Boolean, Boolean, Boolean, BigDecimal, Short, BigDecimal, FilmRating, String, LocalDateTime> fieldsRow() {
        return (Row13) super.fieldsRow();
    }
}