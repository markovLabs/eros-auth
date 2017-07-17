/**
 * This class is generated by jOOQ
 */
package com.markovlabs.eros.model;


import com.markovlabs.eros.model.tables.Dater;
import com.markovlabs.eros.model.tables.DatingMapping;
import com.markovlabs.eros.model.tables.EvaluationAnswers;
import com.markovlabs.eros.model.tables.Event;
import com.markovlabs.eros.model.tables.EventDaters;
import com.markovlabs.eros.model.tables.Image;
import com.markovlabs.eros.model.tables.Messages;
import com.markovlabs.eros.model.tables.ProfileAnswers;
import com.markovlabs.eros.model.tables.Question;
import com.markovlabs.eros.model.tables.Story;
import com.markovlabs.eros.model.tables.StoryAnswers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import javax.annotation.Generated;

import org.jooq.Table;
import org.jooq.impl.SchemaImpl;


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
public class Eros extends SchemaImpl {

	private static final long serialVersionUID = 1541263078;

	/**
	 * The reference instance of <code>eros</code>
	 */
	public static final Eros EROS = new Eros();

	/**
	 * No further instances allowed
	 */
	private Eros() {
		super("eros");
	}

	@Override
	public final List<Table<?>> getTables() {
		List result = new ArrayList();
		result.addAll(getTables0());
		return result;
	}

	private final List<Table<?>> getTables0() {
		return Arrays.<Table<?>>asList(
			Dater.DATER,
			DatingMapping.DATING_MAPPING,
			EvaluationAnswers.EVALUATION_ANSWERS,
			Event.EVENT,
			EventDaters.EVENT_DATERS,
			Image.IMAGE,
			Messages.MESSAGES,
			ProfileAnswers.PROFILE_ANSWERS,
			Question.QUESTION,
			Story.STORY,
			StoryAnswers.STORY_ANSWERS);
	}
}
