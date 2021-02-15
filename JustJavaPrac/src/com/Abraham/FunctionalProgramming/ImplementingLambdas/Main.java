package com.Abraham.FunctionalProgramming.ImplementingLambdas;

import com.Abraham.FunctionalProgramming.FunctionalInterface.GreetingMessage;

public class Main {
    public static void main(String[] args) {
        GreetingMessage gm2 = (String name) -> {
            System.out.println("Hello " + name);
        };
        gm2.greet("James");

        MessagePrinter mp = () ->{
            System.out.println("The message from MessagePrinter ");
        };

        mp.printMessage();
    }

}
