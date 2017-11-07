package ru.job4j.application.tracker;

import java.util.List;

/**
 * ValidateInput.
 * @author Artem Bartenev (bartenev92@gmail.com)
 * @version $Id$
 * @since 16.10.2017
 */
public class ValidateInput extends ConsoleInput {
    /**
     * Validation of ask.
     * @param question is question
     * @param actions   is range of menu actions.
     * @return value of console input.
     */
    @Override
    public int ask(String question, List<UserAction> actions) {
        boolean invalid = true;
        int value = 0;
        do {
            try {
                value = super.ask(question, actions);
                invalid = false;
            } catch (MenuOutException e) {
                System.out.println("Please select key from menu.");
            } catch (NumberFormatException e) {
                System.out.println("Please enter validate data again.");
            }
        } while (invalid);
        return value;
    }
}
