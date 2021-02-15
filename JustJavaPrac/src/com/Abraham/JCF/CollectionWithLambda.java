package com.Abraham.JCF;

import java.util.ArrayList;

/**
    This simple program demonstrate Iterable forEach()
 */
public class CollectionWithLambda {
    public static void main(String[] args) {
        String[] names = {"Abraham", "Parker", "Aiden", "Anny", "Tommy", "Jackie", "Achieve"};

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
