package com.Abraham.ContructorCopyValues;

/**
    There are no copy constructor in java. However,
    we can copy the values form one object to another
    like copy constructor in C++

    There are many ways to copy the values of one object into another in java.
    They are:
    * By Constructor
    * By assigning the values of one object into another.
    * By Clone() method of Object class.
 */

public class Student {
    private int id;
    private String name;
    private String phoneNumber;


    public Student(int id, String name, String phoneNumber) {
        this.id = id;
        this.name = name;
        this.phoneNumber = phoneNumber;
    }
    //This is different constructor like copy the object

    public Student(Student stu){
        id = stu.id;
        name = stu.name;
        phoneNumber = stu.phoneNumber;
    }

    public void display(){
        System.out.println(id + " " + name + " " + phoneNumber);
    }

}
