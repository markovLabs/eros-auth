/**
 * This class is generated by jOOQ
 */
package com.markovlabs.eros.model.tables.records;


import com.markovlabs.eros.model.tables.Event;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record7;
import org.jooq.Row;
import org.jooq.Row7;
import org.jooq.impl.UpdatableRecordImpl;


/**
 * This class is generated by jOOQ.
 */
@Generated(
	value = {
		"http://www.jooq.org",
		"jOOQ version:3.6.1"
	},
	comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class EventRecord extends UpdatableRecordImpl<EventRecord> implements Record7<Long, String, String, String, Byte, Byte, Long> {

	private static final long serialVersionUID = 1958485907;

	/**
	 * Setter for <code>eros.EVENT.ID</code>.
	 */
	public void setId(Long value) {
		setValue(0, value);
	}

	/**
	 * Getter for <code>eros.EVENT.ID</code>.
	 */
	public Long getId() {
		return (Long) getValue(0);
	}

	/**
	 * Setter for <code>eros.EVENT.EVENT_DATE</code>.
	 */
	public void setEventDate(String value) {
		setValue(1, value);
	}

	/**
	 * Getter for <code>eros.EVENT.EVENT_DATE</code>.
	 */
	public String getEventDate() {
		return (String) getValue(1);
	}

	/**
	 * Setter for <code>eros.EVENT.LOCATION</code>.
	 */
	public void setLocation(String value) {
		setValue(2, value);
	}

	/**
	 * Getter for <code>eros.EVENT.LOCATION</code>.
	 */
	public String getLocation() {
		return (String) getValue(2);
	}

	/**
	 * Setter for <code>eros.EVENT.NAME</code>.
	 */
	public void setName(String value) {
		setValue(3, value);
	}

	/**
	 * Getter for <code>eros.EVENT.NAME</code>.
	 */
	public String getName() {
		return (String) getValue(3);
	}

	/**
	 * Setter for <code>eros.EVENT.STARTED</code>.
	 */
	public void setStarted(Byte value) {
		setValue(4, value);
	}

	/**
	 * Getter for <code>eros.EVENT.STARTED</code>.
	 */
	public Byte getStarted() {
		return (Byte) getValue(4);
	}

	/**
	 * Setter for <code>eros.EVENT.ENDED</code>.
	 */
	public void setEnded(Byte value) {
		setValue(5, value);
	}

	/**
	 * Getter for <code>eros.EVENT.ENDED</code>.
	 */
	public Byte getEnded() {
		return (Byte) getValue(5);
	}

	/**
	 * Setter for <code>eros.EVENT.MAPPING_ID</code>.
	 */
	public void setMappingId(Long value) {
		setValue(6, value);
	}

	/**
	 * Getter for <code>eros.EVENT.MAPPING_ID</code>.
	 */
	public Long getMappingId() {
		return (Long) getValue(6);
	}

	// -------------------------------------------------------------------------
	// Primary key information
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Record1<Long> key() {
		return (Record1) super.key();
	}

	// -------------------------------------------------------------------------
	// Record7 type implementation
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Row7<Long, String, String, String, Byte, Byte, Long> fieldsRow() {
		return (Row7) super.fieldsRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Row7<Long, String, String, String, Byte, Byte, Long> valuesRow() {
		return (Row7) super.valuesRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<Long> field1() {
		return Event.EVENT.ID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<String> field2() {
		return Event.EVENT.EVENT_DATE;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<String> field3() {
		return Event.EVENT.LOCATION;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<String> field4() {
		return Event.EVENT.NAME;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<Byte> field5() {
		return Event.EVENT.STARTED;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<Byte> field6() {
		return Event.EVENT.ENDED;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<Long> field7() {
		return Event.EVENT.MAPPING_ID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Long value1() {
		return getId();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public String value2() {
		return getEventDate();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public String value3() {
		return getLocation();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public String value4() {
		return getName();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Byte value5() {
		return getStarted();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Byte value6() {
		return getEnded();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Long value7() {
		return getMappingId();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public EventRecord value1(Long value) {
		setId(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public EventRecord value2(String value) {
		setEventDate(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public EventRecord value3(String value) {
		setLocation(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public EventRecord value4(String value) {
		setName(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public EventRecord value5(Byte value) {
		setStarted(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public EventRecord value6(Byte value) {
		setEnded(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public EventRecord value7(Long value) {
		setMappingId(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public EventRecord values(Long value1, String value2, String value3, String value4, Byte value5, Byte value6, Long value7) {
		value1(value1);
		value2(value2);
		value3(value3);
		value4(value4);
		value5(value5);
		value6(value6);
		value7(value7);
		return this;
	}

	// -------------------------------------------------------------------------
	// Constructors
	// -------------------------------------------------------------------------

	/**
	 * Create a detached EventRecord
	 */
	public EventRecord() {
		super(Event.EVENT);
	}

	/**
	 * Create a detached, initialised EventRecord
	 */
	public EventRecord(Long id, String eventDate, String location, String name, Byte started, Byte ended, Long mappingId) {
		super(Event.EVENT);

		setValue(0, id);
		setValue(1, eventDate);
		setValue(2, location);
		setValue(3, name);
		setValue(4, started);
		setValue(5, ended);
		setValue(6, mappingId);
	}
}
