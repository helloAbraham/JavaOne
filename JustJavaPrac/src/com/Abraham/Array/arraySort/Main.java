package com.Abraham.Array.arraySort;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
       UsingArraySortToFindLargest findLarge = new UsingArraySortToFindLargest();

        int[] myArray = {5,4,2,7,3,3};
        int[] myArrayOne = {96,34,29,77,99,89,45};

        //In general way to find max is that without using your own method,just using java built in method
        System.out.println("Max element in the array is " + Arrays.stream(myArray).max());
        System.out.println("Smallest element in the array is " + Arrays.stream(myArray).min());

        //Using method
        System.out.println("The Largest Element in the myArray is " + findLarge.findLargest(myArray,6) );
        System.out.println("The Largest Element in the myArrayOne is "+ findLarge.findLargest(myArrayOne, 7));
    }
}
