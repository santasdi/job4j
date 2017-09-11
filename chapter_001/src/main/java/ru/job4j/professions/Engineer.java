package ru.job4j.professions;

/**
 *  Realization of engineer's profession.
 * @author Artem Bartenev (bartenev92@gmail.com)
 * @version $Id$
 * @since 11.09.2017
 */
public class Engineer {
    Profession engineer = new Profession("Геннадий", "конструктор", 41);
    public String fix(Detail detail){
        return (engineer.getType() + " " + engineer.getName() + " производит починку " + detail.type);
    }
    public String check(Detail detail) {
        return  (engineer.getType() + " " + engineer.getName() + " производит осмотр " + detail.type);
    }
}
class Detail {
    String type = "подвески";
}