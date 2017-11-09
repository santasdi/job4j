package ru.job4j;

import ru.job4j.models.User;

import java.util.Comparator;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

/**
 * Sorting Users .
 * @author Artem Bartenev (bartenev92@gmail.com)
 * @version $Id$
 * @since 09.11.2017
 */
public class SortUser {
    /**
     * Sorting users from list to set/
     * @param list is list of users
     * @return set of sorting users by age
     */
    public Set<User> sort(List<User> list) {
        Set<User> set = new TreeSet<User>();
        for (int index = 0; index < list.size(); index++) {
            set.add(list.get(index));
        }
         return set;


    }
}
