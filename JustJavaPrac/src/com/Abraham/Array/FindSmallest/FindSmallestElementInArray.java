package com.Abraham.Array.FindSmallest;

public class FindSmallestElementInArray {
    //This method will do sort of the array like smallest to largest
    //lets say myArray={2,5,9, 1, 7, 3 }; this method will do===> myArray={1, 2, 3, 5, 7, 9}
    public int findSmallest(int[]a, int total){
       // int temp;
        for(int i=0; i<total; i++){
            for(int j=i+1; j<total; j++){
                if(a[i]>a[j]){
                    int temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
        }
        return a[0];
    }
}
