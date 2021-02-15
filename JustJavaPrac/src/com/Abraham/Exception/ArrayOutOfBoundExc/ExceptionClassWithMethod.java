package com.Abraham.Exception.ArrayOutOfBoundExc;

public class ExceptionClassWithMethod {
    public void getException(){
        int[] num = new int[4];

        System.out.println("Before Exception is generated.");
            //Here generated an exception ArrayOutOfBoundsException.
            num[7] = 97;
            System.out.println("This won't be displayed.");
       }

}
