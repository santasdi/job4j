package ru.job4j.professions;

/**
 *  Realization of engineer's profession.
 * @author Artem Bartenev (bartenev92@gmail.com)
 * @version $Id$
 * @since 11.09.2017
 */
public class Engineer {
    /**
     *class engineer.
     */
    private Profession engineer = new Profession("Геннадий", "конструктор", 41);

    /**
     * Fixing detail.
     * @param detail is detail
     * @return string
     */
    public String fix(Detail detail) {
        return (engineer.getType() + " " + engineer.getName() + " производит починку " + detail.getType());
    }

    /**
     * Checking detail.
     * @param detail is detail
     * @return string
     */
    public String check(Detail detail) {
        return  (engineer.getType() + " " + engineer.getName() + " производит осмотр " + detail.getType());
    }
}

/**
 * Class detail.
 */
class Detail {
    /**
     * type of detail.
     */
    private String type = "подвески";

    /**
     * Geting type.
     * @return type of detail
     */
    public String getType() {
        return this.type;
    }
}