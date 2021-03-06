/**
 * This class is generated by jOOQ
 */
package com.markovlabs.eros.model.tables;


import com.markovlabs.eros.model.Eros;
import com.markovlabs.eros.model.Keys;
import com.markovlabs.eros.model.tables.records.ImageRecord;

import java.util.Arrays;
import java.util.List;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Identity;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.UniqueKey;
import org.jooq.impl.TableImpl;


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
public class Image extends TableImpl<ImageRecord> {

	private static final long serialVersionUID = 1850631854;

	/**
	 * The reference instance of <code>eros.IMAGE</code>
	 */
	public static final Image IMAGE = new Image();

	/**
	 * The class holding records for this type
	 */
	@Override
	public Class<ImageRecord> getRecordType() {
		return ImageRecord.class;
	}

	/**
	 * The column <code>eros.IMAGE.ID</code>.
	 */
	public final TableField<ImageRecord, Long> ID = createField("ID", org.jooq.impl.SQLDataType.BIGINT.nullable(false), this, "");

	/**
	 * The column <code>eros.IMAGE.DATER_ID</code>.
	 */
	public final TableField<ImageRecord, Long> DATER_ID = createField("DATER_ID", org.jooq.impl.SQLDataType.BIGINT.nullable(false), this, "");

	/**
	 * The column <code>eros.IMAGE.NAME</code>.
	 */
	public final TableField<ImageRecord, String> NAME = createField("NAME", org.jooq.impl.SQLDataType.VARCHAR.length(50).nullable(false), this, "");

	/**
	 * Create a <code>eros.IMAGE</code> table reference
	 */
	public Image() {
		this("IMAGE", null);
	}

	/**
	 * Create an aliased <code>eros.IMAGE</code> table reference
	 */
	public Image(String alias) {
		this(alias, IMAGE);
	}

	private Image(String alias, Table<ImageRecord> aliased) {
		this(alias, aliased, null);
	}

	private Image(String alias, Table<ImageRecord> aliased, Field<?>[] parameters) {
		super(alias, Eros.EROS, aliased, parameters, "");
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Identity<ImageRecord, Long> getIdentity() {
		return Keys.IDENTITY_IMAGE;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public UniqueKey<ImageRecord> getPrimaryKey() {
		return Keys.KEY_IMAGE_PRIMARY;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public List<UniqueKey<ImageRecord>> getKeys() {
		return Arrays.<UniqueKey<ImageRecord>>asList(Keys.KEY_IMAGE_PRIMARY);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public List<ForeignKey<ImageRecord, ?>> getReferences() {
		return Arrays.<ForeignKey<ImageRecord, ?>>asList(Keys.DATER_ID_FK_2);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Image as(String alias) {
		return new Image(alias, this);
	}

	/**
	 * Rename this table
	 */
	public Image rename(String name) {
		return new Image(name, null);
	}
}
