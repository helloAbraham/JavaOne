package com.Abraham.VaragrsExample;

public class VaragrsExampl {


    //This is the method using varargs
    public void printShoppingList(String...items){
        System.out.println("SHOPPING LIST");
        for(int i=0; i<items.length; i++){
            System.out.println(i+1 + ": " + items[i]);
        }
        System.out.println();
    }
}
