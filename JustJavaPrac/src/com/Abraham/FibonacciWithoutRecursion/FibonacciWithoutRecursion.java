package com.Abraham.FibonacciWithoutRecursion;

import org.w3c.dom.ls.LSOutput;

/**
     This is the basic java program showing fibonacci without using recursion
 */

public class FibonacciWithoutRecursion {
    public static void main(String[] args) {
        int numOne = 0, numTwo = 1, numThree, count = 10;
        //let's print first 0 and 1 since these are the first two fibonacci number
        System.out.print(numOne + " " + numTwo);

        //now loop through all other elements
        for(int i = 2; i<count; ++i) //++i increments the number before the current expression is evaluated.
        {
            numThree = numOne + numTwo;
            System.out.print(" " + numThree);
            numOne = numTwo;
            numTwo = numThree;
        }

    }
}
