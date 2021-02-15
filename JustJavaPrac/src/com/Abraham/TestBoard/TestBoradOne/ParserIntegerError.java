package com.Abraham.TestBoard.TestBoradOne;

/**
    This program will show how the Integer.parseInt method throws an exception
 */

public class ParserIntegerError {

    public static void main(String[] args) {

        String str = "456";

        int convertedNumber; // We just declare a variable, but we did not assign any value on to it.


       try{
           convertedNumber = Integer.parseInt(str);
       }catch(NumberFormatException exc){
           System.out.println("Can not convert because of String not a number. " + str);
       }

    }
}
