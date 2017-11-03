package ru.job4j;

import org.junit.Test;

import java.util.*;

/**
 * Test for collection time counter.
 *
 * @author Artem Bartenev (bartenev92@gmail.com)
 * @version $Id$
 * @since 03.11.2017
 */
public class TimeCounterTest {
    /**
     * Collection ArrayList.
     */
    public static Collection<String> arrayList = new ArrayList<String>();
    /**
     * Collection LinkedList.
     */
    public static Collection<String> linkedList = new LinkedList<String>();
    /**
     * Collection TreeSet.
     */
    public static Collection<String> treeSet = new LinkedList<String>();
    /**
     * Adding objects to ArrayList.
     */
    @Test
    public void whenAddingObjectsToArrayListCollectionThenReturnTimeOfAdding(){
        TimeCounter timeCounter = new TimeCounter();
        long time = timeCounter.add(arrayList, 100000);
        System.out.println("Время добавления объектов в ArrayList = " + time);
    }
    /**
     * Deleting objects from ArrayList.
     */
    @Test
    public void whenDeletingObjectsFromArrayListTheReturnTimeOfDeleting(){
        TimeCounter timeCounter = new TimeCounter();
        long time = timeCounter.delete(arrayList,100000);
        System.out.println("Время удаления объектов в ArrayLIst = " + time);
    }
    /**
     * Adding objects to LinkedList.
     */
    @Test
    public void whenAddingObjectsToLinkedListCollectionThenReturnTimeOfAdding(){
        TimeCounter timeCounter = new TimeCounter();
        long time = timeCounter.add(linkedList, 100000);
        System.out.println("Время добавления объектов в LinkedList = " + time);
    }
    /**
     * Deleting objects from LinkedList.
     */
    @Test
    public void whenDeletingObjectsFromLinkedListTheReturnTimeOfDeleting(){
        TimeCounter timeCounter = new TimeCounter();
        long time = timeCounter.delete(linkedList,100000);
        System.out.println("Время удаления объектов в LinkedLIst = " + time);
    }
    /**
     * Adding objects to TreeSet.
     */
    @Test
    public void whenAddingObjectsToTreeSetCollectionThenReturnTimeOfAdding(){
        TimeCounter timeCounter = new TimeCounter();
        long time = timeCounter.add(treeSet, 100000);
        System.out.println("Время добавления объектов в TreeSet = " + time);
    }

    /**
     * Deleting objects from TreeSet.
     */
    @Test
    public void whenDeletingObjectsFromTreeSetTheReturnTimeOfDeleting() {
        TimeCounter timeCounter = new TimeCounter();
        long time = timeCounter.delete(treeSet, 100000);
        System.out.println("Время удаления объектов в TreeSet = " + time);
    }
}
