package ru.job4j.application.tracker;

import java.util.Scanner;
/**
 * Methods to start apllication.
 * @author Artem Bartenev (bartenev92@gmail.com)
 * @version $Id$
 * @since 24.09.2017
 */
public class StartUI {
    /**
     * Starting of program.
     * @param args is arguments
     */
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    ConsoleInput console = new ConsoleInput();
    boolean status = true;
        while (status) {
            console.menu();
            String answer = scanner.nextLine();
            if (answer.equals("6")) {
                status = false;
            } else {
                console.ask(answer);
            }
        }
    }
}
