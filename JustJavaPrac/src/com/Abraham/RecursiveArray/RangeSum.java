package com.Abraham.RecursiveArray;

/**
     This program demonstrate the recursive rangeSum method
 */

public class RangeSum {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9};

        //Note here is talking about the array index 2 through 5 which is 3, 4, 5, 6
        System.out.println("The sum of elements in the 2 through " + " 5 is " + rangeSum(numbers, 2, 5));
    }


    /**
        The rangeSum method calculats the sum of a specified
        range of elements in array.
        @param start Specifies the starting element.
        @param end Specifies the ending element
        @return The sum of the range.
     */

    //important note its counting as index not element in the array
    public static int rangeSum(int[] array, int start, int end)
    {
        if(start > end)
            return 0;
        else
            return array[start] + rangeSum(array, start + 1, end);
    }

}
