package com.Abraham.String;

public class CountTotalCharecter {

    public static void main(String[] args) {
        String myString = "Welcome to the new Year 2021";
        int count=0;
        for(int i=0; i<myString.length(); i++){
            if (myString.charAt(i) != ' ')
                count++;
        }
        System.out.println("The total characters is " + count);
    }
}
