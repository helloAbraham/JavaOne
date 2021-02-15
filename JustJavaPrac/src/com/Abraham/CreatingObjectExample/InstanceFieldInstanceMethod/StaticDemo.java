package com.Abraham.CreatingObjectExample.InstanceFieldInstanceMethod;
//This program demonstrate the Countable class.
//How many time instance will be created

public class StaticDemo {
    public static void main(String[] args) {
        //create a variable for count
        int objectCount;
        //Now let create 4 instances of the countable class

        Countable obj1 = new Countable();
        Countable obj2 = new Countable();
        Countable obj3 = new Countable();
        Countable obj4 = new Countable();

        //Get the number of instances from
        //the class's static field

        objectCount = obj1.getInstanceCount();   //Here is the note it does not matter which obj1 or obj2 or obj3 or
                                                //obj4 assign objectCount. Result will be same
        System.out.println(objectCount + " instances of the class were created.");


    }
}
