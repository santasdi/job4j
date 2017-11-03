package ru.job4j;

import java.util.Collection;


/**
 * Collection time counter.
 * @author Artem Bartenev (bartenev92@gmail.com)
 * @version $Id$
 * @since 03.11.2017
 */
public class TimeCounter {
    /**
     * Adding objects to collection.
     * @param collection is type of collection
     * @param amount is amount of objects
     * @return time of adding in collection
     */
    public long add(Collection<String> collection, int amount) {
        long start = System.currentTimeMillis();
        for (int i = 0; i < amount; i++) {
            collection.add("Строка №" + i);
        }
        return System.currentTimeMillis() - start;
    }

    /**
     * Deleting objects from collection.
     * @param collection is type of collection
     * @param amount is amount of objects
     * @return time of deleting in collection
     */

    public long delete(Collection<String> collection, int amount) {
        long start = System.currentTimeMillis();
        for(int i = 0; i < amount; i++) {
            collection.remove("Строка №" + i);
        }
        return System.currentTimeMillis() - start;
    }



}
