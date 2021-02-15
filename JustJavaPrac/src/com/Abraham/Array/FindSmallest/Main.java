package com.Abraham.Array.FindSmallest;

public class Main {
    public static void main(String[] args) {
        FindSmallestElementInArray fse = new FindSmallestElementInArray();
        int[] myArray={2, 5, 9, 1, 7, 3 };
        int[] anotherArray = {99, 76, 23, 19, 77, 97, 7};

        System.out.println("The smallest element in the array is " + fse.findSmallest(myArray, 6));
        System.out.println("The smallest element in the array is " + fse.findSmallest(anotherArray, 7));
    }
}
