package com.Abraham.InterfaceExmpl.InterfaceExampleTwo;

public class InterfaceExampleTwo {
    public static void main(String[] args) {
        //Creating hard coded wheels
        DefaultWheels hardCodedWheels = new DefaultWheels();
        //Injecting hard coded wheels
        Car nonMaintainableCar = new Car(hardCodedWheels);
        nonMaintainableCar.roll();
        //Rolling


        System.out.println();

        //now lets use the interface
        //Using interface
        Wheels defaultWheels = new DefaultWheelsImpl();
        Wheels AwesomeWheelsImpl = new AwesomeWheelsImpl();

        //New car with default wheels
        MaintainableCar mcar = new MaintainableCar(defaultWheels);
        mcar.roll();

        //Went to the dealer, and decided to change wheels
        mcar.changeWheels(AwesomeWheelsImpl);
        mcar.roll();
        //Car still rolling.


    }

}
