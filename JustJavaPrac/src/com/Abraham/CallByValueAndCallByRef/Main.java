package com.Abraham.CallByValueAndCallByRef;

public class Main {

    public static void main(String[] args) {
        CallByValueExm callBV = new CallByValueExm();
        int x = 10;
        int y = 25;
        System.out.println("The Sum is " + callBV.testSum(x, y)); //This is example of CALL BY VALUE or PASSED BY VALUE

            callBV.testSum(x, y);

        /**
            This is not going to change as CallByValueExm class method, it will not return 10*25 = 250
            It will return on the method what ever has inside. it has given a = 10; b = 5 inside the method
            therefore, it would return 10 * 5 = 50. It does not matter whatever the value you put inside the parameter
            example a = 500, b= 5, answer will be same 10 * 5 = 50
            because we are giving just a copy.
         */
        System.out.println(callBV.mulValueOfTwo(x, y));


        //After that passing value We can see

        System.out.println(" X = " + x + " " + "y = " + y);  //Nothing will be change value of x , y


        System.out.println("-------------- let's example of Call By reference-------------");

        CallByReference cbr = new CallByReference();

        cbr.numberOne = 96;
        cbr.numberTwo = 69;

        System.out.println("Currently the value of \nnumberOne = " + cbr.numberOne + "\nnumberTwo = " + cbr.numberTwo );

        System.out.println("AFTER SWAPPING ans Using Call By Reference ");
        cbr.swap(cbr);
        //After swapping
        System.out.println("The value of numberOne is now " + cbr.numberOne);
        System.out.println("The value of numberTwo is now " + cbr.numberTwo);


    }
}
