package ru.job4j.strategy;

/**
 * Drawing figures.
 * @author Artem Bartenev (bartenev92@gmail.com)
 * @version $Id$
 * @since 04.10.2017
 */
public class Paint {
    /**
     * Drawing figures.
     * @param shape is object of figures.
     */
    public void draw(Shape shape) {
        shape.pic();
    }
}
