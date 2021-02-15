
package com.Abraham.FindThePrimeNumber;
import java.util.Scanner;
public class FindPrimeNumber {

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in); //Creating keyboard object from Scanner class
        int i =0;
        int number =0;
        String primeNumbers = ""; //Empty String for using

        //Giving option to user input number
        System.out.println("Please Enter the Value of number ");
        int input = keyboard.nextInt();
        for(i =1; i <= input; i++)
        {
            int counter = 0;
            for(number = i; number>=1; number--)
            {
                if(i % number == 0)
                {
                    counter += 1;
                }
            }
            if(counter == 2)
            {
                //let's append the prime number to the String we declare before
                primeNumbers = primeNumbers + i + " ";
            }
        }
        System.out.println("Prime numbers from 1 to number are : ");
        System.out.println(primeNumbers);
    }

}
