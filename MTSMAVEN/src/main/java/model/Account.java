package model;

public class Account {
public static Account account;
private static int balance = 1000;
private static Person person;

private Account() {
}

public static Account getAccount(Person p) {
    if (account == null) {
        account = new Account();
    }
    Account.person = p;
    return account;
}

public static int getBal() {
    return balance;
}

public synchronized void withdraw(int bal) {
    try {

        if (balance >= bal) {
        	System.out.println(person.getName()+"Initial Acc balance is Rs." + Account.getBal());
             try {
                Thread.sleep(100);
            } catch (Exception e) {
                e.printStackTrace();
            }
            balance = balance - bal;
            System.out.println(person.getName() + " " + "has widdrawn rs"+bal);
        } else {
            System.out.println(person.getName() + " " + "doesn't have enough money for withdraw ");
        }
        System.out.println(person.getName() + " " + " current balance" + balance);
    } catch (Exception e) {
        e.printStackTrace();
    }
}

public synchronized void deposit(int bal) {
    try {
        if (bal > 0) {
            try {
                Thread.sleep(100);
            } catch (Exception e) {
                e.printStackTrace();
            }
            balance = balance + bal;
            System.out.println(person.getName() + " " + "hs deposited ruppees"+bal);
        } else {
            System.out.println(person.getName() + " " + "doesn't have enough money for deposit");
        }
        System.out.println(person.getName() + " " + "current balance is" + balance);
    } catch (Exception e) {
        e.printStackTrace();
    }
}}