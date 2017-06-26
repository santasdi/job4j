package ru.job4j.condition;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;
/**
 * Test methods for finding point.
 *
 * @author Artem Bartenev (bartenev92@gmail.com)
 * @version $Id$
 * @since 0.1
 */
public class PointTest {
	/**
     * Test point belong for function.
     */
	public void findingPointBelongFunction() {
	Point point = new Point(2, 6);
	boolean expected = true;
	assertThat(point.is(2, 2), is(expected));
	}
}