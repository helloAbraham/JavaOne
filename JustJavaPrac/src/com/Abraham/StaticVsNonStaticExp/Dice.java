package com.Abraham.StaticVsNonStaticExp;

import java.util.Random;

public class Dice {
    static int sidesOfDice = 6;
    int faceValue = 0;

    public int roll(){
        Random rand = new Random();
        this.faceValue = rand.nextInt(sidesOfDice) + 1;
        return this.faceValue;
    }

    public static void changeNumSidesOfDice(int newNumSides){
        Dice.sidesOfDice = newNumSides;
    }
    public int getFaceValue(){
        return this.faceValue;
    }


}

















