package com.Abraham.NestedIf;

/**
     This simple program shows how to use Nested if
 */
import java.util.Scanner;
public class NestedIfExm {

    public static void main(String[] args) {
        int age;
        int money;

        Scanner keyboard = new Scanner(System.in);
        System.out.println("Please Enter Your Age: ");
        int inputAge = keyboard.nextInt();

        System.out.println("Enter the amount of money available: ");
        int moneyinpocket = keyboard.nextInt();

        //now let's use nested if
        if(inputAge > 24){
            if(moneyinpocket >10000){
                System.out.println("Congratulation! You may get marry.");
            }else {
                System.out.println("Sorry! You do not have enough money.");
            }
        }else{
            System.out.println("Sorry! Though You have money. You are too young to get marry!");
        }
    }
}
