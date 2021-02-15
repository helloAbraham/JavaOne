package com.Abraham.FibonacciWithRecursion;

public class AnotherMethodFibonacci {

    /*
        The fib method calculates the nth number in the Fibonacci series.
        @param n The nth number to calculate
        @return The nth number
     */

    public static int fib(int n)
    {
     if(n == 0)
         return 0;
     else if(n == 1)
         return 1;
     else
         return fib(n-1) + fib(n-2);
    }

    public static void main(String[] args) {
        System.out.println("The first 10 numbers in " + "the Fibonacci series are: ");
        for (int i = 0; i < 50; i++)
        {
            System.out.print(fib(i) + ", ");
        }
    }
}
