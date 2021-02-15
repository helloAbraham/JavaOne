package com.Abraham.StaticVsNonStaticExp;

import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args) {
        //Creating some dice:
        System.out.println(Dice.sidesOfDice); //This can be printed because sidesOfDice is static
        Dice myDice = new Dice();
        Dice otherDice = new Dice();

        //Rolling two 6 - sided dice:
        System.out.println();
        System.out.println("Six Sides: ");
        for(int i = 0; i<10; i++){
            System.out.println("First Die : " + myDice.roll());
            System.out.println("Second Die : " + otherDice.roll());
        }

        System.out.println();
        System.out.println("Face Value: " + myDice.getFaceValue());
        System.out.println("Face Value: " + otherDice.getFaceValue());

        //--------------
        Dice.changeNumSidesOfDice(8);
        System.out.println();
        System.out.println("Now Try Eight Sides: ");
        for (int i =0; i<10; i++){
            System.out.println("First Die: " + myDice.roll());
            System.out.println("Second Die: " + otherDice.roll());
        }
        //Retrieving face value:
        System.out.println();
        System.out.println("Face Value: " + myDice.getFaceValue());
        System.out.println("Face Value: " + otherDice.getFaceValue());

        // Good to know that things are wrong
        /**
         myDice.sidesOfDice
         myDice.changeNumSidesOfDice(8);
         Dice.roll();
         Dice.faceValue();
         */
    }
}





















