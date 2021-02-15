package com.Abraham.String.FindAllSubset;

public class StringFindAllSubset {

    public static void main(String[] args) {
        String myString = "USAT";
        int len = myString.length();
        int temp = 0;
        //System.out.println(myString.length());
        String arr[] = new String[len*(len + 1)/2];
        //This loop maintains the starting character

        for(int i =0; i<len; i++){
            //this loop adds the next character every iteration for the subset to
            // form and add it to the array
            for(int j =i; j<len; j++){
                arr[temp] = myString.substring(i, j+1);
                temp++;
            }
        }

        //This loop prints all the subset formed from the string
        for (int i = 0; i<arr.length; i++){
            System.out.println(arr[i]);
        }

    }
}
