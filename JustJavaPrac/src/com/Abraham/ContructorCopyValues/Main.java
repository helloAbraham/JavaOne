package com.Abraham.ContructorCopyValues;


public class Main {

    public static void main(String[] args) {

        Student stuOne = new Student(101, "Abraham", "7184504150");
        Student stuTwo = new Student(stuOne);

        stuOne.display();
        stuTwo.display();
    }
}
//01738349338