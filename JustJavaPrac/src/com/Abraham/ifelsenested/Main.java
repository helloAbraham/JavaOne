package com.Abraham.ifelsenested;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //int number = 10; //Changes the value to test different conditions
        //we can give oppertunity to user input the number from between 0 to 10
        //so that we can compare our condition

        Scanner keyboard = new Scanner(System.in);

        System.out.println("Please Enter number between 0 to 10: ");
        int number = keyboard.nextInt();
        //First level condition
        if(number > 0) {
            System.out.println("The number is positive");

            //second level condition
            if(number > 5){
                System.out.println("The number is grater than 5 ");

                //Third level condition
                if(number > 8) {
                    System.out.println("The number is greater than 8");

                    //Forth level condition
                    if(number == 10){
                        System.out.println("The number is exactly 10");
                    } else {
                        System.out.println("The number is greater than 8 but not 10 or out of range!");
                    }
                } else {
                    System.out.println("The number is between 6 and 8");
                }
            } else {
                System.out.println("The number is between 1 and 5");
            }

        } else if(number == 0){
            System.out.println("The number is zero");
        } else {
            System.out.println("The number is negative.");
        }

    }
}

//Note here are the output statements are need to understand.
//any input first it will catch the true then it will catch other condition false value
//since each condition measures have both printout true and false too.
//The one gets true it will skip for false. However, it will catch
// that input related other condition false statements.
//For example if you insert 5 definitely it will catch first condition
// it is positive number, second it will catch second level condition else statement,
//So it will print
/**
 5
 The number is positive
 The number is between 1 and 5
 */

// if you input 6 it will be
/**
 6
 The number is positive
 The number is grater than 5
 The number is between 6 and 8
 */