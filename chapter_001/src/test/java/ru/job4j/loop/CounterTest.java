package ru.job4j.loop;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;
/**
 * Test method of summary from 1 to 10.
 *
 * @author Artem Bartenev (bartenev92@gmail.com)
 * @version $Id$
 * @since 0.1
 */
public class CounterTest {
    /**
	* Test  summary method.
	*/
	@Test
    public void whenSumEvenNumbersFromOneToTenThenThirty() {
	Counter counter = new Counter();
	int result = counter.add(1, 10);
	int expected = 30;
	assertThat(result, is(expected));
    }
}