/*
 * This file is generated by jOOQ.
 */
package io.github.jklingsporn.qjre.schema.tables;


import io.github.jklingsporn.qjre.schema.Indexes;
import io.github.jklingsporn.qjre.schema.Keys;
import io.github.jklingsporn.qjre.schema.Sakila;
import io.github.jklingsporn.qjre.schema.tables.records.FilmTextRecord;

import java.util.Arrays;
import java.util.List;

import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Index;
import org.jooq.Name;
import org.jooq.Record;
import org.jooq.Row3;
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
public class FilmText extends TableImpl<FilmTextRecord> {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of <code>sakila.film_text</code>
     */
    public static final FilmText FILM_TEXT = new FilmText();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<FilmTextRecord> getRecordType() {
        return FilmTextRecord.class;
    }

    /**
     * The column <code>sakila.film_text.film_id</code>.
     */
    public final TableField<FilmTextRecord, Short> FILM_ID = createField(DSL.name("film_id"), SQLDataType.SMALLINT.nullable(false), this, "");

    /**
     * The column <code>sakila.film_text.title</code>.
     */
    public final TableField<FilmTextRecord, String> TITLE = createField(DSL.name("title"), SQLDataType.VARCHAR(255).nullable(false), this, "");

    /**
     * The column <code>sakila.film_text.description</code>.
     */
    public final TableField<FilmTextRecord, String> DESCRIPTION = createField(DSL.name("description"), SQLDataType.CLOB, this, "");

    private FilmText(Name alias, Table<FilmTextRecord> aliased) {
        this(alias, aliased, null);
    }

    private FilmText(Name alias, Table<FilmTextRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.table());
    }

    /**
     * Create an aliased <code>sakila.film_text</code> table reference
     */
    public FilmText(String alias) {
        this(DSL.name(alias), FILM_TEXT);
    }

    /**
     * Create an aliased <code>sakila.film_text</code> table reference
     */
    public FilmText(Name alias) {
        this(alias, FILM_TEXT);
    }

    /**
     * Create a <code>sakila.film_text</code> table reference
     */
    public FilmText() {
        this(DSL.name("film_text"), null);
    }

    public <O extends Record> FilmText(Table<O> child, ForeignKey<O, FilmTextRecord> key) {
        super(child, key, FILM_TEXT);
    }

    @Override
    public Schema getSchema() {
        return aliased() ? null : Sakila.SAKILA;
    }

    @Override
    public List<Index> getIndexes() {
        return Arrays.asList(Indexes.FILM_TEXT_IDX_TITLE_DESCRIPTION);
    }

    @Override
    public UniqueKey<FilmTextRecord> getPrimaryKey() {
        return Keys.KEY_FILM_TEXT_PRIMARY;
    }

    @Override
    public FilmText as(String alias) {
        return new FilmText(DSL.name(alias), this);
    }

    @Override
    public FilmText as(Name alias) {
        return new FilmText(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public FilmText rename(String name) {
        return new FilmText(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public FilmText rename(Name name) {
        return new FilmText(name, null);
    }

    // -------------------------------------------------------------------------
    // Row3 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row3<Short, String, String> fieldsRow() {
        return (Row3) super.fieldsRow();
    }
}
