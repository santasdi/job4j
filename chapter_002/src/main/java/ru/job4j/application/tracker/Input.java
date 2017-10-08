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
}
