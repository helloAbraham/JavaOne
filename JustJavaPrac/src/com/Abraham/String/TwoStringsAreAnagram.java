package com.Abraham.String;

import java.util.Arrays;

public class TwoStringsAreAnagram {
    public static void main(String[] args) {
        String strOne = "Brag";
        String strTwo = "Grab";

        //first convert to lower case
        strOne = strOne.toLowerCase();
        strTwo = strTwo.toLowerCase();

        //First base case check
        if(strOne.length() != strTwo.length()){
            System.out.println("Both the String are not anagram");
        }else {
            //Now let's put both to the Character Array
            char[] myStringOne = strOne.toCharArray();
            char[] myStringTwo = strTwo.toCharArray();

            //Now time to use the logic
            //sorting array using build itn method
            Arrays.sort(myStringOne);
            Arrays.sort(myStringTwo);

            if(Arrays.equals(myStringOne, myStringTwo)){
                System.out.println("Both the Strings are anagram.");
            }else{
                System.out.println("Both are not anagram");
            }
        }
    }
}
