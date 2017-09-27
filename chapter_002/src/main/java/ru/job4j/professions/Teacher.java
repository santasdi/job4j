package ru.job4j.professions;

/**
 *  Realization of teacher's profession.
 * @author Artem Bartenev (bartenev92@gmail.com)
 * @version $Id$
 * @since 11.09.2017
 */
public class Teacher {
    Profession teacher = new Profession("Олег", "учитель математики", 33);
    public String teach(Learner learner) {
        return (teacher.getName() + " " + teacher.getType() + " учит " + learner.type + " " + learner.name);
    }
    public String setHomework(Learner learner) {
        return (teacher.getType() + " " + teacher.getName() + " задаёт домашнее задание для" + learner.type + " " + learner.name);
    }
    public String checkHomework(Learner learner){
        return (teacher.getType() + " " + teacher.getName() + " проверяет домашнее задание " + learner.type + " " + learner.name);
    }
}
class Learner {
    String type = "ученика";
    String name = "Аркадия";
}
