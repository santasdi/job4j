package ru.job4j.array;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;
/**
 * Test determination sub word in origin word.
 *
 * @author Artem Bartenev (bartenev92@gmail.com)
 * @version $Id$
 * @since 04.09.2017
 */
public class WordInWordTest {
	 /**
	* Test method of determination word in word.
	*/
	@Test
	public void ifSubWordContainsInOriginWord() {
		WordInWord word = new WordInWord();
		boolean result = word.contains("изподвыподверта", "подве");
		boolean expected = true;
		assertThat(result, is(expected));
	}
}