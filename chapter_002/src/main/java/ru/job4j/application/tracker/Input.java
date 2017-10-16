package ru.job4j.application.tracker;

/**
 * Created by Артем on 01.10.2017.
 */
public interface Input {
    /**
     * Asking from user.
     * @param question is question.
     * @return us answer
     */
    String ask(String question);

    /**
     * Overriding method ask.
     * @param question is question
     * @param range is range of menu actions.
     * @return return key of action
     */
    int ask(String question, int[] range);
}
