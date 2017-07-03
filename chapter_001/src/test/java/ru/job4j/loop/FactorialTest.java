package ru.job4j.loop;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;
/**
 * Test method of calculate factorial from 1 to 5.
 *
 * @author Artem Bartenev (bartenev92@gmail.com)
 * @version $Id$
 * @since 0.1
 */
public class FactorialTest {
	/**
	* Test  calculate factorial.
	*/
	@Test
	public void whenCalculateFactorialForFiveThenOneHundreedTwenty() {
    Factorial factor = new Factorial();
	int result = factor.calc(5);
	int expected = 120;
	assertThat(result, is(expected));
    }
	/**
	* Test  calculate factorial.
	*/
	@Test
	public void whenCalculateFactorialForZeroThenOne() {
    Factorial factor = new Factorial();
	int result = factor.calc(0);
	int expected = 1;
	assertThat(result, is(expected));
    }
}