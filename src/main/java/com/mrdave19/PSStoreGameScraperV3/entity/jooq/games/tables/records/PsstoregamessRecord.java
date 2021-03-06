/*
 * This file is generated by jOOQ.
 */
package com.mrdave19.PSStoreGameScraperV3.entity.jooq.games.tables.records;


import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record5;
import org.jooq.Row5;
import org.jooq.impl.UpdatableRecordImpl;

import com.mrdave19.PSStoreGameScraperV3.entity.jooq.games.tables.Psstoregamess;


/**
 * This class is generated by jOOQ.
 */

@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class PsstoregamessRecord extends UpdatableRecordImpl<PsstoregamessRecord> implements Record5<String, String, String, String, String> {

    private static final long serialVersionUID = 1643139784;

    /**
     * Setter for <code>games.psstoregamess.id</code>.
     */
    public void setId(String value) {
        set(0, value);
    }

    /**
     * Getter for <code>games.psstoregamess.id</code>.
     */
    public String getId() {
        return (String) get(0);
    }

    /**
     * Setter for <code>games.psstoregamess.device</code>.
     */
    public void setDevice(String value) {
        set(1, value);
    }

    /**
     * Getter for <code>games.psstoregamess.device</code>.
     */
    public String getDevice() {
        return (String) get(1);
    }

    /**
     * Setter for <code>games.psstoregamess.name</code>.
     */
    public void setName(String value) {
        set(2, value);
    }

    /**
     * Getter for <code>games.psstoregamess.name</code>.
     */
    public String getName() {
        return (String) get(2);
    }

    /**
     * Setter for <code>games.psstoregamess.price</code>.
     */
    public void setPrice(String value) {
        set(3, value);
    }

    /**
     * Getter for <code>games.psstoregamess.price</code>.
     */
    public String getPrice() {
        return (String) get(3);
    }

    /**
     * Setter for <code>games.psstoregamess.type</code>.
     */
    public void setType(String value) {
        set(4, value);
    }

    /**
     * Getter for <code>games.psstoregamess.type</code>.
     */
    public String getType() {
        return (String) get(4);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    @Override
    public Record1<String> key() {
        return (Record1) super.key();
    }

    // -------------------------------------------------------------------------
    // Record5 type implementation
    // -------------------------------------------------------------------------

    @Override
    public Row5<String, String, String, String, String> fieldsRow() {
        return (Row5) super.fieldsRow();
    }

    @Override
    public Row5<String, String, String, String, String> valuesRow() {
        return (Row5) super.valuesRow();
    }

    @Override
    public Field<String> field1() {
        return Psstoregamess.PSSTOREGAMESS.ID;
    }

    @Override
    public Field<String> field2() {
        return Psstoregamess.PSSTOREGAMESS.DEVICE;
    }

    @Override
    public Field<String> field3() {
        return Psstoregamess.PSSTOREGAMESS.NAME;
    }

    @Override
    public Field<String> field4() {
        return Psstoregamess.PSSTOREGAMESS.PRICE;
    }

    @Override
    public Field<String> field5() {
        return Psstoregamess.PSSTOREGAMESS.TYPE;
    }

    @Override
    public String component1() {
        return getId();
    }

    @Override
    public String component2() {
        return getDevice();
    }

    @Override
    public String component3() {
        return getName();
    }

    @Override
    public String component4() {
        return getPrice();
    }

    @Override
    public String component5() {
        return getType();
    }

    @Override
    public String value1() {
        return getId();
    }

    @Override
    public String value2() {
        return getDevice();
    }

    @Override
    public String value3() {
        return getName();
    }

    @Override
    public String value4() {
        return getPrice();
    }

    @Override
    public String value5() {
        return getType();
    }

    @Override
    public PsstoregamessRecord value1(String value) {
        setId(value);
        return this;
    }

    @Override
    public PsstoregamessRecord value2(String value) {
        setDevice(value);
        return this;
    }

    @Override
    public PsstoregamessRecord value3(String value) {
        setName(value);
        return this;
    }

    @Override
    public PsstoregamessRecord value4(String value) {
        setPrice(value);
        return this;
    }

    @Override
    public PsstoregamessRecord value5(String value) {
        setType(value);
        return this;
    }

    @Override
    public PsstoregamessRecord values(String value1, String value2, String value3, String value4, String value5) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        value5(value5);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached PsstoregamessRecord
     */
    public PsstoregamessRecord() {
        super(Psstoregamess.PSSTOREGAMESS);
    }

    /**
     * Create a detached, initialised PsstoregamessRecord
     */
    public PsstoregamessRecord(String id, String device, String name, String price, String type) {
        super(Psstoregamess.PSSTOREGAMESS);

        set(0, id);
        set(1, device);
        set(2, name);
        set(3, price);
        set(4, type);
    }
}
