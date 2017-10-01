package ru.job4j.professions;

/**
 *  Realization of teacher's profession.
 * @author Artem Bartenev (bartenev92@gmail.com)
 * @version $Id$
 * @since 11.09.2017
 */
public class Teacher {
    /**
     * class teacher.
     */
    private Profession teacher = new Profession("Олег", "учитель математики", 33);

    /**
     * Teaching learner.
     * @param learner is learner
     * @return string
     */
    public String teach(Learner learner) {
        return (teacher.getName() + " " + teacher.getType() + " учит " + learner.getType() + " " + learner.getName());
    }

    /**
     * Set homework for learner.
     * @param learner is learner
     * @return string
     */
    public String setHomework(Learner learner) {
        return (teacher.getType() + " " + teacher.getName() + " задаёт домашнее задание для" + learner.getType() + " " + learner.getName());
    }

    /**
     * Checking homework learner.
     * @param learner is learner
     * @return string
     */
    public String checkHomework(Learner learner) {
        return (teacher.getType() + " " + teacher.getName() + " проверяет домашнее задание " + learner.getType() + " " + learner.getName());
    }
}

/**
 * Class learner with type and name.
 */
class Learner {
    /**
     * Type of learner.
     */
    private String type = "ученика";
    /**
     * Name of learner.
     */
    private String name = "Аркадия";

    /**
     * Geting type.
     * @return type
     */
    public String getType() {
        return this.type;
    }

    /**
     * Geting name.
     * @return name
     */
    public  String getName() {
        return this.name;
    }
}
