package com.Abraham.AbstractionExample;

abstract class Animal {
    //Abstract method which does not contain body
    abstract void animalSound();

    //regular method
    void sleep(){
        System.out.println("Zzzz,..");
    }

}
