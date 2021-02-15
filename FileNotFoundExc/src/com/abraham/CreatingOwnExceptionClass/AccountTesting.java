package com.abraham.CreatingOwnExceptionClass;

public class AccountTesting {

    public static void main(String[] args) {
        //Forcing a Negative Starting Balance on Exception

        try{
            BankAccount account = new BankAccount(-100.76);

        }catch(NegativeStartBal nsb){
            System.out.println(nsb.getMessage());
        }
    }
}
