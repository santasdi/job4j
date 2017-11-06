package ru.job4j;

import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

/**
 * Test for convert LIst of Users to HashMap.
 * @author Artem Bartenev (bartenev92@gmail.com)
 * @version $Id$
 * @since 06.11.2017
 */
public class UserConvertTest {

    @Test
    public void whenConvertListThenReturnMapList(){
        UserConvert userConvert = new UserConvert();
        List<User> list = new ArrayList<User>();

        list.add(new User("Artem", "St.Peterburg", 1));
        list.add(new User("Andrey", "St.Peterburg", 2));
        list.add(new User("Oleg", "St.Peterburg", 3));

        HashMap<Integer, User> map = new HashMap<Integer, User>();
        map.put(1,new User("Artem", "St.Peterburg", 1));
        map.put(2,new User("Andrey", "St.Peterburg", 2));
        map.put(3,new User("Oleg", "St.Peterburg", 3));
        assertThat(userConvert.process(list), is(map));
    }


}