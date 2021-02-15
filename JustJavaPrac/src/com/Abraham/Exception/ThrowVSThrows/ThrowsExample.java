package com.Abraham.Exception.ThrowVSThrows;

/**
 Throw is a keyword which is used to throw an exception explicitly in the
 program inside a function or inside a block of code.
 Throws is a keyword used in the method signature used to declare an exception
 which might get thrown by the function while executing the code.
 */
public class ThrowsExample {
    public int division(int dividend, int divisor) throws ArithmeticException{
        int result = dividend / divisor;
        return result;
    }
}
