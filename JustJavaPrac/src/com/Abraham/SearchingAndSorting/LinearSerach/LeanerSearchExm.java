package com.Abraham.SearchingAndSorting.LinearSerach;

/**
    This is the simple program of Leaner Search
    Algorithm in java
 */
public class LeanerSearchExm {
    public int leanerSearch(int[] arr, int key){
        for(int i = 0; i<arr.length; i++){
            if(arr[i] == key){
                return i;
            }
        }
        return -1;
    }

}
