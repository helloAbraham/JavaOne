package com.Abraham.Array.arrayUsingCollection;

public class RunMain {
    public static void main(String[] args) {
        Integer[] myArray = {1,4,2,7,3,5};
        Integer[] myArrayOne = {22,34,29,77,99,89,45};

        UsingCollectionFindLarge usingCF = new UsingCollectionFindLarge();
        System.out.println("The Largest Element in the myArray is " + usingCF.getLargeElm(myArray, 6));
        System.out.println("The Largest Element in the myArrayOne is "+ usingCF.getLargeElm(myArrayOne, 7));
    }
}
