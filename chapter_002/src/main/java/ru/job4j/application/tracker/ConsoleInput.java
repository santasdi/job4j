package ru.job4j.application.tracker;

import ru.job4j.application.models.Item;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by Артем on 24.09.2017.
 */
public class ConsoleInput implements Input {
    /**
     * Constanta ADD.
     */
    private static final String ADD = "0";
    /**
     * Constanta SHOW.
     */
    private static final String SHOW = "1";
    /**
     * Constanta EDIT.
     */
    private static final String EDIT = "2";
    /**
     * Constanta DELETE.
     */
    private static final String DELETE = "3";
    /**
     * Constanta FINDID.
     */
    private static final String FINDID = "4";
    /**
     * Constanta FINDNAME.
     */
    private static final String FINDNAME = "5";
    /**
     * Constanta EXIT.
     */
    private static final String EXIT = "6";
    /**
     * Object scanner.
     */
    private Scanner scanner = new Scanner(System.in);
    /**
     * Object tracker.
     */
    private Tracker tracker = new Tracker();

    /**
     * Print menu.
     */
    public void menu() {
        System.out.println("0. Add new Item\n"
                + "1. Show all items\n"
                + "2. Edit item\n"
                + "3. Delete item\n"
                + "4. Find item by Id\n"
                + "5. Find items by name\n"
                + "6. Exit Program\n"
                + "Select:");
        }

    /**
     * Result of users choice.
     * @param answer is answer of user
     */
    @Override
    public void ask(String answer) {
        if (ADD.equals(answer)) {
            System.out.println("Enter name");
            String name = scanner.nextLine();
            System.out.println("Enter description");
            String desc = scanner.nextLine();
            Item item = new Item(name, desc, 3);
            tracker.add(item);
            System.out.println("Id of item: " + item.getId());
        } else if (SHOW.equals(answer)) {
            System.out.println(Arrays.toString(tracker.findAll()));
        } else if (EDIT.equals(answer)) {
            System.out.println("Enter id");
            String id = scanner.nextLine();
            System.out.println("Enter new name of item");
            String name = scanner.nextLine();
            System.out.println("Enter new description of item");
            String desc = scanner.nextLine();
            Item item = new Item(name, desc, 14);
            tracker.update(id, item);
        } else if (DELETE.equals(answer)) {
            System.out.println("Enter id");
            String id = scanner.nextLine();
            tracker.delete(tracker.findById(id));
        } else if (FINDID.equals(answer)) {
            System.out.println("Enter id");
            String id = scanner.nextLine();
            Item item = tracker.findById(id);
            System.out.println(item);
        } else if (FINDNAME.equals(answer)) {
            System.out.println("Enter name");
            String name = scanner.nextLine();
            System.out.println(Arrays.toString(tracker.findByName(name)));
        } else if (EXIT.equals(answer)) {
            System.out.println("Exit");
        }
    }
}
