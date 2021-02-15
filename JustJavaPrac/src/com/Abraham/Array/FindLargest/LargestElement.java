package com.Abraham.Array.FindLargest;

/**
     This is the simple program to find the largest element in the array
     First we gonna create a method called getLargest
    Then in the Main class we will create an object LargestElement
    to access the method
 */
public class LargestElement {
    public int getLargest(int[] a, int total){
        int temp;   //declare temporary variable to hold the value when we gonna use swap
        for(int i =0; i<total; i++){
            for(int j = i+1; j<total; j++){
                if(a[i] > a[j]){
                    temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
            //System.out.print(a[i] + " "); //We can check our array will be organize smaller through largest
        }

        return a[total-1]; //Here we want to -1 because loop starts at 0
                            // user will put how many total elements in the array
                            //let's say 6 elements but index total is 5, actually is 6 elements
                            //because it began from 0, 1, 2, 3 , 4, 5  => total 6
                            //Finally we want to print last element in the array which is gonna be largest

    }

}
