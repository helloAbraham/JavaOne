package com.Abraham.hashmap;

import java.util.*;

public class HashMapPrinting {

        public static void main(String[] args) {
            Map<String, Integer> myMap = new HashMap<>();
            //now let's insert few to the myMap
            myMap.put("Abraham", 1982);
            myMap.put("Parker", 1982);
            myMap.put("Rahman", 1975);
            myMap.put("Mike", 1984);
            // myMap.put("Abraham", 1982);  //Key has to unique for example
            //  myMap.put("Farhad", 1982);   // Values can be same.

            //We want to print now:
            //Using Enhance for loop, Just key
            for(Object obj: myMap.keySet()){
                System.out.println(obj);
            }
            //You may have Question, why we use Object?
            //Before we use String or Integer, Double  just what type it is
            //The simple answer is- Map we create an object myMap
            //It is generic Object class, you can manipulate
            //Also using Object we can play lots of other functionalities

            System.out.println("---------------------");
            //Using Enhance for loop, Just Value
            for(Object object: myMap.values()){
                System.out.println(object);
            }
            System.out.println("--------------------------");


            //Using Enhance for loop, KEY + VALUES which will print out
            //For example Abraham=1982
            for(Object myCreatedObj: myMap.entrySet()){
                System.out.println(myCreatedObj);
            }

            System.out.println("--------------------------");


            //Very basic way

            System.out.println(myMap.entrySet());

            System.out.println("+++++");
            System.out.println(myMap.keySet() + " " + myMap.values());

            //This is one way
            System.out.println(Arrays.asList(myMap));
            System.out.println("--------------------------");

            //Another way is that
            System.out.println(Collections.singletonList(myMap));

            Scanner keyboard = new Scanner(System.in);
            System.out.println("Please Enter your name: ");
            String getName = keyboard.nextLine();

            //you have to type first your name
            //next line type your age in number
            //int age = keyboard.nextInt();

            try {
                int yourAge = Integer.parseInt(keyboard.nextLine());
                System.out.println("Hi " + getName + " You are " + yourAge + " old");
            }catch (NumberFormatException exc){
                System.out.println("You didn't put correct format ");
            }
        }
    }

