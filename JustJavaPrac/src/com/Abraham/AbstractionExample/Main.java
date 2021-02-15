package com.Abraham.AbstractionExample;

public class Main {
    public static void main(String[] args) {
        Dog myDog = new Dog(); //We can create a Dog object
        myDog.animalSound();
        //Calling regular method
        myDog.sleep();

        //now let's create an object of Pig class
        Pig littlePig = new Pig();
        littlePig.animalSound();
        littlePig.sleep();
    }
}
