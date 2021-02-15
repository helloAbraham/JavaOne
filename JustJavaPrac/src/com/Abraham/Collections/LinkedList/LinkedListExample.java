package com.Abraham.Collections.LinkedList;

import java.util.LinkedList;

public class LinkedListExample {

    public static void main(String[] args) {
        LinkedList<String> myList = new LinkedList();
        //Let's add some elements to myList
        myList.add("Abraham");
        myList.add("Aiden");
        myList.add("Arian");
        //let's say I want to add Jenifer after Abraham
        //This is the advantage using LinkedList, so easy can be added

        myList.add(1, "Jenifer");
        //Now let's remove Arian from the myList
        try {
            if(myList.contains("Arian"))
              myList.remove("Arina");
        }catch (Exception e){
            e.printStackTrace();
        }
        System.out.println(myList);
    }
}
