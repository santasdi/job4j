package ru.job4j.application.tracker;

/**
 * Base action description.
 * @author Artem Bartenev (bartenev92@gmail.com)
 * @version $Id$
 * @since 21.09.2017
 */
public abstract class BaseAction implements UserAction {
    /**
     * Info about action.
     * @return
     */

    @Override
    public String info() {
        return String.format("%s. %s", this.key(), "Action");
    }

}
