package com.Abraham.GenricsExampleTwo;
import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class GenricsExampleTwo {

        public static void main (String[] args) {

            //example without Generic
            List names = new ArrayList();
            names.add("Kelly");
            String name = (String) names.get(0);
            System.out.println("First Name: " + name);

            //example using Generic
            List<String> names2 = new ArrayList();
            names2.add("kelly");
            String name2 = names2.get(0);
            System.out.println("First Name: " + name2);

            //Now let's see the problem using Generic below:
            //	names2.add(7);   //Here shows compiler error because it wants only String not int

        }


}
