package ru.job4j.application;

import org.junit.Test;
import ru.job4j.application.models.Item;
import ru.job4j.application.tracker.Input;
import ru.job4j.application.tracker.StartUI;
import ru.job4j.application.tracker.StubInput;
import ru.job4j.application.tracker.Tracker;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;
/**
 * Test methods for StubInput class.
 * @author Artem Bartenev (bartenev92@gmail.com)
 * @version $Id$
 * @since 0.1
 */
public class StubInputTest {
    /**
     * Adding item.
     */
    @Test
    public void whenAddItemToTrackerThenTrackerHasNewItemWithSameName() {
        Tracker tracker = new Tracker();
        Input input = new StubInput(new String[]{"0", "test name", "test desc", "6"});
        new StartUI(tracker, input).init();
        assertThat(tracker.findAll()[0].getName(), is("test name"));
    }

    /**
     * Show all items.
     */
    @Test
    public void whenShowAllItemsOfTrackerThenTrackerHasItemsWithTestNames() {
        Tracker tracker = new Tracker();
        Input input = new StubInput(new String[]{"0", "first name", "first desc", "6"});
        new StartUI(tracker, input).init();
        assertThat(tracker.findAll(), is(tracker.findByName("first name")));
    }

    /**
     * Update item.
     */
    @Test
    public void whenUpdateThenTrackerHasUpdatedValue() {
        Tracker tracker = new Tracker();
        Item item = tracker.add(new Item("first name", "first desc", 9));
        Input input = new StubInput(new String[]{"2", item.getId(), "first name", "desc", "6"});
        new StartUI(tracker, input).init();
        assertThat(tracker.findById(item.getId()).getName(), is("first name"));
    }

    /**
     * Delete item.
     */
    @Test
    public void whenDeleteOneItemThenReturnOneItem() {
        Item first = new Item("first name", "first desc", 9);
        Item second = new Item("second name", "second desc", 9);
        Tracker tracker = new Tracker();
        tracker.add(first);
        tracker.add(second);
        Input input = new StubInput(new String[]{"3", second.getId(), "6"});
        new StartUI(tracker, input).init();
        assertThat(tracker.findAll()[0].getName(), is(first.getName()));
    }

    /**
     * returning by id.
     */
    @Test
    public void whenTrackerHasTwoItemsThenReturnById() {
        Item first = new Item("first name", "first desc", 9);
        Item second = new Item("second name", "second desc", 9);
        Tracker tracker = new Tracker();
        tracker.add(first);
        tracker.add(second);
        Input input = new StubInput(new String[]{"4", second.getId(), "6"});
        new StartUI(tracker, input).init();
        assertThat(tracker.findById(second.getId()).getId(), is(second.getId()));
    }

    /**
     * returning by name.
     */
    @Test
    public void whenTrackerHasTwoItemsThenReturnByName() {
        Item first = new Item("first name", "first desc", 9);
        Item second = new Item("first name", "second desc", 9);
        Tracker tracker = new Tracker();
        tracker.add(first);
        tracker.add(second);
        Input input = new StubInput(new String[]{"5", first.getName(), "6"});
        new StartUI(tracker, input).init();
        assertThat(tracker.findByName(first.getName())[1], is(second));
    }

}