package com.Abraham.ConstructorExamplePerson;

public class Person {

    //Declare the variable as Private because I'm going to use constructor
    // and using class object to use
        private String name;
        private int age;


    public Person()
    {

    }
    public Person(String name) {
        this.name = name;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public int getAge()
    {
        return age;
    }

    public void setAge(int age)
    {
        this.age = age;
    }

    /*
       Constructor
       @param name The person name
       @param age The person age
    */
    public Person(String name, int age)
    {
        this.name = name;
        this.age = age;
    }

}
