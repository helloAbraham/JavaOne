package com.Abraham.Array.FindLargest;

import com.Abraham.Array.FindLargest.LargestElement;

public class Main {
    public static void main(String[] args) {
        LargestElement largestElement = new LargestElement();

        int[] myArray = {1,4,2,7,3,5};
        int[] myArrayOne = {22,34,29,77,99,89,45};

        System.out.println("The Largest Element in the myArray is " + largestElement.getLargest(myArray,6) );
        System.out.println("The Largest Element in the myArrayOne is "+ largestElement.getLargest(myArrayOne,7));
    }
}
