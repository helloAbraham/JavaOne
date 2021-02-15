package com.Abraham.AbstractionExampleDetails;

public abstract class Shape {
    String color;

    //Create constructor
    public Shape(String color){
        this.color=color;
    }

    abstract double getArea();
    abstract String draw();

}
