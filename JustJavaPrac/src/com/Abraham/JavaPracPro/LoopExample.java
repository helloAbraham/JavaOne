package com.Abraham.JavaPracPro;

public class LoopExample {


    public static void main(String[] args) {

        String[] months= {"January", "February", "Merch", "April", "May", "June",
                           "July", "August", "September", "October", "November", "December"};


           // Regular for loop
        for (int i = 0; i <months.length ; i++) {
            System.out.println(months[i]);

        }

        System.out.println();

        //for each loop Enhance for loop example

        for(String month: months){
            System.out.print(month + ", ");
        }

        System.out.println();
        //Also newer way we don't have to be specific primitive data type or variable such as string, int ..

        for (var month: months){
            System.out.println(month);
        }

        //just for 1 line space
        System.out.println();
        //let's try also another way to do that
       // while loop
        var whileCounter = 0;
        while(whileCounter < months.length){
            System.out.println(months[whileCounter]);
            whileCounter++;
        }

        //Still we can do -- yes do while
        //lets do that
        //before check out we have to make 1 line space so that it can be clear
        System.out.println();
         var doCounter=0;
        do{
            System.out.print(months[doCounter] + ", ");
            doCounter++;
        } while(doCounter<months.length);


    }


}
