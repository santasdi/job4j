package ru.job4j.application.tracker;

import java.util.Scanner;

/**
 * ConsoleInput.
 * @author Artem Bartenev (bartenev92@gmail.com)
 * @version $Id$
 * @since 21.09.2017
 */
public class ConsoleInput implements Input {
    /**
     * Scanner input stream.
     */
    private Scanner scanner = new Scanner(System.in);
    /**
     * Asking question.
     * @return answer of user.
     */
    @Override
    public String ask(String question) {
        System.out.println(question);
        String line = scanner.nextLine();
        return line;
    }

    /**
     * Override method asking.
     * @param question is question
     * @param range is range of menu actions.
     * @return key of action
     */
    @Override
    public int ask(String question, int[] range) {
        int key = Integer.parseInt(this.ask(question));
        boolean exist = false;
        for (int value : range) {
            if (value == key) {
                exist = true;
                break;
            }
        }
        if (exist) {
            return key;
        } else {
            throw new MenuOutException("Out of menu range!");
        }
    }
}