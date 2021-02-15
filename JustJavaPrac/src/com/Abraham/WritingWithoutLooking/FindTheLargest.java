package com.Abraham.WritingWithoutLooking;

import org.w3c.dom.ls.LSOutput;

public class FindTheLargest {
    public int findLarge(int[] a, int total){
        int temp;
        for(int i=0; i<total; i++){
            for(int j=i+1; j<total; j++){
                if(a[i] > a[j]){
                    temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
        }

        return a[total - 1];
    }

    //Just print the sorted array
    public void sortedArray(int[] a, int total) {

        int temp;
        int i;
        for (i = 0; i < a.length; i++) {
            for (int j = i + 1; j < a.length; j++) {
                if (a[i] > a[j]) {
                    temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
            System.out.print(" " + a[i]);
        }

    }


}
