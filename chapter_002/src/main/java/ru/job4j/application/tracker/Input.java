package ru.job4j.application.tracker;

import java.util.List;

/**
 * Created by Артем on 01.10.2017.
 */
public interface Input {
    /**
     * Asking from user.
     * @param question is question.
     * @param size
     * @return us answer
     */
    String ask(String question, int size);

    /**
     * Overriding method ask.
     * @param question is question
     * @param list is range of menu actions.
     * @return return key of action
     */
    int ask(String question, List<UserAction> list);
}
