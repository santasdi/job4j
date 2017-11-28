package ru.job4j.iterator;

import org.junit.Test;


import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

/**
 * Test for iterator of array.
 *
 * @author Artem Bartenev (bartenev92@gmail.com)
 * @version $Id$
 * @since 28.11.2017
 */
public class ArrayIteratorTest {
    @Test
    public void whenGetNextTheReturnCounts() {
         int[][] array = {{1, 2, 4}, {0, 0}, {3, 9, 11, 8}};
         int[] result = new int[9];
         ArrayIterator arrayIterator = new ArrayIterator(array);
        for (int i = 0; i < result.length; i++) {
            result[i] = (int) arrayIterator.next();
        }
        assertThat(result, is(new int[] {1, 2, 4, 0, 0, 3, 9, 11, 8}));

    }
}