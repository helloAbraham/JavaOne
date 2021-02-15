package com.Abraham.AbstractionExample;

public class Pig extends Animal{
    //Important fact since Animal is an abstract class, we must have to
    //use what ever Animal class has abstract method, here is animalSound
    public void animalSound(){
        System.out.println("The Pig says: .. Wee, Wee");
    }
}
