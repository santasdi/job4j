package ru.job4j;

import org.junit.Test;
import ru.job4j.models.User;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;
import static org.junit.Assert.assertThat;

/**
 * Test for sort list of users to set.
 * @author Artem Bartenev (bartenev92@gmail.com)
 * @version $Id$
 * @since 09.11.2017
 */
public class SortUserTest {
    /**
     * Printing result and check returning statement.
     */
    @Test
    public void whenSortingListThenReturnSortingSet() {
        SortUser sortUser = new SortUser();
        List<User> list = new ArrayList<User>();
        list.add(new User("Artur", 19));
        list.add(new User("Pavel", 23));
        list.add(new User("Oleg", 55));
        list.add(new User("Kirill", 11));
        list.add(new User("Eugeny", 43));
        list.add(new User("Mary", 20));
        Set<User> sort = sortUser.sort(list);
        for (User sorted : sort) {
            System.out.println(sorted);
            assertThat(new User("Artur", 19).compareTo(new User("Pavel", 23)), is(-4));
        }
    }

    /**
     * Sorted list is equal not sorted after sorting by only names.
     */
    @Test
    public void whenSortingListTheReturnSortingListByNames() {
        SortUser sortUser = new SortUser();
        List<User> notSortedList = new ArrayList<User>();
        List<User> Sortedlist = new ArrayList<User>();
        notSortedList.add(new User("Pavel", 23));
        notSortedList.add(new User("Alexander", 11));
        Sortedlist.add(new User("Pavel", 23));
        Sortedlist.add(new User("Alexander", 11));

        assertThat(Sortedlist, is(sortUser.sortNameLength(notSortedList)));

    }

    /**
     * Sorted list is equal not sorted after sorting by names and ages.
     */
    @Test
    public void whenSortingListTheReturnSortingListByNamesAndAges() {
        SortUser sortUser = new SortUser();
        List<User> notSortedList = new ArrayList<User>();
        List<User> Sortedlist = new ArrayList<User>();
        notSortedList.add(new User("Alexander", 99));
        notSortedList.add(new User("Alexander", 11));
        Sortedlist.add(new User("Alexander", 11));
        Sortedlist.add(new User("Alexander", 99));

        assertThat(Sortedlist, is(sortUser.sortByAllFields(notSortedList)));

    }
}
