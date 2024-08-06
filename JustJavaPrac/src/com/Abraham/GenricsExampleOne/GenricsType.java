package com.Abraham.GenricsExampleOne;

public class GenricsType <T>{

    private T textt;

    public T getTextt() {
        return textt;
    }

    public void setTextt(T textt) {
        this.textt = textt;
    }

    public static void main(String[] args) {
        GenricsType <String> genExample = new GenricsType<>();
            genExample.setTextt("Abraham");  //This will be valid
           // genExample.setTextt(123); // Not Valid

        GenricsType nextTypeExample = new GenricsType();
            nextTypeExample.setTextt("Parker"); // This is valid
            nextTypeExample.setTextt(10); //This is valid and autoboxing.

    }
}

/*

    E – Element (Often used extensively by the Java Collections Framework, for example ArrayList, Set etc.)
    K – Key ( for example it is used in Map)
    N – Number
    T – Type
    V – Value (It is used in Map)
    S, U, V etc. – 2nd, 3rd, 4th types


 */