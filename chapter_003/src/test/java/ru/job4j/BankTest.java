package ru.job4j;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

import org.junit.Test;
import ru.job4j.bankApplication.*;
import ru.job4j.bankApplication.User;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * Test methods for Bank class.
 * @author Artem Bartenev (bartenev92@gmail.com)
 * @version $Id$
 * @since 17.11.2017
 */
public class BankTest {
    /**
     * Test to adding users to bank.
     */
    @Test
    public void whenAddUserThenBankHaveUser() {
        Bank bank = new Bank();
        bank.addUser(new User("Andrew", 346));
        bank.addUser(new User("Barry", 1711));
        Set<User> set = new HashSet<>();
        set.add(new User("Andrew", 346));
        set.add(new User("Barry", 1711));
        assertThat(bank.getUsers(), is(set));
    }

    /**
     * Test to delete user from bank.
     */
    @Test
    public void whenDeleteUserThenBankHaveNotUser() {
        Bank bank = new Bank();
        User user = new User("Andrew", 346);
        bank.addUser(user);
        bank.addUser(new User("Barry", 1711));
        bank.deleteUser(user);
        Set<User> set = new HashSet<>();
        set.add(new User("Barry", 1711));
        assertThat(bank.getUsers(), is(set));
    }

    /**
     * Test to add account to user.
     */
    @Test
    public void whenAddAccountThenUserHaveAccount() {
        Bank bank = new Bank();
        User user = new User("Andrew", 346);
        Account account = new Account(1000, 777777);
        bank.addUser(user);
        bank.addAccount(user, account);
        List<Account> list = new ArrayList<Account>();
        list.add(account);
        assertThat(bank.getUsersAccount(user), is(list));
    }

    /**
     * Test to delete account to user.
     */
    @Test
    public void whenDeleteAccountThenUserHastAccount() {
        Bank bank = new Bank();
        User user = new User("Andrew", 346);
        Account accountFirst = new Account(1000, 777777);
        Account accountSecond = new Account(5500, 777790);
        bank.addUser(user);
        bank.addAccount(user, accountFirst);
        bank.addAccount(user, accountSecond);
        bank.deleteAccountFromUser(user, accountSecond);
        List<Account> list = new ArrayList<Account>();
        list.add(accountFirst);
        assertThat(bank.getUsersAccount(user), is(list));
    }

    /**
     * Test to transfer amount of money from one user to another user.
     */
    @Test
    public void transMoneyFromUserThenAnotherUserHasThisMoney() {
        Bank bank = new Bank();
        User userFirst = new User("Andrew", 346);
        User userSecond = new User("Valentin", 1922);
        Account accountFirst = new Account(1000.00, 777777);
        Account accountSecond = new Account(5500.00, 777790);
        bank.addUser(userFirst);
        bank.addUser(userSecond);
        bank.addAccount(userFirst, accountFirst);
        bank.addAccount(userSecond, accountSecond);
        bank.transferMoney(userFirst, accountFirst, userSecond, accountSecond, 900.00);
        assertThat(bank.getUsersAccount(userSecond).get(bank.getUsersAccount(userSecond).indexOf(accountSecond)).getValue(), is(6400.00));
    }
}
