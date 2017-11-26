package ru.job4j;
import org.junit.Test;

import java.util.*;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;
/**
 * Tests for collection convert.
 *
 * @author Artem Bartenev (bartenev92@gmail.com)
 * @version $Id$
 * @since 03.11.2017
 */
public class ConvertListTest {
    /**
     * Object ConvertList.
     */
    private ConvertList convert = new ConvertList();

    /**
     * Test method for convert array to list.
     */
    @Test
    public void whenAddToMethodArrayThenReturnList() {
        int[][] array = {{0, 1, 2}, {3, 4, 5}, {6, 7, 8}};
        List<Integer> list = new ArrayList<Integer>();
        for (int i = 0; i < 9; i++) {
            list.add(i);
        }
        List<Integer> result = new ArrayList<Integer>();
        result = this.convert.toList(array);
        assertThat(result, is(list));
    }

    /**
     * Test methods to convert list to array.
     */
    @Test
    public void whenAddToMethodListThenReturnArray() {
        List<Integer> list = new ArrayList<Integer>();
        for (int i = 0; i < 7; i++) {
            list.add(i);
        }

        int[][] array = {{0, 1, 2}, {3, 4, 5}, {6, 0, 0}};
        assertThat(this.convert.toArray(list, 3), is(array));
    }

    /**
     * Test to convert list of arrays to list of integers.
     */
    @Test
    public void whenAddToMethodListContainsIntegersArraysThenReturnList() {
        List<int[]> list = new ArrayList<int[]>();
        list.add(new int[]{1, 2, 3});
        list.add(new int[]{4, 5, 6, 7, 8});
        list.add(new int[]{9, 10, 11, 12});
        List<Integer> expected = new ArrayList<Integer>();
        for (int i = 1; i <= 12; i++) {
            expected.add(i);
        }
        assertThat(this.convert.convert(list), is(expected));
    }
}