package com.Abraham.Exception.ThrowVSThrows;

public class Main {

    public static void main(String[] args) {
        ThrowExceptionTester th = new ThrowExceptionTester();
        th.checkSmokingAge(22);

        System.out.println("End of Throw class object using in Main method.");

        System.out.println("-------------------");
        System.out.println();

        ThrowsExample throwsExample = new ThrowsExample();

        //System.out.println(throwsExample.division(15,0));
        try{
            System.out.println(throwsExample.division(15, 0));
        }catch (ArithmeticException e){
            System.out.println("We shouldn't divide number by zero. ");
        }

    }

}
