package com.Abraham.TestBoard;

public class Fibonacci {

    public static void main(String[] args) {
        int firstFib = 0, secondFib = 1, i, thirdFib, count = 10;

        System.out.println(firstFib + secondFib);

        for(i=2; i<count; ++i){
            thirdFib= firstFib + secondFib;
            System.out.println(" " + thirdFib);

            firstFib = secondFib;
            secondFib = thirdFib;
        }

        //When first loop run print 1
        //


            // 7 =  0, 1, 1, 2, 3, 5, 8
    }
}
