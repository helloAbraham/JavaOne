package com.Abraham.bankaccountunittest.bankaccounttest;

import com.Abraham.bankaccountunittest.BankAccount;
import static org.junit.Assert.*;

public class BankAccountTest {

//create an instance variable
    private BankAccount account;
    private static int count;

    @org.junit.BeforeClass
    public static void beforeClass(){
        System.out.println("This executes before any test cases. Count = " + count++);
    }
    @org.junit.Before //is telling the junit framework to run this method setup every time you run the tests
    public void setup(){
        account = new BankAccount("Abraham", "Parker", 25000.00, BankAccount.CHECKING);
        System.out.println("Running a test ....");
    }

    @org.junit.Test
    public void deposit(){

        double balance = account.deposit(577.00, true);
        assertEquals(25577.00, balance, 0);
        //assertEquals(25577.00, account.getBalance(),0);
    }

    @org.junit.Test
    public void withdraw() throws Exception{
        double balance = account.withdraw(750.00, true);
        assertEquals(24250, balance, 0);
        //fail("The test has yet to be implemented");
    }

    @org.junit.Test
    public void withdraw_branch() throws Exception{
        double balance = account.withdraw(850.00, true);
        assertEquals(24150.00,balance,0);
    }

    @org.junit.Test(expected = IllegalArgumentException.class)
    public void withdraw_notBranch() throws Exception{
        double balance = account.withdraw(2850.00, false);
        assertEquals(22150.00,balance,0);
    }


    @org.junit.Test
    public void getBalance_deposit() {

        account.deposit(577.00, true);
        assertEquals(25577.00, account.getBalance(),0);
    }

    @org.junit.Test
    public void getBalance_withdraw() throws IllegalAccessException {

        account.withdraw(2577.00, true);
        assertEquals(22423.00, account.getBalance(),0);
    }

    @org.junit.Test
    public void isChecking_true(){
       // assertEquals(true, account.isChecking());
        //Just pass the object
        assertTrue("The account is NOT a checking account", account.isChecking());
        //If we want to check something false
        //we can say assertFalse(.... );
    }

    @org.junit.AfterClass
    public static void afterClass(){
        System.out.println("This is executes after any test cases. Count = " +  count++);
    }

    @org.junit.After
    public void teardown(){
        System.out.println("Count = " + count++);
    }

    /**
     //Just show how it works
    @org.junit.Test
    public void dummyTest(){
        assertEquals(20, 21);
    }
    */

}

    /**
            //Befor understanding we just learn first this way
    @org.junit.Test
    public void deposit() {

        BankAccount account = new BankAccount("Abraham", "Parker", 25000.00,BankAccount.CHECKING);
        double balance = account.deposit(577.00, true);
        assertEquals(25577.00, balance, 0);
        //assertEquals(25577.00, account.getBalance(),0);
    }

    @org.junit.Test
    public void withdraw() {
        fail("The test has yet to be implemented");
    }

    @org.junit.Test
    public void getBalance_deposit() {
        BankAccount account = new BankAccount("Abraham", "Parker", 25000.00,BankAccount.CHECKING);
        account.deposit(577.00, true);
        assertEquals(25577.00, account.getBalance(),0);
    }

    @org.junit.Test
    public void getBalance_withdraw() {
        BankAccount account = new BankAccount("Abraham", "Parker", 25000.00,BankAccount.CHECKING);
        account.withdraw(2577.00, true);
        assertEquals(22423.00, account.getBalance(),0);
    }

    @org.junit.Test
    public void isChecking_true(){
        BankAccount account = new BankAccount("Abraham", "Parker", 7000.00,BankAccount.CHECKING);
        // assertEquals(true, account.isChecking());
        //Just pass the object
        assertTrue("The account is NOT a checking account", account.isChecking());
        //If we want to check something false
        //we can say assertFalse(.... );
    }


/**
 //Just show how it works
 @org.junit.Test
 public void dummyTest(){
 assertEquals(20, 21);
 }
 */
