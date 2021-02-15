package com.Abraham.TestBoard.TestBoradOne;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        myContact mc = new myContact("Akbor", "45342232");
        myContact mc1 = new myContact();



        ArrayList<myContact> myPhoneBook = new ArrayList<>();
        myPhoneBook.add(new myContact("Abraham", "7184504150"));
        myPhoneBook.add(new myContact("Moshiur", "9173456732"));
        myPhoneBook.add(new myContact("Michael ", "2321313123"));

       // System.out.println(myPhoneBook);

        for(int i =0; i<myPhoneBook.size(); i++){
            System.out.println(myPhoneBook.get(i));
        }


        ArrayList<String> grocery = new ArrayList<>();
        grocery.add("Apples");
        grocery.add("banana");
        grocery.add("Milk");
        grocery.add("Condoms");
        System.out.println(grocery);

        grocery.remove("Condoms");
        System.out.println(grocery);

    }

}
