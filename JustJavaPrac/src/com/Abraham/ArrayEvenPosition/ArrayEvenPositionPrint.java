
package com.Abraham.ArrayEvenPosition;
/**
  Program to print the elements of an array present on even position
  for example. int [] myArray = {1, 3, 6, 8, 9, 4, 7, 10}

 */

import java.util.*;

public class ArrayEvenPositionPrint {

    public static void main(String[] args) {
        int [] myArray = {1, 3, 6, 8, 9, 4, 7, 10};

        //position:     1    2    3   4   5   6   7
        //elements:     1    3    6   8   9   7   10
        //indices       0    1    2   3   4   5   6

        System.out.println("The array elements in Even Positions are: ");
        for(int i = 1; i<myArray.length; i=i+2) {                 //(i=i+2 can be written as i +=2)
           System.out.print(myArray[i] + " ");
        }

        System.out.println("");
        //Now let's say we want to print the odd position of the array elements located

        System.out.println("\nThe array elements in ODD Position are :");
        for(int i =0; i<myArray.length; i= i+2){
            System.out.print( myArray[i] + " ");
        }
    }
}
