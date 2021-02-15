package com.Abraham.Pattern;

public class PatternLeftTriangle {

    public static void main(String[] args) {
        //lets declare few variables
        int i, j, row = 6;

        //here outer loops work for row
        for(i = 0; i<row; i++)
        {
            //Inner loop works for space
            for(j = 2 * (row - i); j >= 0; j--)
            {
                //print space between two stars
                System.out.print(" ");
            }
                for(j =0; j<=i; j++)
                {
                    //now prints star
                    System.out.print("* ");
                }
            //throws the cursor in a new line after printing each line
            System.out.println();
        }
    }
}
