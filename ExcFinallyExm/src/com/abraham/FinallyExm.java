package com.abraham;

public class FinallyExm {

    public void generateExec(int num){
        int element;

        int[] number = new int[2];
        System.out.println("Receive " + num);
        try{
            switch(num){
                case 0:
                    element = 10/num;  //here generate divided by ZERO error
                    break;
                case 1:
                    number[4] = 7; //generate array out of bounds error
                    break;
                case 2:
                    return; //return from try block
            }
        }catch(ArithmeticException exc){
            //Let's catch the exception here
            System.out.println("We can not divided by ZERO.");
        }catch (ArrayIndexOutOfBoundsException ex){
            System.out.println("NO matching element found");
        } finally {
            System.out.println(" No more try!!!");
        }
    }
}
