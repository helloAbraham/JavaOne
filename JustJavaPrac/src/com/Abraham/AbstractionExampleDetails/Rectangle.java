package com.Abraham.AbstractionExampleDetails;

public class Rectangle extends Shape{
    double length;
    double width;

    public Rectangle(String color, double length, double width){
        super(color);
        this.length = length;
        this.width = width;
    }

    //Also we can create getter and setter for taking input when we instance the class

    public double getArea(){
        return length * width;
    }

    public String draw(){
        return "A " + color + " Rectangle " + length +" inches long and " + width + " inches wide is drawn";
    }
}
