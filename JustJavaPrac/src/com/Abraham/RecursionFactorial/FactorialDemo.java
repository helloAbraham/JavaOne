package com.Abraham.RecursionFactorial;
import javax.swing.JOptionPane;
/**
    This program demonstrate the recursive factorial method
 */

public class FactorialDemo {
    public static void main(String[] args) {
        String input;
        int number;

        //Get a number from the user
        input = JOptionPane.showInputDialog("Please Enter a " + "non-negative number: " );
        number = Integer.parseInt(input);

        //Display the factorial of the number
        JOptionPane.showMessageDialog(null, number + "! is " + factorial(number));

        System.exit(0);
    }
    /**
        The factorial method uses recursion to calculate the
        factorial of its argument, which is assumed to be a non-negative number
        @param n The number to use in the calculation.
        @return The factorial of n
     */
    private static int factorial(int n)
    {
        if(n ==0)      //base case
            return 1;
        else
            return n * factorial(n -1);
    }

}
