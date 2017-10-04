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
     * @param question is question.
     * @return answer of user.
     */
    @Override
    public String ask(String question) {
        System.out.println(question);
        String line = scanner.nextLine();
        return line;
    }
}