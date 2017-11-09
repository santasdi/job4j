package ru.job4j.models;

/**
 * Class User.
 * @author Artem Bartenev (bartenev92@gmail.com)
 * @version $Id$
 * @since 09.11.2017
 */
public class User implements Comparable<User>{
    private String name;
    private int age;

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }
    public User(String name, int age) {
        this.age = age;
        this.name = name;
    }
    @Override
    public int compareTo(User o) {

        return this.getAge() < o.getAge() ? -1 : this.getAge() > o.getAge() ? 1 : 0;
    }

    @Override
    public String toString() {
        return
                "name " + name + '\'' +
                        ", age=" + age;
    }
}
