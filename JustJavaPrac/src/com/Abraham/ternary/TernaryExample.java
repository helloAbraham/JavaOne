package com.Abraham.ternary;

/**
    The ternary operator in Java is a concise way to write conditional statement.
    It's often used as a shorthand for simple if-else statements.
    The syntax of the ternary operator in Java as below:
    condition ? expression1 : expression2
 */

//Here's a simple example to illustrate its usage:
public class TernaryExample {
    public static void main(String[] args) {
        int number = 15;
        String result;

        //Using ternary operator to assign value based on condition
        result = (number % 2 == 0) ? "even" : "odd";
        System.out.println("The number is " + result);

        //Just for one line space
        System.out.println("-----------------------------------");
        //If we want we can make shorter, we do not need to create a variable to hold the value
        //unless requirement to other condition.
        System.out.println( number % 2 == 0 ? " The number is Even" : " The number is Odd");
    }
}

/**
 Explanation:

 In this example, we have a variable number initialized with the value 10.
 The ternary operator (number % 2 == 0) ? "even" : "odd" checks whether number is even or odd.
 If number % 2 == 0 (i.e., the remainder when dividing number by 2 is zero), then "even" is assigned to result,
 Otherwise (i.e., if number % 2 != 0), "odd" is assigned to result.
 The expression result = (number % 2 == 0) ? "even" : "odd"; evaluates to "even" since 10 is even.
 Finally, we print out the result using System.out.println.

 You can use the ternary operator for other types of conditions and expressions as well. It's particularly useful for assigning values based on simple conditions in a single line of code.

 */