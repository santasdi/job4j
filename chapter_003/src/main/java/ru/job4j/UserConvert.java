package ru.job4j;

import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/**
 * Convert LIst of Users to HashMap.
 * @author Artem Bartenev (bartenev92@gmail.com)
 * @version $Id$
 * @since 06.11.2017
 */
public class UserConvert {
    /**
     * Convert list to map
     * @param list is list of users
     * @return map
     */
    HashMap<Integer, User> process(List<User> list) {
        HashMap<Integer, User> map = new HashMap<Integer, User>();
        for (User user : list) {
            map.put(user.getId(), user);
        }
        return map;
    }

}
