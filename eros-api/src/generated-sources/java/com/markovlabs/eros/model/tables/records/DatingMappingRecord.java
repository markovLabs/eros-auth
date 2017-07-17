/**
 * This class is generated by jOOQ
 */
package com.markovlabs.eros.model.tables.records;


import com.markovlabs.eros.model.tables.DatingMapping;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record2;
import org.jooq.Row;
import org.jooq.Row2;
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
public class DatingMappingRecord extends UpdatableRecordImpl<DatingMappingRecord> implements Record2<Long, String> {

	private static final long serialVersionUID = -2059986594;

	/**
	 * Setter for <code>eros.DATING_MAPPING.ID</code>.
	 */
	public void setId(Long value) {
		setValue(0, value);
	}

	/**
	 * Getter for <code>eros.DATING_MAPPING.ID</code>.
	 */
	public Long getId() {
		return (Long) getValue(0);
	}

	/**
	 * Setter for <code>eros.DATING_MAPPING.MAPPING</code>.
	 */
	public void setMapping(String value) {
		setValue(1, value);
	}

	/**
	 * Getter for <code>eros.DATING_MAPPING.MAPPING</code>.
	 */
	public String getMapping() {
		return (String) getValue(1);
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
	// Record2 type implementation
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Row2<Long, String> fieldsRow() {
		return (Row2) super.fieldsRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Row2<Long, String> valuesRow() {
		return (Row2) super.valuesRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<Long> field1() {
		return DatingMapping.DATING_MAPPING.ID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<String> field2() {
		return DatingMapping.DATING_MAPPING.MAPPING;
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
		return getMapping();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public DatingMappingRecord value1(Long value) {
		setId(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public DatingMappingRecord value2(String value) {
		setMapping(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public DatingMappingRecord values(Long value1, String value2) {
		value1(value1);
		value2(value2);
		return this;
	}

	// -------------------------------------------------------------------------
	// Constructors
	// -------------------------------------------------------------------------

	/**
	 * Create a detached DatingMappingRecord
	 */
	public DatingMappingRecord() {
		super(DatingMapping.DATING_MAPPING);
	}

	/**
	 * Create a detached, initialised DatingMappingRecord
	 */
	public DatingMappingRecord(Long id, String mapping) {
		super(DatingMapping.DATING_MAPPING);

		setValue(0, id);
		setValue(1, mapping);
	}
}
