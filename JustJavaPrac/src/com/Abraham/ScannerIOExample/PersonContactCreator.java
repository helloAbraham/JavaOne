package com.Abraham.ScannerIOExample;

import java.util.Scanner;

public class PersonContactCreator {

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        System.out.println("Enter the person name, age, and phone: ");
        //import here Scanner know the three input by the sentence space
        //for instance Abraham 37 7184504150
        String name = keyboard.next();
        int age = keyboard.nextInt();
        long phoneNum = keyboard.nextLong();


        PersonContact personNew = new PersonContact(name, age, phoneNum);

    }

}
