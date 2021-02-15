package com.abraham.CreatingOwnExceptionClass;

public class NegativeStartBal extends Exception{

    public NegativeStartBal(){
        super("Error: Negative starting balance ");
    }

    public NegativeStartBal(double amount){
        super("Error: Negative starting balance: " + amount);
    }

}
