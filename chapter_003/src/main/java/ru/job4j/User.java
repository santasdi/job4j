package ru.job4j;

/**
 * Class User.
 * @author Artem Bartenev (bartenev92@gmail.com)
 * @version $Id$
 * @since 06.11.2017
 */
public class User {
    private int id;
    private String name;
    private String city;

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public User(String name, String city, int id) {
        this.name = name;
        this.city = city;
        this.id = id;

    }
    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getCity() {
        return city;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
    }
        User user = (User) o;

        if (id != user.id) {
            return false;
        }
        if (!name.equals(user.name)) {
            return false;
        }
        return city.equals(user.city);
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + name.hashCode();
        result = 31 * result + city.hashCode();
        return result;
    }
}
