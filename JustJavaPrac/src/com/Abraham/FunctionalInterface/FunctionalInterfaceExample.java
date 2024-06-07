package com.Abraham.FunctionalInterface;

public class FunctionalInterfaceExample {
    //method to perform subtraction
    public static int subtract(int a, int b) {
        return a - b;
    }

    public static void main(String[] args) {
        //Using lambda expression to implement the functional interface
        Calculator addition = (a, b) -> a + b;
        System.out.println("Here we can see addition " + addition.operate(7,100));

        //Using method reference to implement the functional interface
        Calculator subtraction = FunctionalInterfaceExample::subtract;
        System.out.println("Here we can see Subtraction: " + subtraction.operate(100, 7));
    }
}
