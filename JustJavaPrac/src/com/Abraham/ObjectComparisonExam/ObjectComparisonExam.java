package com.Abraham.ObjectComparisonExam;

import javax.swing.*;
import java.util.Scanner;

/**
    Here is the simple program java equals() method
 */

public class ObjectComparisonExam {

    public static void main(String[] args) {
        //let's create constructor of the double class
        Double doubleNum = new Double(77.123);

        //let's create the constructor of the long class
        Long longNum = new Long(123321);

        //now it's time to comparison for the equals() method

        System.out.println("Objects are not equal, hence it does return " + doubleNum.equals(longNum));

        //Now testing true for the equals() method if both object are same value
        System.out.println("Object are equals, hence it does return " + doubleNum.equals(123.321));

        long number = 1234434; //I declare a variable to hold the number


             //  int myMumber = 1213;
      //  System.out.println(myMumber);
        //For example I'm going to use Integer as wrapper class

        Integer myNewNumber = new Integer(456);
        System.out.println(myNewNumber);
        /**
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Please enter a number");
        int input = keyboard.nextInt();

        System.out.println("Thanks for input: " + input);

        */


        String input2 = JOptionPane.showInputDialog("Please Enter the number ");

            int takeNumber = Integer.parseInt(input2);
            JOptionPane.showMessageDialog(null, " Your input number is :" + input2);

        double doubleNumber = Double.parseDouble(input2);
        JOptionPane.showMessageDialog(null, input2);

        String str = "My Name is Abraham";

        String str3 = new String("My name is Abraham");

    }

}

/**
        Primitive data types are:
        int, double, float, long, char, boolean, short, byte.

        String is a class,

 */
