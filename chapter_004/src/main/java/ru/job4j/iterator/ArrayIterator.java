package ru.job4j.iterator;

import java.util.Iterator;

/**
 * Array iterator.
 *
 * @author Artem Bartenev (bartenev92@gmail.com)
 * @version $Id$
 * @since 28.11.2017
 */
public class ArrayIterator implements Iterator {
    private int[][] values;
    int indexI = 0;
    int indexJ = 0;

    public ArrayIterator(int[][] values) {
        this.values = values;
    }

    @Override
    public boolean hasNext() {
        return indexI < this.values.length;
    }

    @Override
    public Object next() {
        int result;
        if (indexI < values.length && indexJ < values[indexI].length) {
            result = this.values[indexI][indexJ++];
        } else {
            indexJ = 0;
            result = this.values[++indexI][indexJ++];
        }
        return result;
    }
}
