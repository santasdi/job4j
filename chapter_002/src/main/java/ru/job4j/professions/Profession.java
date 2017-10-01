package ru.job4j.professions;

/**
 * Realization of professions.
 *
 * @author Artem Bartenev (bartenev92@gmail.com)
 * @version $Id$
 * @since 11.09.2017
 */
public class Profession {
    /**
     * Name of profession.
     */
    private String name;
    /**
     * type of profession.
     */
    private String type;
    /**
     * age of employer.
     */
    private int age;

    /**
     * Constructor of class.
     */
    public Profession() {
    }

    /**
     * Override constructor.
     * @param name is name
     * @param type is type
     * @param age is age
     */
    public Profession(String name, String type, int age) {
        this.name = name;
        this.type = type;
        this.age = age;
    }

    /**
     * Geting name.
     * @return name
     */
    public String getName() {
        return name;
    }

    /**
     * Geting type of profession.
     * @return type
     */

    public String getType() {
        return type;
    }

    /**
     * Geting age.
     * @return age of employee
     */
    public int getAge() {
        return age;
    }

}
