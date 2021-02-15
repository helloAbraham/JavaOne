package com.Abraham.OccurenceArrayExampleUnpaired;
/**
 This is the simple program will find you unpaired value.
 The question seems like so complex actually not,lets take a look the question
 Find value that occurs in odd number of elements.
 A non-empty array A consisting of N integers is given.
 The array contains an odd number of elements, and each element of the array can be paired
 with another element that has the same value, except for one element that is left unpaired.
 For example, in array A such that:
 A[0] = 9  A[1] = 3  A[2] = 9
 A[3] = 3  A[4] = 9  A[5] = 7
 A[6] = 9
 the elements at indexes 0 and 2 have value 9,
 the elements at indexes 1 and 3 have value 3,
 the elements at indexes 4 and 6 have value 9,
 the element at index 5 has value 7 and is unpaired.
 Write a function:
 class Solution {
 public int solution(int[] A);
    --- ----
 }
 that, given an array A consisting of N integers fulfilling the above conditions,
 returns the value of the unpaired element.
 For example, given array A such that:
 A[0] = 9  A[1] = 3  A[2] = 9
 A[3] = 3  A[4] = 9  A[5] = 7
 A[6] = 9
 the function should return 7, as explained in the example above.
 */
import java.util.Set;
import java.util.HashSet;
public class ExampleUnpairedNumber {

    public int solution(int[] A){
        int n = A.length;
        int unpaired;
        Set<Integer> mySet = new HashSet<>();
        for(int i =0; i<n; i++){
            if(mySet.contains(A[i])){
                mySet.remove(A[i]);
            }else{
                mySet.add(A[i]);
            }
        }

        unpaired = mySet.iterator().next();
        return unpaired;
    }

    public static void main(String[] args) {
        int[] myArray = {9, 3, 9,3, 9, 7, 9};

        //Creating an object of ExampleUnpairedNumber
        ExampleUnpairedNumber unpairedNumber =  new ExampleUnpairedNumber();

        System.out.println(" " + unpairedNumber.solution(myArray));

        String[]  names = {"Abraham", "Parker", "Abraham", "Parker", "John", "Tommy", "John"};
        SetExampleTwo setExampleTwo = new SetExampleTwo();
        System.out.println(" " + setExampleTwo.solutionString(names));

    }

}
