package com.Abraham.ArrayStringException;

public class ArrayStringException {

    public static void main(String[] args) {
        String [] myNum = {"1", "4", "2", "6", "BMW", "Mercedes-Benz", "Ford", "Toyota", "4", "5", "2", "1"};
        int sum = 0;

        //using for loop retrieve array element data and converted to integer;
        // to calculate the sum and try catch if there are not integer do not crash the program
        for(String element: myNum) {
            try{
                int convertedNum = Integer.parseInt(element);
                sum += convertedNum;

            }catch(NumberFormatException e){
                System.out.println("Element " + element + " in the array are not integer"  );
            }

        }
        System.out.println("Some elements in the array are integers and their sum is " + sum);
    }

}
