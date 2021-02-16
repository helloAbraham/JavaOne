package com.abraham;

import java.sql.Wrapper;
import java.util.ArrayList;

public class UnsafeArrayList {
    public static void main(String[] args) {
        //Create an ArrayList object.
        ArrayList list = new ArrayList();

        list.add("Let's fun with Java!");
        list.add(new Double(3.9));
        list.add(4.7);
        list.add("Hello");

        System.out.println(list.get(2));

        double num = (Double)list.get(1);

        System.out.println(num);

        //The notation ArrayList<String> is pronounced as "ArrayList Of String"
    }

}
