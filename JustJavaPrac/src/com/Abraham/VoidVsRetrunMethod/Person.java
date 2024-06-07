package com.Abraham.VoidVsRetrunMethod;

public class Person {
    private String firstName;
    private String lastName;
    private int age;


    public Person(String firstName, String lastName, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    //Example of returning method
     public String toString()
     {
        return "Person: " + firstName + ", " + lastName + ", and Age " + age;
    }

    //Example of void method
    public void printPersonInfo()
    {
        System.out.println(this.toString());
    }



}
