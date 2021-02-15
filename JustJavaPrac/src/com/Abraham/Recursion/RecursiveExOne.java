package com.Abraham.Recursion;

/*
    This class has Recursive method, message,
    which displays a message n times
 */
public class RecursiveExOne {
    //This is the method runs forever

    public static void messageNonStop()
    {
        System.out.println("This is recursive method non Stop. ");
        messageNonStop();
    }

    //This is the method will send you message
    //user put n number times
    public  static void message(int n)
    {
        if(n > 0)
        {
            System.out.println("This is recursive method. ");
            message(n -1);
        }
    }

}
