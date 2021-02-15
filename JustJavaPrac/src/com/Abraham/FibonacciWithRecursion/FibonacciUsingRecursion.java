package com.Abraham.FibonacciWithRecursion;

/**
     This simple program does the Fibonacci program using Recursion
 */

public class FibonacciUsingRecursion {
    static int numOne = 0, numTwo = 1, numThree, count = 10;

    public static void printFibonacci(int count)
    {
        if(count > 0) {
            numThree = numOne + numTwo;
            numOne = numTwo;
            numTwo = numThree;
            System.out.print(", " + numThree);
           printFibonacci(count -1);
        }
    }


    public static void main(String[] args) {

        //let's first print the base case
        System.out.print(numOne + ", " + numTwo);
        int count = 10;
        printFibonacci(count - 2);
    }
}
