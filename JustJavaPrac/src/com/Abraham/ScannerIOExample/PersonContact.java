package com.Abraham.ScannerIOExample;


public class PersonContact {
    private String name;
    private int age;
    private long phoneNumber;


    public PersonContact(String name, int age, long phoneNumber) {
        this.name = name;
        this.age = age;
        this.phoneNumber = phoneNumber;
        System.out.println("Person Contact Created" + "\nName: " + name + "\n age: " + age + "\nPhone: " + phoneNumber);
    }

    //If we do each input getter and setter then it may be difference way input

    /**
     public class PersonContact {
     private String name;
     private int age;
     private long phoneNumber;

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

     public long getPhoneNumber() {
     return phoneNumber;
     }

     public void setPhoneNumber(long phoneNumber) {
     this.phoneNumber = phoneNumber;
     }
     */
}
