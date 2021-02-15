package com.Abraham.IsItPrime;


import java.util.Scanner;
public class CheckTheNumberPrime {

    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);

        System.out.println("Please Enter number: ");
        int input = keyboard.nextInt();

        //int num = 29;
        boolean check = false;
        for (int i = 2; i <= input / 2; ++i) {
            // checking the condition for non-prime number
            if (input % i == 0) {
                check = true;
                break;
            }
        }

        if (!check)
            System.out.println(input + " is a prime number.");
        else
            System.out.println(input + " is not a prime number.");
    }
}
