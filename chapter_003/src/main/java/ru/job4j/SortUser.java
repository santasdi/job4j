package ru.job4j;

import ru.job4j.models.User;

import java.util.*;

/**
 * Sorting Users .
 * @author Artem Bartenev (bartenev92@gmail.com)
 * @version $Id$
 * @since 09.11.2017
 */
public class SortUser {
    /**
     * Sorting users from list to set/
     *
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

    /**
     * Sorting names in list by length.
     * @param list is list of users
     * @return list after sorting
     */
    public List<User> sortNameLength(List<User> list) {
        list.sort(
                new Comparator<User>() {
                    @Override
                    public int compare(User o1, User o2) {
                        return o1.getName().length() - o2.getName().length();
                    }
                }
        );
        return list;
    }

    /**
     * Sorting list by names and ages.
     * @param list is list of users
     * @return list after sorting
     */
    public List<User> sortByAllFields(List<User> list) {
        list.sort(
                new Comparator<User>() {
                    @Override
                    public int compare(User o1, User o2) {
                        int resultName = o1.getName().length() - o2.getName().length();
                        int resultAge = o1.getAge() - o2.getAge();
                        return resultName != 0 ? resultName : resultAge != 0 ? resultAge : 0;
                    }
                }
        );
        return list;

    }
}
