package com.Abraham.MethodArgsClass;

public class Car {

    private String brand;
    private String model;
    private int modelYear;

    public Car(String brand, String model, int modelYear) {
        this.brand = brand;
        this.model = model;
        this.modelYear = modelYear;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getModelYear() {
        return modelYear;
    }

    public void setModelYear(int modelYear) {
        this.modelYear = modelYear;
    }
}
