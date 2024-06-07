package com.Abraham.serialization;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class SerializationExample {

    public static void main(String[] args) {
        // Create a Person object
        Person person = new Person("John", 41);

        try {
            // Serialize the Person object
            FileOutputStream fileOut = new FileOutputStream("person.ser");
            ObjectOutputStream out = new ObjectOutputStream(fileOut);
            out.writeObject(person);
            out.close();
            fileOut.close();
            System.out.println("Person object has been serialized.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
