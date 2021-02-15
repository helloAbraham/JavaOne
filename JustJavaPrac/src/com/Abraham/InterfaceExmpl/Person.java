package com.Abraham.InterfaceExmpl;

public class Person implements ShowMessage{
    private String name;

    //Constructor

    public Person(String name) {
        this.name = name;
    }


    @Override
    public void display() {
        System.out.println("Your Name is " + name);
    }
}
