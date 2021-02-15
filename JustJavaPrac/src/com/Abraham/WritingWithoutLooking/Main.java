package com.Abraham.WritingWithoutLooking;

public class Main {

    public static void main(String[] args) {

        int[] myArray = {7, 3, 5, 9, 6, 2,1};


        FindTheLargest ftl = new FindTheLargest();

        System.out.println();
        System.out.println("The largest element in myArray is " + ftl.findLarge(myArray, 7) );
        /*
                7 , 3 = 3, 7    then = {3, 7, 5, 9, 6, 2, 1};
                7, 5  = 5, 7    then = {3, 5, 7, 9, 6, 2, 1};
                7, 9 =  the condition checking here false; so nothing happens
                                then = {3, 5, 7, 9, 6, 2, 1};
               9, 6 = 6, 9      then = {3, 5, 7, 6, 9, 2, 1};
               9, 2 = 2, 9      then = {3, 5, 7, 6, 2, 9, 1};
               9, 1 = 1, 9      then = {3, 5, 7, 6, 2, 1, 9};

               again iteration:
               3, 5 = ok , then = {3, 5, 7, 6, 2, 1, 9};
               5, 7 = ok, then = {3, 5., 7, 6, 2, 1, 9};
               7, 6 = 6, 7 then = {3, 5., 6, 7, 2, 1, 9};
               7, 2 = 2, 7 then = {3, 5., 6, 2, 7, 1, 9};
               7, 1 = 1, 7 then = {3, 5., 6, 2, 1, 7, 9};
               7, 9 = ok nothing change then = {3, 5, 6, 2, 1, 7, 9};

               again iteration

               3, 5 = ok
               5, 6 = ok
               6, 2 = swap = 2, 6 then = {3, 5, 2, 6, 1, 7, 9};
               6, 1 = SWAP = 1, 6 then = {3, 5, 2, 1, 6, 7, 9};
               6, 7 = ok
               7, 9 = ok   now we have ={3, 5, 2, 1, 6, 7, 9} but still not sort,  do it again


               3, 5 = ok
               5, 2 = swap = 2, 5 then = {3, 2, 5, 1, 6, 7, 9};
               5, 1 = swap = 1, 5 then = {3, 2, 1, 5, 6, 7, 9};
               5, 6 = ok
               6, 7 = ok
               7, 9 = ok
                            Still not done yet = {3, 2, 1, 5, 6, 7, 9};
               3, 2 = swap = 2, 3 then = {2, 3, 1, 5, 6. 7, 9};
               3, 1 = swap = 1, 3 then = {2, 1, 3, 5 , 6, 7, 9};
               3, 5 = ok
               5, 6 = ok
               6, 7 = ok
               7, 9 = ok
                            OMG! still not done = {2, 1, 3, 5, 6, 7, 9};
               2, 1 = swap = 1, 2 the = {1, 2, 3, 5, 6, 7, 9}:
               2, 3 = ok
               3, 5 = ok
               5, 6 = ok
               6, 7 = ok
               7, 9 = ok

               Finally our array has been sorted. WOW!!!!
               {1, 2, 3, 5, 6, 7, 9}

                The key point is here when the array sorted,
                we can tell last element of the array is the largest element.
                In this particular case is 9.
                There for we print the method return a[total -1] because it is index at 5

         */
        //If you want you can see the all sorted myArray
        System.out.println("Sorted myArray is " );
        ftl.sortedArray(myArray,6);

    }
}
