package ru.job4j.array;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;
/**
 * Test method of sort array.
 *
 * @author Artem Bartenev (bartenev92@gmail.com)
 * @version $Id$
 * @since 0.1
 */
public class BubbleSortTest {
    /**
	* Test method of bubblesort.
	*/
	@Test
    public void whenSortArrayWithTenElementsThenSortedArray() {
        BubbleSort bubblesort = new BubbleSort();
		int[] testArray = {1, 5, 4, 2, 3, 1, 7, 8, 0, 5};
		int[] resultArray = bubblesort.sort(testArray);
		int[] expectedArray = {0, 1, 1, 2, 3, 4, 5, 5, 7, 8};
		assertThat(resultArray, is(expectedArray));
    }
}