package com.Abraham.JCF;

import java.util.ArrayList;

/**
    This simple program demonstrate Iterable forEach()
    using lambda
 */
public class CollectionWithLambda {
    public static void main(String[] args) {

        //This is an array which type is String
        String[] names = {"Abraham", "Parker", "Aiden", "Anny", "Tommy", "Jackie", "Achieve"};

        //Now we are going to add each element of the array in the ArrayList, then using enhance for loop to add them
        //to the list, here nameList
        ArrayList<String> nameList = new ArrayList<>();
        for(String name: names){
            nameList.add(name);
        }

        System.out.println("It is printing word and each word length ");
        nameList.forEach(
                x ->
                {

                    System.out.printf( "%s %d\n", x, x.length() );
                });


    }
}
