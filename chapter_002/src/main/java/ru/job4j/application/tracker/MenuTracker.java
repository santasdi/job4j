package ru.job4j.application.tracker;

import ru.job4j.application.models.Item;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Артем on 07.10.2017.
 */
public class MenuTracker {
    /**
     * List of actions.
     */
    private List<UserAction> action = new ArrayList<UserAction>();
    /**
     * input object.
     */
    private Input input;
    /**
     * tracker object.
     */
    private Tracker tracker;

    /**
     * Constructor.
     * @param input is input object.
     * @param tracker  is tracker object.
     */
    public MenuTracker(Input input, Tracker tracker) {
        this.input = input;
        this.tracker = tracker;
    }

    /**
     * Initialize menu.
     * @return count of actions.
     */
    public List<UserAction> fillActions() {
        this.action.add(new AddItem(0,"Add item"));
        this.action.add(new ShowItems(1,"Show all items"));
        this.action.add(new EditItem(2, "Edit item"));
        this.action.add(new DeleteItem(3, "Delete item"));
        this.action.add(new FindById(4, "Find by id"));
        this.action.add(new FindByName(5, "Find by name"));
        this.action.add(new Exit(6, "Exit"));

        return this.action;
    }

    /**
     * Adding action to list of actions.
     * @param action
     */
    public void addAction(BaseAction action) {
        this.action.add(action);
    }
    /**
     * Show all actions.
     */
    public void show() {
        for (UserAction action : this.action) {
            System.out.println(action.info());
        }
    }

    /**
     * Select action by choosing key.
     * @param key is key of action.
     */
    public void select(int key) {
        this.action.get(key).execute(this.input, this.tracker);
    }

    /**
     * Class about adding action.
     */
    private class AddItem extends BaseAction {
        /**
         * Constructor.
         * @param key is key
         * @param name is name.
         */
        AddItem(int key, String name) {
            super(key, name);
        }
        /**
         * Key of action.
         * @return
         */
        @Override
        public int key() {
            return 0;
        }

        /**
         * Execution of action by tracker actions.
         * @param input is object input
         * @param tracker is object tracker
         */
        @Override
        public void execute(Input input, Tracker tracker) {
            String name = input.ask("Enter name :", action.size());
            String desc = input.ask("Enter description :", action.size());
            tracker.add(new Item(name, desc, 11));
        }

    }

    /**
     * Class about showing items action.
     */
    private class ShowItems extends BaseAction {
        /**
         * Constructor.
         * @param key is key
         * @param name is name.
         */
        ShowItems(int key, String name) {
            super(key, name);
        }
        /**
         * Key of action.
         * @return
         */
        @Override
        public int key() {
            return 1;
        }
        /**
         * Execution of action by tracker actions.
         * @param input is object input
         * @param tracker is object tracker
         */
        @Override
        public void execute(Input input, Tracker tracker) {
            System.out.println(tracker.findAll());
        }

    }


    /**
     * Class about editing items action.
     */
    private class EditItem extends BaseAction {
        /**
         * Constructor.
         * @param key is key
         * @param name is name.
         */
        EditItem(int key, String name) {
            super(key, name);
        }
        /**
         * Key for action.
         *
         * @return key
         */
        @Override
        public int key() {
            return 2;
        }

        /**
         * Execution of action.
         *
         * @param input   is object input
         * @param tracker is object tracker
         */
        @Override
        public void execute(Input input, Tracker tracker) {
            String id = input.ask("Enter id :", action.size());
            tracker.update(id, tracker.findById(id));
        }
    }

    /**
     * Class about delete action.
     */
    private class DeleteItem extends BaseAction {
        /**
         * Constructor.
         *
         * @param key  is key
         * @param name is name.
         */
        DeleteItem(int key, String name) {
            super(key, name);
        }

        /**
         * Key for action.
         *
         * @return key
         */
        @Override
        public int key() {
            return 3;
        }

        /**
         * Execution of program.
         *
         * @param input   is object input
         * @param tracker is object tracker
         */
        @Override
        public void execute(Input input, Tracker tracker) {
            String id = input.ask("Enter id :", action.size());
            tracker.delete(tracker.findById(id));
        }
    }
    /**
     * Class about finding by id action.
     */
    private class FindById extends BaseAction {
        /**
         * Constructor.
         * @param key is key
         * @param name is name.
         */
        FindById(int key, String name) {
            super(key, name);
        }
        /**
         * Key for action.
         *
         * @return key
         */
        @Override
        public int key() {
            return 4;
        }

        /**
         * Execution of program.
         *
         * @param input   is object input
         * @param tracker is object tracker
         */
        @Override
        public void execute(Input input, Tracker tracker) {
            String id = input.ask("Enter id :", action.size());
            Item item = tracker.findById(id);
            System.out.println(item);
        }
    }

    /**
     * Class about finding by name action.
     */
    private class FindByName extends BaseAction {
        /**
         * Constructor.
         * @param key is key
         * @param name is name.
         */
        FindByName(int key, String name) {
            super(key, name);
        }        @Override
        public int key() {
            return 5;
        }

        /**
         * Execution of program.
         *
         * @param input   is object input
         * @param tracker is object tracker
         */
        @Override
        public void execute(Input input, Tracker tracker) {
            String name = input.ask("Enter name :", action.size());
            List<Item> items = tracker.findByName(name);
            System.out.println(items);
        }

    }

    /**
     * Class about exit action.
     */
    private class Exit extends BaseAction {
        /**
         * Constructor.
         * @param key is key
         * @param name is name.
         */
        Exit(int key, String name) {
            super(key, name);
        }
        /**
         * Key for action.
         *
         * @return key
         */
        @Override
        public int key() {
            return 6;
        }

        /**
         * Execution of program.
         *
         * @param input   is object input
         * @param tracker is object tracker
         */
        @Override
        public void execute(Input input, Tracker tracker) {
            System.out.println("Good bye! Have a nice day.");
        }

    }
}