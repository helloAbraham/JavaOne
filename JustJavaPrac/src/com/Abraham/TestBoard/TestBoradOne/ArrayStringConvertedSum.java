package com.Abraham.TestBoard.TestBoradOne;

/**
    This is the simple program will show how to use try catch on String array.
    The array contains some elements are String "1", "3" "Ford"
    we can calculate 1 + 3 = 4
    Exception will show Ford is not an Integer
 */

public class ArrayStringConvertedSum {

    public static void main(String[] args) {

        //Given
        String[] myNum = {"1", "3", "5", "Ford", "4", "7", "Toyota", "BMW", "9", "Mercedes-benz"};
        //Question is show SUM of all the elements in the array
        //If there are some elements are not Integer, show them exception

        int sum = 0;

        //For each loop
        for(String element: myNum ){
            try{
                int number = Integer.parseInt(element);
                sum += number;
            }catch(NumberFormatException ex){
                System.out.println("Elements " + element + " in the array is NOT number.");
            }
        }
        System.out.println("Some elements in the array are integer and their SUM is " + sum);
    }
}
