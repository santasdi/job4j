package ru.job4j.bankapplication;

/**
 * User parameters.
 * @author Artem Bartenev (bartenev92@gmail.com)
 * @version $Id$
 * @since 17.11.2017
 */
public class User {
    /**
     * Name of user.
     */
    private String name;
    /**
     * Number of user's passport.
     */
    private int passport;

    public String getName() {
        return name;
    }

    public int getPassport() {
        return passport;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPassport(int passport) {
        this.passport = passport;
    }
    public User(String name, int passport) {
        this.name = name;
        this.passport = passport;
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

        if (passport != user.passport) {
            return false;
        }

        return name.equals(user.name);
    }

    @Override
    public int hashCode() {
        int result = name.hashCode();
        result = 31 * result + passport;
        return result;
    }
}
