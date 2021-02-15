package com.Abraham.ThreadAvoidDeadLock;

public class AvoidThreadDeadLock {

    //imagine you are making cake you need spoon and bowl to make dough
    public static Object spoon = new Object();
    public static Object bowl = new Object();

    public static void main(String args[]) {

        Thread cook1 = new Thread(() -> {
            synchronized (spoon) {
                System.out.println("Cook1: Holding the spoon...");
                System.out.println("Cook1: Waiting for the bowl...");

                synchronized (bowl) {
                    System.out.println("Cook1: Holding the spoon and the bowl.");
                }
            }
        });

        /**
         //Wrong way to do that, if we do this way then it would be deadlock
         Thread cook2 = new Thread(() -> {
         synchronized (bowl) {
         System.out.println("Cook2: Holding the bowl...");
         System.out.println("Cook2: Waiting for the spoon...");

         synchronized (spoon) {
         System.out.println("Cook1: Holding the spoon and the bowl.");
         }
         }
         });
         */



        //This is the correct way to do that
        Thread cook2 = new Thread(() -> {
            synchronized (spoon) {
                System.out.println("Cook2: Holding the bowl...");
                System.out.println("Cook2: Waiting for the spoon...");

                synchronized (bowl) {
                    System.out.println("Cook1: Holding the spoon and the bowl.");
                }
            }
        });

        cook1.start();
        cook2.start();

    }
}
