package com.Abraham.UpCasting;
/**
 Example of Java Runtime Polymorphism
 In this example, we are creating two classes Bike and Splendor.
 Splendor class extends Bike class and overrides its run() method.
 We are calling the run method by the reference variable of Parent class.
 Since it refers to the subclass object and subclass method overrides the Parent class method,
 the subclass method is invoked at runtime.
 Since method invocation is determined by the JVM not compiler,
 it is known as runtime polymorphism.
 */
// Here is the example of upcasting
public class Main {

    public static void main(String[] args) {

        Bike myBiking = new Splender();
        myBiking.run();
    }
}
