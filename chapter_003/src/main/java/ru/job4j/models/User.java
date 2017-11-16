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

        int result = this.getAge() - o.getAge();
        return result != 0 ? result : this.getName().compareTo(o.getName());
    }

    @Override
    public String toString() {
        return
                "name " + name + '\'' +
                        ", age=" + age;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        User user = (User) o;

        if (age != user.age) return false;
        return name != null ? name.equals(user.name) : user.name == null;
    }

}
