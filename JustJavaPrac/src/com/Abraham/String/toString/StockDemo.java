package com.Abraham.String.toString;

/**
    Here we can show toString method how it works, avoiding unnecessary use
 */
public class StockDemo {

    public static void main(String[] args) {
        Stock abcCompany = new Stock("ABC", 5.77);

        //using toString method to print the information
        System.out.println(abcCompany.toString());

        //Just Single line space
        System.out.println();
        /**
            Next line we are going to show that we do not need to use the toString method.
            because when we create an instance of the class, there java also implicitly calls
            an object's toString method any time you concatenate an object of the class
            with a string.
         */

        Stock jfCompany = new Stock("JFcom", 7.47);
        System.out.println("The Stock data is: \n" + jfCompany );

        //Just for empty line
        System.out.println();
        //Even we can print just the object variable using
        System.out.println(jfCompany);
    }


}
