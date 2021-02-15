package com.Abraham.JavaPracPro;
import java.util.Scanner;
public class CheckPalindron {

    //method to check the string is palindrome or not

    public static Boolean isPal(String str){

        //First check the the base case
        if(str.length() == 0 || str.length() == 1)
            return true;

        if(str.charAt(0) == str.charAt(str.length()-1))
            return isPal(str.substring(1, str.length() - 1));
            return false;

    }

    public static void main(String[] args) {

        String input;
        System.out.println("Please Enter a word to check it is palindrome or not");

        Scanner keyboard = new Scanner(System.in);

        input =keyboard.nextLine();

        //now we are calling the recursive method isPal();
        System.out.println("It is " + isPal(input));
    }
}
