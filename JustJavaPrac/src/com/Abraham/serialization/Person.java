package com.Abraham.serialization;

import java.io.Serializable;

public class Person implements Serializable {
    private String name;
    private int age;

    public Person(){
    }
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    /**
     Once a class implements Serializable, objects of that class can be serialized
     using Java's serialization mechanisms, typically using ObjectOutputStream to write the object to a stream,
     and ObjectInputStream to read it back. Here's a basic example:
     */
}
