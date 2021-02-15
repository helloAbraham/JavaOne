package com.Abraham.Exception.ArithmaticExcep;

/**
     This is the simple program will show how exception work
     even though some are error others will run.
    Important fact is sometimes as a developer you will have lots of data
    or others input types, you don't want to crash the whole program. let's say you want to
    analytics 500 hundreds data, if there is one or two mistakes and the program runs still you
    can conclude.
 */

public class ExceptionDemo {
    public static void main(String[] args) {
        int numerator[] = {3, 9, 81, 6561, 81, 9, 3};
        int denominator[] = {1, 3, 9, 0, 9, 3, 1};

        for (int i = 0; i < numerator.length; i++) {
            try {
                System.out.println(numerator[i] + " / " + denominator[i] + " is "
                                    + numerator[i]/denominator[i]);
            } catch (ArithmeticException ex) {
                System.out.println("We can not divided by ZERO");
            } catch (ArrayIndexOutOfBoundsException exc) {
                System.out.println("Elements in the array can't be reached");
            }
        }
    }
}
