package com.Abraham.FunctionalProgramming.FunctionalInterface;

public class Main {
    public static void main(String[] args) {

       //Example of messy way functional interface
        GreetingMessage gm = new GreetingMessage() {
            @Override
            public void greet(String name) {
                System.out.println("Hello " + name);
            }
        };
        gm.greet("Mr. James Gosling");
    }
}
