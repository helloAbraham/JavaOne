package com.Abraham.InterfaceExmpl.InterfaceExampleTwo;
//This is the car maintainable class

public class MaintainableCar {
    Wheels wheels;

    MaintainableCar(){
    }
    MaintainableCar(Wheels wheels){
        this.wheels = wheels;
    }
    void roll(){
        wheels.roll();
    }

    void changeWheels(Wheels newWheels){
        this.wheels = newWheels;
    }
}
