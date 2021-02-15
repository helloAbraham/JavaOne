package com.Abraham.Array.arraySort;

import java.lang.reflect.Array;
import java.util.Arrays;

public class UsingArraySortToFindLargest {

    public int findLargest(int[] a, int total){
        Arrays.sort(a);
        return a[total-1]; //After sorting this is the index which contains the largest element
    }
    public static void main(String[] args) {
        int[] myArray = {1,4,2,7,3,5};
        int[] myArrayOne = {22,34,29,77,99,89,45};

    }
}
