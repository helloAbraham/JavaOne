package com.Abraham.CellPhoneStore;

/**
 This is runnable program will test the data input and out put the resul
 using an object CellPhone
 */
import java.util.Scanner;

public class CellPhoneTestData {


    public static void main(String[] args) {

        String testMan;
        String testMod;
        double testPrice;

        //Create a Scanner object for keyboard input
        Scanner keyboard = new Scanner(System.in);



        //Get the manufacturer name
        System.out.println("Please Ener the Cell Phone Manufacturer name: ");
        testMan = keyboard.nextLine();

        System.out.println("Please Enter the Cell Phone Model name: ");
        testMod = keyboard.nextLine();

        System.out.println("Please Ener the Cell Phone Price : ");
        testPrice = keyboard.nextDouble();

        CellPhones myPhone = new CellPhones(testMan, testMod, testPrice);

        System.out.println();

        System.out.println("Here is the data you've entered so far: ");
        System.out.println("Manufacturer: " + myPhone.getManufacture());
        System.out.println("Model : " + myPhone.getModel());
        System.out.println("Retail Price $ " + myPhone.getRetailPrice());


        keyboard.close();

    }



}

