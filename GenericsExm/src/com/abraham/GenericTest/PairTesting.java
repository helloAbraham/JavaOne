package com.abraham.GenericTest;

public class PairTesting {

    public static void main(String[] args) {

        //Creating an Integer to hold an ID number;
       Integer idNumber = new Integer(477);

        String name = "David, Wagon";

        Getpair<Integer, String> myPair = new Getpair<>(idNumber, name);

        //Let's display the pair of ITEMS
        System.out.println("ID Number " + myPair.getFirst());
        System.out.println("Name " + myPair.getSecond());

    }
}
