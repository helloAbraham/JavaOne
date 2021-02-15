package com.Abraham.LeapYear;

import javax.swing.*;
import java.util.Scanner;

public class LeapYearExample {
    public static void main(String[] args) {
        int year; //Declare a variable to hold the value

        Scanner keyboard = new Scanner(System.in);
        System.out.println("Enter any Year 'YYYY' :");
        year = keyboard.nextInt();   //Converted the user's input value as integer




        if(((year % 4 ==0) && (year % 100 !=0)) || (year % 400==0)){
            System.out.println("IT IS LEAP YEAR");
        }
        else{
            System.out.println("COMMON YEAR");

        }
    }
}
