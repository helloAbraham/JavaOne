package com.Abraham.ArrayFrequency;

/**
    This is the simple program can tell you inside the array if there
    are elements repeating
 */

public class ArrayFrequency {
    public static void main(String[] args) {

        int[] myArray = new int[] {1, 8, 2, 3, 4, 2, 2, 2, 1};

        int[] fr = new int[myArray.length];


        int visited = -1;


        for(int i = 0; i <myArray.length; i++ ) {

            int count = 1;

            for(int j = i+1; j<myArray.length; j++)
            {
                if(myArray[i] == myArray[j]) {
                    count++;
                    fr[j] = visited;
                }
            }
            //To avoid counting same element again
            if(fr[i] != visited)
                fr[i] = count;
        }


        for(int i = 0; i<fr.length; i++)
            if(fr[i] != visited )
                System.out.println(" " + myArray[i] + " | " + fr[i]);

    }
}
