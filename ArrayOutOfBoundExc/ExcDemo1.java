package com.Abraham.Exception.ArrayOutOfBoundExc;

public class ExcDemo1 {

    public static void main(String[] args) {


       ExceptionClassWithMethod excwm = new ExceptionClassWithMethod();
        //Here we can use also method inside the try 
        try{
            excwm.getException();
        }catch (ArrayIndexOutOfBoundsException exc){
            System.out.println("Array Index Out of Bounds");
        }
        System.out.println("After catch statement this line will be displayed.");

    }
}

/**
         public static void main(String[] args) {
         int[] num = new int[4];

         try{
         System.out.println("Before Exception is generated.");

         //Here generated an exception ArrayOutOfBoundsException.
         num[7] = 97;
         System.out.println("This won't be displayed.");
         }catch (ArrayIndexOutOfBoundsException exc){
         System.out.println("Array Index Out of Bounds");
         }
         System.out.println("After catch statement this line will be displayed.");

         }

 */