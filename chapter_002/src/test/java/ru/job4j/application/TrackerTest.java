package ru.job4j.application;

import org.junit.Test;
import ru.job4j.application.models.Item;
import ru.job4j.application.tracker.Tracker;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;


/**
 * Test methods for item's class.
 *
 * @author Artem Bartenev (bartenev92@gmail.com)
 * @version $Id$
 * @since 0.1
 */
public class TrackerTest {
    /**
     * Test fo adding name.
     */
    @Test
    public void whenAddItemThenReturnItem() {
        Item item = new Item("Монтаж", "14", 14);
        Tracker tracker = new Tracker();
        assertThat(tracker.add(item), is(item));
    }

    /**
     * Test to deleting item.
     */
    @Test
    public void whenDeleteFirstItemThenSecondPlacedOnFirst() {
       Item first = new Item("first", "interesting", 45);
       Item second = new Item("second", "very interesting", 213);
       Tracker tracker = new Tracker();
       tracker.add(first);
       tracker.add(second);
       tracker.delete(first);
       Item[] result = tracker.findAll();
       Item[] expected = new Item[1];
       expected[0] = second;
       assertThat(result, is(expected));
    }

    /**
     * Test to update item.
     */
    @Test
    public void whenUpdateItemThenNewItemOnUpdatePossition() {
        Item first = new Item("first", "boring", 673);
        Item second = new Item("second", "very boring", 111);
        Tracker tracker = new Tracker();
        tracker.add(first);
        tracker.add(second);
        tracker.update(first.getId(), second);
        Item[] expected = new Item[2];
        expected[0] = second;
        expected[1] = second;
        assertThat(tracker.findAll(), is(expected));

    }
    /**
     * Test finding all items.
     */
    @Test
    public void whenFindingItemsThenReturnArrayOfItems() {
        Item first = new Item("first", "boring", 673);
        Item second = new Item("second", "very boring", 111);
        Tracker tracker = new Tracker();
        tracker.add(first);
        tracker.add(second);
        Item[] expected = new Item[2];
        expected[0] = first;
        expected[1] = second;
        Item[] result = tracker.findAll();
        assertThat(result, is(expected));
    }
    /**
     * Test for find by name.
     */
    @Test
    public void whenFindByNameThenReturnArrayOfItems() {
        Item first = new Item("first", "boring", 673);
        Item second = new Item("second", "very boring", 111);
        Tracker tracker = new Tracker();
        tracker.add(first);
        tracker.add(second);
        Item[] expected = new Item[1];
        expected[0] = first;
        Item[] result = tracker.findByName(first.getName());
        assertThat(result, is(expected));
    }
    /**
     * Test for find by id.
     */
    @Test
    public void whenFindByIdThenReturnItem() {
        Item first = new Item("first", "boring", 673);
        Item second = new Item("second", "very boring", 111);
        Tracker tracker = new Tracker();
        tracker.add(first);
        tracker.add(second);
        Item result = tracker.findById(first.getId());
        assertThat(result, is(first));
    }
}