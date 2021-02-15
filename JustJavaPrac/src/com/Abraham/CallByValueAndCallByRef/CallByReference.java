package com.Abraham.CallByValueAndCallByRef;

public class CallByReference {

    int numberOne;
    int numberTwo;

    //This is called by Reference
    public void swap(CallByReference cr){
        int temp;
        temp = cr.numberOne; // temp = 96
        cr.numberOne = cr.numberTwo;  //cr.numberOne = 69
        cr.numberTwo = temp;        //cr.numberTwo = 96

    }
}
