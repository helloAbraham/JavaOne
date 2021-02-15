package com.Abraham.TestBoard;

public class StirngNumberFindintheArray {

    public static void main(String[] args) {

            String[] myNum = {"1", "4", "2", "6", "Volvo", "BMW", "Ford", "Mazda", "4", "5", "2", "1"};
            int sum = 0;
            //using for loop retrieve and try catch
            for (String element : myNum) {
                try {
                    int convertedNum = Integer.parseInt(element);
                    sum += convertedNum;

                } catch (NumberFormatException e) {
                    System.out.println("Element " + element + " in the array are not integer");
                }

            }
            System.out.println("Some elements in the array are integers and their sum is " + sum);

        }

}
