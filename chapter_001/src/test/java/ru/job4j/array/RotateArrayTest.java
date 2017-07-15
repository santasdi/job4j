package ru.job4j.array;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;
/**
 * Test method of turn array clockwise.
 *
 * @author Artem Bartenev (bartenev92@gmail.com)
 * @version $Id$
 * @since 15.07.2017
 */
public class RotateArrayTest {
    /**
	* Test method rotate 2x2 array clockwise.
	*/
	@Test
    public void whenRotateTwoRowTwoColArrayThenRotatedArray() {
        RotateArray arrayrotate = new RotateArray();
		int[][] testArray = {{1, 2}, {3, 4}};
		int[][] resultArray = arrayrotate.rotate(testArray);
		int[][] expected = {{3, 1}, {4, 2}};
		assertThat(resultArray, is(expected));
    }
	/**
	* Test method rotate 3x3 array clockwise.
	*/
    @Test
    public void whenRotateThreeRowThreeColArrayThenRotatedArray() {
        RotateArray arrayrotate = new RotateArray();
		int[][] testArray = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
		int[][] resultArray = arrayrotate.rotate(testArray);
		int[][] expected = {{7, 4, 1}, {8, 5, 2}, {9, 6, 3}};
		assertThat(resultArray, is(expected));
    }
}