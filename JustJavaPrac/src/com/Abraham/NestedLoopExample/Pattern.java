package com.Abraham.NestedLoopExample;
// It's can be done other way too.

//I'm going to follow just regular basic base understanding nested loop



public class Pattern {

    public static void main(String[] args) {
       final int baseSize = 9;

       //using loop to increase
        for (int r = 0; r < baseSize/2; r++)
        {
            for(int c = 0; c < (r+1); c++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
        // using another for loop to decrease

        for(int r=0; r<= baseSize/2; r++)
        {
            for(int c = baseSize/2; c>=r; c--)
            {
                System.out.print("*");
            }
            System.out.println();
        }

    }

}
