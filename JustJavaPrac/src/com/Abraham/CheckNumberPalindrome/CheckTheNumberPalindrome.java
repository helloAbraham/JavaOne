package com.Abraham.CheckNumberPalindrome;
/**
    This is the simple program can tell that your input is a palindrome or not
 */

import java.util.Scanner;
public class CheckTheNumberPalindrome {


    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);
        System.out.println("Please enter an integer to check it is Palindrome: ");
        int input = keyboard.nextInt();

        int reversedNumber = 0, remainder, originalInteger;

        originalInteger = input;

        // reversed integer is stored in variable
        while( input != 0 )
        {
            remainder = input % 10;
            reversedNumber = reversedNumber * 10 + remainder;
            input  /= 10;
        }

        // palindrome if Original Integer and reversedInteger are equal
        // we can compare
        if (originalInteger == reversedNumber)
            System.out.println(originalInteger + " is a palindrome.");
        else
            System.out.println(originalInteger + " is not a palindrome.");
    }


}
