package ru.job4j.application.tracker;

/**
 * Base action description.
 * @author Artem Bartenev (bartenev92@gmail.com)
 * @version $Id$
 * @since 21.09.2017
 */
public abstract class BaseAction implements UserAction {
    /**
     * Name of action.
     */
    private String name;
    /**
     * Key of action
     */
    private int key;

    /**
     * Constructor.
     * @param key is key of action
     * @param name is name of action
     */
    BaseAction(int key, String name) {
        this.key = key;
        this.name = name;
    }

    /**
     * Info about action.
     * @return
     */

    @Override
    public String info() {
        return String.format("%s. %s",this.key, name);
    }

}
