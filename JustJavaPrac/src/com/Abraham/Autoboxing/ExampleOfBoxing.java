package com.Abraham.Autoboxing;

public class ExampleOfBoxing {
    public static void main(String[] args) {
        int a = 577;
        Integer a2 = new Integer(a); //here Boxing

        Integer a3 = 5; //Boxing

        System.out.println(a2 + " " + a3);

        //Also example
        Integer i=new Integer(50);
        int number = i;

        System.out.println(number);
    }
}
