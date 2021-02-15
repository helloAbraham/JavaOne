package com.abraham.CreatingOwnExceptionClass;

public class BankAccount {
    double balance;


    public BankAccount(double startingBalance) throws NegativeStartBal{
       if(startingBalance < 0){
           throw new NegativeStartBal(startingBalance);
       }
    }


}
