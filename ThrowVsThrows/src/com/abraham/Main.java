package com.abraham;

public class Main {
    public static void main(String[] args) {
        ThrowExceptionTester th = new ThrowExceptionTester();
        th.checkSmokingAge(27);
        System.out.println("End of Throw class object sung in Main method");
        System.out.println("------------------------");
        System.out.println(" ");

        ThrowsExm ths = new ThrowsExm();
        //System.out.println(throwsExm.division(15, 0)

        try{
            System.out.println(ths.division(15, 0));
        }catch(ArithmeticException exc){
            System.out.println("We should not divided by ZERO.");
        }

    }



}
