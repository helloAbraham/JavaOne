package com.Abraham.CollectorsExample;

/**
 a simple Java project demonstrating the use of
 java.util.stream.Collectors with Java 8 Streams.
 We will create a sample project that processes a list of Person objects,
 filters them based on certain criteria,
 and collects the results using various Collectors.
 */
public class Person {
    private String name;
    private int age;
    private String city;

    public Person() {
    }

    public Person(String name, int age, String city) {
        this.name = name;
        this.age = age;
        this.city = city;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getCity() {
        return city;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", city='" + city + '\'' +
                '}';
    }
}
