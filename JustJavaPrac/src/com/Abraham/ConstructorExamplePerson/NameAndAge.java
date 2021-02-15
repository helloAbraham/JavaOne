package com.Abraham.ConstructorExamplePerson;

public class NameAndAge {

    public static void main(String[] args) {
        Person person1 = new Person();
        Person person2 = new Person("Abraham");
        Person person3 = new Person("Abraham", 37);

        //We can see the reference id of Person class @4f023edb like that Person class if print
        //System.out.println("As created " + person2);
        //as printed :---->   As created com.Abraham.ConstructorExamplePerson.Person@4f023edb


        //We can print out to see ..
        String personWithName = person2.getName();

        System.out.println("Person2 has just name " + personWithName);

        System.out.println("Person Name and Age: " + person3.getName() + ", " + person3.getAge());

        //Also we can add more name on the person3 object and print out
        Person personAdd = new Person("John", 32); 

    }
}
