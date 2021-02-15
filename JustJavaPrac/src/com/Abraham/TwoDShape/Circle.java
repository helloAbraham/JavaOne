package com.Abraham.TwoDShape;

//A subclass of TwoDShape for circles
public class Circle extends TwoDShape{


    double area(){
        return (getWidth() /2 ) * (getWidth() /2 ) * 3.14;
    }
}
