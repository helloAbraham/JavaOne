package com.Abraham.String.StringReverse;

public class ReverseStringUsingStringBuilder {
    public static void main(String[] args) {
        String str = ".rM olleH";

        StringBuilder input = new StringBuilder();

        //append a string into StringBuilder input
        input.append(str);
        //Now reverse StringBuilder input
        input = input.reverse();

        //print reverse String
        System.out.println(input);

    }
}
