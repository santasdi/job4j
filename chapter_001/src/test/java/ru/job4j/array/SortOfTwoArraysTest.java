package ru.job4j.array;

        import org.junit.Test;
        import static org.hamcrest.core.Is.is;
        import static org.junit.Assert.assertThat;
/**
 * Test method of sorting two arrays to third.
 *
 * @author Artem Bartenev (bartenev92@gmail.com)
 * @version $Id$
 * @since 0.1
 */
public class SortOfTwoArraysTest {
    /**
     * Test Sorting two arrays.
     */
    @Test
    public void whenSortingTwoArraysToThird(){
        SortOfTwoArrays sorting = new SortOfTwoArrays();
        int[] firstTestArray = {4, 19, 8, 41, 78};
        int[] secondTestArray = {99, 32, 7, 1, 0};
        int[] resultArray = sorting.arraySort(firstTestArray, secondTestArray);
        int [] expectedArray = {0, 1, 4, 7, 8, 19, 32, 41, 78, 99};
        assertThat(resultArray, is(expectedArray));

    }
}
