package com.Abraham.VaragrsExample;

/**
    This is the fantastic method which can have three types of input in the method
    parameter such as String variables one or more,
    Direct String like "Eggs", "bread",
    Also amazing thing is Array of String.
 */

public class Main {

    public static void main(String[] args) {
        VaragrsExampl varexm = new VaragrsExampl();

        String item1 = "Apples";
        String item2 = "Bananas";
        String item3 = "Oranges";
        String item4 = "Pears";

        String[] marketing = {"Bread", "Milk", "Eggs", "Chess", "Honey", "Water"};
        //taking String variables in the arguments
        varexm.printShoppingList(item1,item2, item3, item4);
        //Direct writing the String
        varexm.printShoppingList("Bread", "Milk", "Eggs", "Chess", "Honey");

        //Now lets use the String array args
        varexm.printShoppingList(marketing);
    }
}
