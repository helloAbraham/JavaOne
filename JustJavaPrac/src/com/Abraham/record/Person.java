package com.Abraham.record;

public record Person(String fristName, String lastName, int age) {
    //No need to manually write the constructor, getter methods, equals(), hasCode(). or toString() methods.
    //You can also add custom methods if needed
    public String fullName() {
        return fristName + " " + lastName;
    }
    //Optionally, you can define a custom constructor (but the default  one will suffice in most cases)
    public Person{
        if(age < 0) {
            throw new IllegalArgumentException("Age cannot be negative");
        }
    }
}
