package com.Abraham.Palindrome;

/**
    This simple program will get the text from the user and check
    it is Palindrome or not
 */

import java.util.Scanner;
public class PalindromExample {
    public static void main(String[] args) {
        String original;
        String reverse = "";

        Scanner keyboard = new Scanner(System.in);

        System.out.println("Enter String or Number to check it is Palindrome");
        original = keyboard.nextLine();
        int inputLength = original.length();

        for(int i =inputLength-1; i>=0; i--)             //Note here we do not put "{" becuase we do not show the answer loop through
                                                        //Otherwise it will check every iteration then finally will say yes. 
            reverse = reverse + original.charAt(i);
                if(original.equals(reverse)) {
                    System.out.println("Input is a Palindrome");
                }else {
                    System.out.println("Input is NOT a Palindrome");
                }
        keyboard.close();
    }
}
