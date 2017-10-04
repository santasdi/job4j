package ru.job4j.strategy;

/**
 * Class Square.
 * @author Artem Bartenev (bartenev92@gmail.com)
 * @version $Id$
 * @since 04.10.2017
 */
public class Square implements Shape {
    /**
     * Override method pic from Shape.
     * @return string by square picture.
     */
    @Override
    public String pic() {
        StringBuilder pic = new StringBuilder();
        pic.append("####");
        pic.append("\n");
        pic.append("#  #");
        pic.append("\n");
        pic.append("####");
        return pic.toString();
    }
}
