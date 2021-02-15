package com.Abraham.OverloadingMethodEx;
/**
 This program demonstrate overloading method
 As we know overloading method mean same method name but parameter different
 */
public class OverloadingMethodEx {

        static int plusMethod(int x, int y)
        {
            return x + y;
        }


        static double plusMethod(double x, double y)
        {
            return x + y;
        }


        public static void main(String[] args) {

            int num = plusMethod(8, 9);
            double number = plusMethod(4.3, 7.9);

            System.out.println("First method: " + num);
            System.out.println("Second input same : " + number );

        }

    }

