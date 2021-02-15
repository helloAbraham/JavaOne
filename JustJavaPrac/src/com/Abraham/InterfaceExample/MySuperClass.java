package com.Abraham.InterfaceExample;


interface MyInterface {
    void myNameIs() throws NullPointerException; //Just declare a method heading not body

    void twoMethod();
}

public class MySuperClass {
    // SuperClass class doesn't implements MyInterface interface
    public void myNameIs() {
        System.out.println("Inside SuperClass myNameIs() " + "Abraham parker");
    }

    public void twoMethod(){
       System.out.println("It is what it is");
    }

}
