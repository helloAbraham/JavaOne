package com.abraham;

public class ThrowsDemo {
    public static void main(String[] args) {
        ThrowsExm tse = new ThrowsExm();
        char ch;

        try{
            ch = tse.prompt("Enter a letter ");

        }catch(java.io.IOException exc){
            System.out.println("Here I/O exception has occurred");
            ch = 'x';
        }
    }
}
