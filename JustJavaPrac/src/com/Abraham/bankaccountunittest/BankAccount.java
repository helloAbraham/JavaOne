package com.Abraham.bankaccountunittest;

public class BankAccount {
    private String firstName;
    private String lastName;
    private double balance;
    public static final int CHECKING = 1;
    public static final int SAVINGS = 2;

    private int accountType;

    public BankAccount(String firstName, String lastName, double balance, int accountType) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.balance = balance;
        this.accountType = accountType;
    }

    /**
        The branch argument is true if the customer is performing
        the transaction at a branch with a teller.
        It is false if the customer is performing the transaction at an ATM.
     */

    //Create a method for deposit
    public double deposit(double amount, boolean branch){
        balance += amount;
        return balance;
    }

    /**
     The branch argument is true if the customer is performing
     the transaction at a branch with a teller.
     It is false if the customer is performing the transaction at an ATM.
     ATM has restriction can not withdraw more than $1000 each day.
     */
    public double withdraw(double amount, boolean branch) throws IllegalAccessException {
        if((amount > 1000) && !branch){
            throw new IllegalAccessException();
        }
        balance -= amount;
        return balance;
    }

    public double getBalance(){
        return balance;
    }

    public boolean isChecking(){
        return accountType == CHECKING;
    }
}
