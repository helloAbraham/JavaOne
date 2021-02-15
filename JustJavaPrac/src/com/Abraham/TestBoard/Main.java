package com.Abraham.TestBoard;

import java.util.ArrayList;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Pen myPen = new Pen();

        ArrayList<Pen> myPenList = new ArrayList<>();
        myPenList.add(new Pen("Reblast", "Gel ", 1.99));
        myPenList.add(new Pen("Reblast", "BallPoint ", .99));

        //System.out.println(" " + myPenList.toString());
        for(int i=0; i<myPenList.size(); i++){

        }
        System.out.println(myPenList.toString());


        String original;
        String reverse = "";
        Scanner keyboard = new Scanner(System.in);

        System.out.println("Enter");
        original = keyboard.nextLine();
        int length = original.length();

        for(int i = length -1; i>=0; i--)
            reverse = reverse + original.charAt(i);
            if(original.equals(reverse)) {
                System.out.println("True");
            }else {
                System.out.println("False");
            }
    }
}
