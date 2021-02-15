package com.Abraham.AggregationExample;

public class Employee{

    int id;
    String name;
    Address address; // Address class using like a variable

    public Employee(int id, String name, Address address){
        this.id = id;
        this.name = name;
        this.address = address;
    }

    public void display(){
        System.out.println(id + " " + name);
        System.out.println(address.Street+ " " + address.City + " " + address.State + " " + address.ZipCode + " "+address.Country);
    }

    public static void main(String[] args) {
        Address address1 = new Address("8345 Broadway", "Elmhurst", "NY", 11373, "U.S.");
        Address address2 = new Address("4242 Judge St.", "Elmhurst", "NY", 11372, "U.S");

        Employee Bob = new Employee(101, "Mr. Bob", address2);
        Employee Ab = new Employee(107, "Mr. Abraham", address1);

        Bob.display();
        System.out.println(" ");
        Ab.display();
    }

}
