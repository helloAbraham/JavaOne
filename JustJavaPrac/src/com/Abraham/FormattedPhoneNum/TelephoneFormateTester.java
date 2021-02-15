package com.Abraham.FormattedPhoneNum;

/**
 This program demonstrates the Telephone class's static method

 */

import java.util.*;


public class TelephoneFormateTester {


    public static void main(String[] args)
    {
        String phoneNumber; //To hold the phone number

        //Create the scanner object for keyboard input
        Scanner keyboard = new Scanner(System.in);

        //Now get an unformatted Telephone number

        System.out.print("Enter an unformatted telephone number: ");
        phoneNumber = keyboard.nextLine();


        //Let's format the Telephone number which users input, note her we gonna use object of the class and
        System.out.println("Formatted: " + Telephone.format(phoneNumber));


        //Now let's get formatter telephone number.

        System.out.println("Enther the a telephone number formatted as");
        System.out.println("(XXX)XXX-XXXX: ");
        phoneNumber = keyboard.nextLine();


        //Now our job is to unformat the telephone number
        System.out.println("Unformatted: " + Telephone.unformat(phoneNumber));




        keyboard.close();
    }


}
