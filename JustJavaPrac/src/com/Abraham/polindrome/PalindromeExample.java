package com.Abraham.polindrome;

/**
     This program is about to test that
    a word, phrase, or sequence that reads the same backward as forward, e.g., madam, nursesrun, madamiamadam, racecar
 */
import java.util.Scanner;
public class PalindromeExample {
    public static void main(String[] args) {
        String original, reverse = "";

        Scanner keyboard = new Scanner(System.in);
        System.out.println("Please enter  word or number to check it is palindrome");
        original = keyboard.nextLine();

        int length = original.length();
        for(int i = length-1; i >=0; i--)           //example cba
            reverse = reverse + original.charAt(i);  //the logic is that reverse = ""
                                                    //It will increase 1 by 1 ,  which is for loop
                                                    // produces abc. as reverse order because i--
                                                    //More clearly   index   0   1  2
                                                    //            elements   c   b  a
                                                    //After using for loop for(int i = length-1; i >=0; i--)
                                                    // first 3 - 1 = 2
                                                    // 2 is greater than or equal 0 true, print a
                                                    // 1 is greater than or equal 0 true, print b
                                                    // 0 is greater than or equal 0 ture, print c
                                                    //Iteration done, now we can see abc is assigned to reverse

            //Now just check both string are equal or not
            if(original.equals(reverse)){
                System.out.println("Entered word/number is Palindrome");
            }else {
                System.out.println("Entered word/number is not Palindrome");
            }
        }

}
