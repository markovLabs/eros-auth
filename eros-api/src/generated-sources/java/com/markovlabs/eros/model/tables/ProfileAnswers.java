/**
 * This class is generated by jOOQ
 */
package com.markovlabs.eros.model.tables;


import com.markovlabs.eros.model.Eros;
import com.markovlabs.eros.model.Keys;
import com.markovlabs.eros.model.tables.records.ProfileAnswersRecord;

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
public class ProfileAnswers extends TableImpl<ProfileAnswersRecord> {

	private static final long serialVersionUID = -2111438949;

	/**
	 * The reference instance of <code>eros.PROFILE_ANSWERS</code>
	 */
	public static final ProfileAnswers PROFILE_ANSWERS = new ProfileAnswers();

	/**
	 * The class holding records for this type
	 */
	@Override
	public Class<ProfileAnswersRecord> getRecordType() {
		return ProfileAnswersRecord.class;
	}

	/**
	 * The column <code>eros.PROFILE_ANSWERS.ID</code>.
	 */
	public final TableField<ProfileAnswersRecord, Long> ID = createField("ID", org.jooq.impl.SQLDataType.BIGINT.nullable(false), this, "");

	/**
	 * The column <code>eros.PROFILE_ANSWERS.DATER_ID</code>.
	 */
	public final TableField<ProfileAnswersRecord, Long> DATER_ID = createField("DATER_ID", org.jooq.impl.SQLDataType.BIGINT.nullable(false), this, "");

	/**
	 * The column <code>eros.PROFILE_ANSWERS.QUESTION_ID</code>.
	 */
	public final TableField<ProfileAnswersRecord, Long> QUESTION_ID = createField("QUESTION_ID", org.jooq.impl.SQLDataType.BIGINT.nullable(false), this, "");

	/**
	 * The column <code>eros.PROFILE_ANSWERS.ANSWER</code>.
	 */
	public final TableField<ProfileAnswersRecord, String> ANSWER = createField("ANSWER", org.jooq.impl.SQLDataType.CLOB.nullable(false), this, "");

	/**
	 * Create a <code>eros.PROFILE_ANSWERS</code> table reference
	 */
	public ProfileAnswers() {
		this("PROFILE_ANSWERS", null);
	}

	/**
	 * Create an aliased <code>eros.PROFILE_ANSWERS</code> table reference
	 */
	public ProfileAnswers(String alias) {
		this(alias, PROFILE_ANSWERS);
	}

	private ProfileAnswers(String alias, Table<ProfileAnswersRecord> aliased) {
		this(alias, aliased, null);
	}

	private ProfileAnswers(String alias, Table<ProfileAnswersRecord> aliased, Field<?>[] parameters) {
		super(alias, Eros.EROS, aliased, parameters, "");
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Identity<ProfileAnswersRecord, Long> getIdentity() {
		return Keys.IDENTITY_PROFILE_ANSWERS;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public UniqueKey<ProfileAnswersRecord> getPrimaryKey() {
		return Keys.KEY_PROFILE_ANSWERS_PRIMARY;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public List<UniqueKey<ProfileAnswersRecord>> getKeys() {
		return Arrays.<UniqueKey<ProfileAnswersRecord>>asList(Keys.KEY_PROFILE_ANSWERS_PRIMARY);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public List<ForeignKey<ProfileAnswersRecord, ?>> getReferences() {
		return Arrays.<ForeignKey<ProfileAnswersRecord, ?>>asList(Keys.DATER_ID_FK_10, Keys.QUESTION_ID_FK_1);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public ProfileAnswers as(String alias) {
		return new ProfileAnswers(alias, this);
	}

	/**
	 * Rename this table
	 */
	public ProfileAnswers rename(String name) {
		return new ProfileAnswers(name, null);
	}
}