package com.Abraham.ForLoops;

public class ForLoops {
    public static void main(String[] args) {

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++)
                System.out.println(i + " " +j);
            System.out.println(); //just for empty line
        }

        // -------------

        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= i; j++)
                System.out.print("*");
            System.out.println();
        }

        // ----------------------
        for (int i = 1; i <= 10; i++) {
            for (int j = 1; j <=10; j++) {
                System.out.print("[" + (i * j) + "]" + " ");
            }
            System.out.println();
        }

    }
}
