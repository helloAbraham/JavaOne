package com.Abraham.overloadingoverriding;
/**
 Example of overloading methods
 */
public class Dog {

    public void berk()
    {
        System.out.println("woof");
    }

    public void berk(int num)
    {
        for(int i=0; i<num; i++)
        System.out.println("woof ");
    }


    //This is going to be Overriding
    public void playEveryday(String s)
    {
        System.out.println("My Dog play every day ");
    }



}

