package ru.job4j.bankApplication;

import java.util.*;

/**
 * Bank class which storage a users and their accounts.
 * @author Artem Bartenev (bartenev92@gmail.com)
 * @version $Id$
 * @since 17.11.2017
 */
public class Bank {
    private Map<User, List<Account>> bank = new HashMap<User, List<Account>>();

    /**
     * Adding user to bank.
     * @param user is user without accounts
     */
    public void addUser(User user) {
        List<Account> accounts = new ArrayList<Account>();
        bank.put(user, accounts);
    }

    /**
     * Delete user from bank.
     * @param user is user.
     */
    public void deleteUser(User user) {
        bank.remove(user);
    }

    /**
     * Add account to user.
     * @param user is user in bank
     * @param account is one more account for user
     */
    public void addAccount(User user, Account account) {
        List<Account> usersAccount = bank.get(user);
        usersAccount.add(account);
        bank.put(user, usersAccount);
    }

    /**
     * Delete account from user.
     * @param user is user fron bank
     * @param account is account  from user
     */
    public void deleteAccountFromUser(User user, Account account) {
        List<Account> usersAccount = bank.get(user);
        usersAccount.remove(account);
        bank.put(user, usersAccount);
    }

    /**
     * Getting user's accounts
     * @param user is user from bank.
     * @return List of user's account
     */
    public List<Account> getUsersAccount(User user) {
        return bank.get(user);
    }

    /**
     * Getting users.
     * @return Set of users.
     */
    public Set<User> getUsers() {
        return bank.keySet();
    }

    /**
     * Transfer amount of money from one user to another user
     * @param srcUser is source user
     * @param srcAccount is account of source user
     * @param dstUser is destination user
     * @param dstAccount is account of destination user
     * @param amount is amount of money
     * @return result of transfer(true or false)
     */
    public boolean transferMoney(User srcUser, Account srcAccount, User dstUser, Account dstAccount, double amount) {
        boolean result = false;
        List<Account> accountsSourceUser = bank.get(srcUser);
        List<Account> accountsDestinationUser = bank.get(dstUser);
        for (Account account : accountsSourceUser) {
            if (srcAccount.equals(account) & account.getValue() >= amount) {
                account.setValue(account.getValue() - amount);
                accountsSourceUser.set(accountsSourceUser.indexOf(account), account);
                this.bank.put(srcUser,accountsSourceUser);
                for (Account accountDst : accountsDestinationUser) {
                    if (dstAccount.equals(accountDst)) {
                        accountDst.setValue(accountDst.getValue() + amount);
                        accountsDestinationUser.set(accountsDestinationUser.indexOf(accountDst), accountDst);
                        this.bank.put(dstUser, accountsDestinationUser);
                        result = true;

                        break;
                    }
                }
            }else {
                result = false;
                }
            break;
        }
        return result;
    }
}
