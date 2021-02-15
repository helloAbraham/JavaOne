package com.Abraham.overloadingoverriding;

/**
    Example of overloading methods
 */
public class Main {
    public static void main(String[] args) {
    Dog myDog = new Dog();
    myDog.berk();

    myDog.berk(5);

    //Example of Overriding
        //Let''s first create an object Cat
        Cat myCat = new Cat();
        myCat.playEveryday("");

        myDog.playEveryday("");





    }
}
