package ru.job4j;

import java.util.ArrayList;
import java.util.List;

/**
 * Collection time counter.
 * @author Artem Bartenev (bartenev92@gmail.com)
 * @version $Id$
 * @since 03.11.2017
 */
public class ConvertList {
    /**
     * Taking array and returning List.
     *
     * @param array is array
     * @return List which contains array
     */
    public List<Integer> toList(int[][] array) {
        List<Integer> list = new ArrayList<Integer>();
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                list.add(array[i][j]);
            }
        }
        return list;
    }

    /**
     * Taking list and returning this list by array with 0 or without 0;
     *
     * @param list is list of objects
     * @param rows is rows
     * @return array
     */
    public int[][] toArray(List<Integer> list, int rows) {
        int count = 0;
        int[][] array = new int[rows][rows];
        if ((list.size() / rows) == rows) {
            for (int i = 0; i < rows; i++) {
                for (int j = 0; j < rows; j++) {
                    array[i][j] = list.get(count);
                    count++;

                }
            }
        } else {
            for (int i = 0; i < rows; i++) {
                for (int j = 0; j < rows; j++) {
                    if (count < list.size()) {
                        array[i][j] = list.get(count);
                        count++;
                    } else {
                        array[i][j] = 0;

                    }
                }
            }
        }
        return array;
    }
}