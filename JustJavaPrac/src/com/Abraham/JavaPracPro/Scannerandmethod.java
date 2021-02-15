package com.Abraham.JavaPracPro;

/**
     This program shows different way to Scanner object
     and print out using method.
     in method inside how to take Scanner sc
 */

import java.util.Scanner;
public class Scannerandmethod {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        var i1 = getInput(sc, "Enter value 1: ");
        var i2 = getInput(sc, "Enter value 2: ");
        var i3 = getInput(sc, "Enter vale 3: ");
        var i4 = getInput(sc, "Enter value 4: ");
        var i5 =getInput(sc, "Enter value 5: ");
        var i6= getInput(sc, "Enter value 6 ");

        //lets add the two values and use the method
        double result = addValues(i1, i2);
        System.out.println("The sum is: " + result);

        double overRiddingResult = addValues(i1, i2, i3, i4);
        System.out.println("The sum is: " + overRiddingResult);

        double multipleParamerter = addValues(i1, i2, i3, i4, i5, i6);
        System.out.println("The multiple sum is: " + multipleParamerter);
    }

    private static int getInput(Scanner sc, String prompt){
        System.out.println(prompt);
        return sc.nextInt();
    }

    private static double addValues(int i1, int i2){
        return i1 + i2;

    }

        //Now take a look overloading method. method name is same but signature I mean parameter
        //is different.

    private static double addValues(int i1, int i2, int i3, int i4) {
        return i1 + i2 + i3 + i4;
    }

    private static double addValues(int... values){
        //First we need to initialize a value
        int result = 0;
        for(var value: values){
            result += value;
        }
        //End of the loop we have to return the result
        return result;
    }
}









