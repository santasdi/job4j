package ru.job4j.max;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;
/**
 * Test method for finding max number.
 *
 * @author Artem Bartenev (bartenev92@gmail.com)
 * @version $Id$
 * @since 0.1
 */
 public class MaxTest {
	/**
	*Test finding maximum.
	*/
	@Test
	public void findingMaxBetweenFirstAndSecond() {
	Max findingMax = new Max();
	int expected = 6;
	assertThat(findingMax.max(3, 1, 6), is(expected));
	}
}