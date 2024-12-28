package com.Abraham.record;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        //creating Person records
        Person p1 = new Person("John", "Doe", 32);
        Person p2 = new Person("Abraham", "Parker", 41);

        //Accessing record components (automatically generated getter methods)
        System.out.println("First Person: " + p1.fristName() + " " + p1.lastName() + " Age: " + p1.age() );
        System.out.println("First Person: " + p2.fristName() + " " + p2.lastName() + " Age: " + p2.age() );
        //Using the custom method defined in the Person record
        System.out.println("Full name of the first person " + p1.fullName());

        //Showcasing the automatically generated toString() method
        System.out.println("First Person (toString): " + p1);

        //Demonstrating equals() method and hashCode()
        System.out.println("Are the two persons equal? " + p1.equals(p2));

        //Creating a list of persons and demonstrating iteration
        List<Person> myPeople = List.of(p1, p2);
        myPeople.forEach(person -> System.out.println(person.fullName() + " - Age: " + person.age()));
        // Immutable nature (cannot modify)
        // p1.firstName = "New Name"; // This will result in a compilation error because fields are final.
    }
}
