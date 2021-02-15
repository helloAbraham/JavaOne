package com.Abraham.Exception.ThrowVSThrows;

/**
 Throw is a keyword which is used to throw an exception explicitly
 in the program inside a function or inside a block of code.
 Throws is a keyword used in the method signature used to declare an exception
 which might get thrown by the function while executing the code.
 */
public class ThrowExceptionTester {
    //Creating a method
    public void checkSmokingAge(int age){
        if(age<18)
            throw new ArithmeticException("Smoking not allowed that age.");
        else
            System.out.println("Yes! in New York You can Smoke");
    }

}
