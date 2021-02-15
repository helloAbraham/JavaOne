package com.Abraham.SearchingAndSorting.LinearSerach;

public class Main {
    public static void main(String[] args) {
        LeanerSearchExm leanerSearchExm = new LeanerSearchExm();
        int[] myArray = {10, 20, 30, 50, 79,80, 90};
        int key = 79;

        System.out.println(key + " is found at index " + leanerSearchExm.leanerSearch(myArray,key));
        //Also we can direct put the number like as
        System.out.println(80 + " The input number at index " + leanerSearchExm.leanerSearch(myArray, 80));
    }
}
