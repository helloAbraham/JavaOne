package com.Abraham.ternary;

public class TernaryAnother {
    public static void main(String[] args) {
        int a = 90;
        int b = 100;

        //Using ternary operator to find the maximum of two numbers
        int max = (a > b) ? a : b;
        System.out.println("The maximum of " + a + " and " + b + " is: " + max);
    }
}
