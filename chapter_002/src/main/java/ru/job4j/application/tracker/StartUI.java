package ru.job4j.application.tracker;

/**
 * StartUI.
 * @author Artem Bartenev (bartenev92@gmail.com)
 * @version $Id$
 * @since 1.10.2017
 */
public class StartUI {
    /**
     * Input object.
    */
     private Input input;
    /**
     * Tracker object.
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
        String answer = "";
        MenuTracker menu = new MenuTracker(this.input, this.tracker);
        menu.fillActions();
        boolean status = true;
        int key;
        do {
            menu.show();
            key = Integer.parseInt(input.ask(answer));
            menu.select(key);
            if (key == 6) {
                status = false;
            }
        } while (status);
    }
}
