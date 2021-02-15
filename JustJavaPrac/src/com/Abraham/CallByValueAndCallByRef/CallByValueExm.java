package com.Abraham.CallByValueAndCallByRef;

public class CallByValueExm {
    public int testSum(int num, int numTwo){
        int c = num + numTwo;
        return c;
    }

    public int mulValueOfTwo(int a, int b){
        a =10;
        b = 5;
        int c = a * b;
        return c;
    }
}