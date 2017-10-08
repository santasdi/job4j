package ru.job4j.application.tracker;

/**
 * Interface for user's action.
 * @author Artem Bartenev (bartenev92@gmail.com)
 * @version $Id$
 * @since 04.10.2017
 */
public interface UserAction {
    /**
     * Key for action.
     * @return key
     */
    int key();

    /**
     * Execution of program.
     * @param input is object input
     * @param tracker is object tracker
     */
    void execute(Input input, Tracker tracker);

    /**
     * Information about action.
     * @return string with information
     */
    String info();
}
