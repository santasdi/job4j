package ru.job4j.systemOfApplications;

import com.sun.org.apache.xpath.internal.SourceTree;

import java.util.Scanner;

/**
 * Created by Артем on 24.09.2017.
 */
public class ConsoleInput {
    private static final String ADD = "0";
    private static final String SHOW = "1";
    private static final String EDIT = "2";
    private static final String DELETE = "3";
    private static final String FINDID = "4";
    private static final String FINDNAME = "5";
    private static final String EXIT = "6";
    Scanner scanner = new Scanner(System.in);

        Tracker tracker = new Tracker();
        public void answer(String answer) {
        if(ADD.equals(answer)) {
            System.out.println("Enter name");
            String name = scanner.nextLine();
            System.out.println("Enter description");
            String desc = scanner.nextLine();
            Item item = new Item(name, desc, 3);
            tracker.add(item);
        } else if (SHOW.equals(answer)){
            System.out.println(tracker.findAll());
        } else if (EDIT.equals(answer)){
            System.out.println("Enter id");
            String id = scanner.nextLine();
            System.out.println("Enter new name of item");
            String name = scanner.nextLine();
            System.out.println("Enter new description of item");
            String desc = scanner.nextLine();
            Item item = new Item(name, desc,14);
            tracker.update(id, item);
        } else if (DELETE.equals(answer)){
            System.out.println("Enter id");
            String id = scanner.nextLine();
            tracker.delete(tracker.findById(id));
        } else if (FINDID.equals(answer)){
            System.out.println("Enter id");
            String id = scanner.nextLine();
            tracker.findById(id);
        } else if (FINDNAME.equals(answer)){
            System.out.println("Enter name");
            String name = scanner.nextLine();
            tracker.findByName(name);
        } else if (EXIT.equals(answer)){

        }
    }
}
