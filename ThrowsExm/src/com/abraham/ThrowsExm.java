package com.abraham;

public class ThrowsExm {
    //Creating a exception method
    public char prompt(String str) throws java.io.IOException{
        System.out.println(str + ": ");
        return (char) System.in.read();
    }

}
