package com.Abraham.OddOccurencyInArray;

public class Main {

    public static void main(String[] args) {
        SetExample elementCheck = new SetExample();
        int[] myArray = {9, 3, 9, 3, 9, 7, 9};

        System.out.println(" " + elementCheck.solution(myArray));

        String[] name = {"Abraham", "Parker", "Abraham", "Parker", "John", "Tommy", "John"};
        SetExampleTwo exampleTwo = new SetExampleTwo();
        System.out.println(" " + exampleTwo.solutionString(name));
    }
}
