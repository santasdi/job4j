package ru.job4j.application.tracker;

/**
 * Exception.
 * @author Artem Bartenev (bartenev92@gmail.com)
 * @version $Id$
 * @since 16.10.2017
 */
public class MenuOutException extends RuntimeException {
    /**
     * Construct
     * @param string is massage of exception.
     */
    public MenuOutException(String string) {
        super(string);
    }
}
