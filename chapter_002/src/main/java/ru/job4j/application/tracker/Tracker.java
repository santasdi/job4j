package ru.job4j.application.tracker;

import ru.job4j.application.models.Item;

import java.util.ArrayList;
import java.util.List;

/**
 * Methods to control items.
 * @author Artem Bartenev (bartenev92@gmail.com)
 * @version $Id$
 * @since 21.09.2017Created by Артем on 17.09.2017.
 */
public class Tracker {

    /**
     * List of items/
     */
    private List<Item> items = new ArrayList<Item>();
    /**
     * counter for id generation.
     */
    private double counterId = 2;
    /**
     * Generated id.
     * @return random count
     */
    public double generateId() {
        return Math.random() * this.counterId++;
    }

    /**
     * Adding item.
     * @param item is item object
     * @return item
     */
    public Item add(Item item) {
        String s = Double.toString(generateId());
        item.setId(s);
        this.items.add(item);
        int i = this.items.lastIndexOf(item);
        return this.items.get(i);
    }

    /**
     * Deleting item.
     * @param item is for id of item
     */
    public void delete(Item item) {
        this.items.remove(item);
    }

    /**
     * Update item with param id and name of item.
     * @param id is id of item
     * @param item is item will be updating to new item
     */
    public void update(String id, Item item) {
        for (int index = 0; index < this.items.size(); index++) {
            if (this.items.get(index) != null && id.equals(this.items.get(index).getId())) {
                this.items.set(index,item);
            }
        }
    }

    /**
     * Finding all items without null elements.
     * @return items
     */
    public List<Item> findAll() {
        return this.items;
    }

    /**
     * Finding items by name.
     * @param key is item's name
     * @return items that was found
     */
    public List<Item> findByName(String key) {
        List<Item> result = new ArrayList<Item>();
        for (int index = 0; index < this.items.size(); index++) {
            if(key.equals(this.items.get(index).getName()));
            result.add(this.items.get(index));
        }
        return result;
    }

    /**
     * Finding items by uniq id.
     * @param id is id of item
     * @return item that was found or null
     */
    public Item findById(String id) {
        Item result = null;
        for (int index = 0; index < this.items.size(); index++) {
            if (id.equals(this.items.get(index).getId())) {
                result = this.items.get(index);
                break;
            }
        }
        return result;
    }

}
