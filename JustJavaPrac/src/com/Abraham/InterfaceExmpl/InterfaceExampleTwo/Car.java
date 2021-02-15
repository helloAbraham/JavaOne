package com.Abraham.InterfaceExmpl.InterfaceExampleTwo;

//This is a non-maintainable car
public class Car {

    //These are the default wheels
    private DefaultWheels carWheel;

    Car(DefaultWheels wheels){
        carWheel = wheels;
    }

    void roll(){
        carWheel.roll();
    }
    /**
    at this point, yor car is hard coded to use just the default hweels.
     putting other wheels on it will not work (obviously).
     */
}
















