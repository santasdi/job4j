package ru.job4j.application.tracker;
import ru.job4j.application.models.Item;
import java.util.Arrays;
/**
 * StartUI.
 * @author Artem Bartenev (bartenev92@gmail.com)
 * @version $Id$
 * @since 1.10.2017
 */
public class StartUI {
    /**
     * Menu.
     */
    private final String menu = "0. Add new Item\n"
            + "1. Show all items\n"
            + "2. Edit item\n"
            + "3. Delete item\n"
            + "4. Find item by Id\n"
            + "5. Find items by name\n"
            + "6. Exit Program\n"
            + "Select:";
    /**
     * Exit.
     */
    private static final String EXIT = "6";
    /**
     * ADD.
     */
    private static final String ADD = "0";
    /**
     * Show all.
     */
    private static final String SHOW_ALL = "1";
    /**
     * Update item.
     */
    private static final String EDIT_ITEM = "2";
    /**
     * Delete item.
     */
    private static final String DELETE_ITEM = "3";
    /**
     * Find by id.
     */
    private static final String FIND_BY_ID = "4";
    /**
     * Find by name.
     */
    private static final String FIND_BY_NAME = "5";
    /**
     * Input.
     */
    private Input input;
    /**
     * Tracker.
     */
    private Tracker tracker;

    /**
     * Constructor.
     * @param tracker is tracker object
     * @param input is input object
     */
    public StartUI(Tracker tracker, Input input) {
        this.input = input;
        this.tracker = tracker;
    }

    /**
     * Adding item.
     *
     * @param tracker is tracker object.
     * @param input is input object.
     */
    private void add(Tracker tracker, Input input) {
        String name = input.ask("Enter name :");
        String desc = input.ask("Enter description :");
        tracker.add(new Item(name, desc, 11));
    }

    /**
     * Show all items.
     *
     * @param tracker tracker.
     */
    private void showAll(Tracker tracker) {
        System.out.println(Arrays.toString(tracker.findAll()));
    }

    /**
     * Update item.
     *
     * @param tracker is tracker object.
     * @param input is input object
     */
    private void editItem(Tracker tracker, Input input) {
        String id = input.ask("Enter id :");
        tracker.update(id, tracker.findById(id));
    }

    /**
     * Delete item.
     *
     * @param tracker is tracker object.
     * @param input is input object
     */
    private void deleteItem(Tracker tracker, Input input) {
        String id = input.ask("Enter id :");
        tracker.delete(tracker.findById(id));
    }

    /**
     * Find item by id.
     *
     * @param tracker is tracker object.
     * @param input is input object
     */
    private void findById(Tracker tracker, Input input) {
        String id = input.ask("Enter id :");
        Item item = tracker.findById(id);
        System.out.println(item);
    }

    /**
     * Find item by name.
     *
     * @param tracker is tracker object.
     * @param input  is input object
     */
    private void findByName(Tracker tracker, Input input) {
        String name = input.ask("Enter name :");
        Item[] item = tracker.findByName(name);
        System.out.println(Arrays.toString(item));
    }

    /**
     * Main method.
     * @param args is args
     */
    public static void main(String[] args) {
        new StartUI(new Tracker(), new ConsoleInput()).init();
    }

    /**
     * Starting of application.
     */
    public void init() {
        String answer;
        while (true) {
            answer = input.ask(menu);
            if (EXIT.equals(answer)) {
                break;
            }
            switch (answer) {
                case ADD:
                    this.add(this.tracker, this.input);
                    break;
                case SHOW_ALL:
                    this.showAll(this.tracker);
                    break;
                case EDIT_ITEM:
                    this.editItem(this.tracker, this.input);
                    break;
                case DELETE_ITEM:
                    this.deleteItem(tracker, input);
                    break;
                case FIND_BY_ID:
                    this.findById(tracker, input);
                    break;
                case FIND_BY_NAME:
                    this.findByName(tracker, input);
                    break;
                    default:
            }

        }
    }
}