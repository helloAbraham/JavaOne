package com.Abraham.AbstractionExampleDetails;

public class Main {
    public static void main(String[] args) {
        Rectangle rc = new Rectangle("Purple ", 5, 2);
        Circle cr = new Circle("Blue", 4);

        System.out.println("Rectangle Area " + rc.getArea());
        System.out.println("Circle Area " + cr.getArea());

        System.out.println(rc.draw());
        System.out.println(cr.draw());
    }
}
