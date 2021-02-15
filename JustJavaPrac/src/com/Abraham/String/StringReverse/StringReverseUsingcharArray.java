package com.Abraham.String.StringReverse;

import java.lang.*;

public class StringReverseUsingcharArray {

    public static void main(String[] args) {
        String str = ".rM olleH";

        //convert to char array

        char[] reverseString = str.toCharArray();
        for(int i= reverseString.length - 1; i>=0;  i--){
            System.out.print(reverseString[i]);
        }
    }
}
