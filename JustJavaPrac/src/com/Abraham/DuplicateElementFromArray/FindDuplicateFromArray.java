package com.Abraham.DuplicateElementFromArray;

import java.util.HashSet;
import java.util.Set;

public class FindDuplicateFromArray {

    public static void main(String[] args) {

        int[] num = {3, 5, 7, 7, 2, 3, 10, 14};

        Set<Integer> mySet = new HashSet<>();
        long start = System.nanoTime();
        for(Integer ele: num){
            if(mySet.add(ele) == false){
                System.out.println("We found duplicate values: " + ele + " ");
            }
        }
        long end =System.nanoTime();
        long totalTime = end - start;
        System.out.println("The runtime is " + totalTime);


        for(int i=0; i<num.length; i++){
            for(int j= i+1; j<num.length-1; j++){
                if(num[i] == num[j] && (i != j)){
                    System.out.print("duplicate values " + num[j] + " ");
                }
            }
        }

    }
}
