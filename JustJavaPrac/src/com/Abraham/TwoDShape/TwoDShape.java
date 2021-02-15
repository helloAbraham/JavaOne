package com.Abraham.TwoDShape;

public class TwoDShape {


  private double length;
  private double width;

    /**
         The setLength method stores a value in the field.
         @param len The value to store in length
     */
    //These set methods are called mutators

    public void setLength(double len) {
        //this.length = len;
        length = len;
    }

    /**
     The setWidth method stores a value in the filed.
     @param w The value to store in width.
     */

    public void setWidth(double w) {
        width = w;
    }

    /**
     The getLength method returns a Rectangle object's length.
     @return The value in the length field
     */

    //Note myself.. these get method are called accessors
    public double getLength() {
        return length;
    }

    /**
     The getWidth method returns a Rectangle object's width.
     @return The value in the length field
     */

    public double getWidth() {
        return width;
    }

    /**
     The getArea method return a Rectangle object's area
     @return The product of length times width
     */

    public double getArea() {
        return length * width;

    }




}
