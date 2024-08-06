package com.Abraham.MethodArgsClass;

public class CarService {

    //Here we can do something with the car.

    public void repairCar(Car car) {
        //Method logic to repair the car
        System.out.println("Repairing " + car.getBrand() + " " + car.getModel() + " " + car.getModelYear() );
    }

    public static void main(String[] args) {
        Car myCar = new Car("Toyota", "Camry", 2012);
        CarService carService = new CarService();
        carService.repairCar(myCar);
    }
}
