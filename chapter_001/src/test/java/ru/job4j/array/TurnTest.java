package ru.job4j.array;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;
/**
 * Test method of turn array back.
 *
 * @author Artem Bartenev (bartenev92@gmail.com)
 * @version $Id$
 * @since 0.1
 */
 public class TurnTest {
	/**
	* Test turn even array.
	*/
	@Test
    public void whenTurnArrayWithEvenAmountOfElementsThenTurnedArray() {
        Turn turn = new Turn();
		int[] testArray = {2, 6, 1, 4};
		int[] resultArray = turn.back(testArray);
		int[] expectArray = {4, 1, 6, 2};
		assertThat(resultArray, is(expectArray));
    }
	/**
	* Test turn odd array.
	*/
    @Test
    public void whenTurnArrayWithOddAmountOfElementsThenTurnedArray() {
        Turn turn = new Turn();
		int[] testArray = {1, 2, 3, 4, 5};
		int[] resultArray = turn.back(testArray);
	int[] expectArray = {5, 4, 3, 2, 1};
		assertThat(resultArray, is(expectArray));
    }
 }