package com.Abraham.charandboolean;

/**
    A char occupies two bytes of memory, or 16 bits and thus has a width of 16.
    The reason it's not just a single byte is that it allows you to store Unicode characters.
    Unicode is an international encoding standard for use with different languages and script,
    by which each letter, digit, or symbol is assigned a unique numeric value that applies across
    different platform and programs.

    Unicode allows us to represent these languages and the way it works is that by using a
    combination of the two bytes that a char takes up in memory it can represent and one of
    65535 different types of characters.
        unicode-tables.com/ You can see unicode characters
 */
public class CharAndBooleanExm {

    public static void main(String[] args) {
        char myChar = 'D';
        char myUnicodeChar = '\u0044';
        System.out.println(myChar);
        System.out.println(myUnicodeChar);

        //Now let's say we want to print out CopyRight C with round symble
        char unicodeCopyRight = '\u00A9';
        System.out.println("Copy Right"+unicodeCopyRight +" "+ 2021);

        System.out.println("---------------------------------------");

        /*
            A boolean value allows for two choices True or False, Yes or No, 1 or 0.
            In java terms we have a boolean primitive type and it can be set
            to two values only. true or false. They are actually pretty useful,
            and you will use them a lot when programming.
         */

        boolean myTrueBooleanValue = true;
        boolean myFalseBooleanValue = false;


        boolean isCustomerOverTwentyOne = true;  // We use is... naming convention


    }

}
