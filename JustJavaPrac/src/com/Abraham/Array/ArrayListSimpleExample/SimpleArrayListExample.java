package com.Abraham.Array.ArrayListSimpleExample;
/**
    This simple program will not only print the array of string element
    also each element length (how many character). For examole Abraham it will say Abraham 7
    This program here we use lambda expression to figure it out the each elements length.
 */

import java.util.ArrayList;

public class SimpleArrayListExample {
    public static void main(String[] args) {
        //Array of names
        String[] names = {"Abraham", "Parker", "Jenifer", "Aiden", "Arian"};

        //Let's create nameList and add names on to it.

        ArrayList<String> nameList = new ArrayList<>();
        for(String name: names){
            nameList.add(name);
        }


        // Now forEach with lambda expression to print each element length, Abraham 7
        nameList.forEach(
                x -> {
                    System.out.printf("%s %d\n", x, x.length());

                });
    }
}
