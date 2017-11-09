package ru.job4j;

import org.junit.Test;
import ru.job4j.models.User;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

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
        assertThat(new User("Artur", 19).compareTo(new User("Pavel", 23)), is(-1));
        }
    }


}
