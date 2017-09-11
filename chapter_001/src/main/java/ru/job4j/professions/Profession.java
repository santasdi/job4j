package ru.job4j.professions;

/**
 * Realization of professions.
 *
 * @author Artem Bartenev (bartenev92@gmail.com)
 * @version $Id$
 * @since 11.09.2017
 */
public class Profession {
    private String name;
    private String type;
    private int age;

    public Profession() {
    }

    public Profession(String name, String type, int age) {
        this.name = name;
        this.type = type;
        this.age = age;
    }
    public String getName() {
        return name;
    }

    public String getType() {
        return type;
    }
    public int getAge() {
        return age;
    }

}
