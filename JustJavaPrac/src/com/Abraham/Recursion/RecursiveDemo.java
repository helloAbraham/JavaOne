package com.Abraham.Recursion;

public class RecursiveDemo{
    public static void main(String[] args) {
       RecursiveExOne rsOne = new RecursiveExOne();
        //We don't care anymore the method is static or not, we can use the method
         rsOne.message(7);


       // rsOne.messageNonStop();

        //just for 1 line space
        System.out.println(" ");

        //If the RecursiveExOne class has method static then we can use  "Class name and . method name"
       RecursiveExOne.message(5);



    }
}
