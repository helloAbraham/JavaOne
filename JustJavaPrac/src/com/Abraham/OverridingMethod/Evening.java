package com.Abraham.OverridingMethod;

public class Evening extends Morning{
    @Override
    public void drink()
    {
        System.out.println("Evening time I like to have Lemon Tea.");
    }

    public static void main(String[] args) {
        Evening ev = new Evening();
        //This method will be overridden and print what ever out put Evening class method
        ev.drink();

        //if we direct use Morning class method then it will out Morning Class method output
        Morning morning = new Morning();
        morning.drink();


        Morning myMor = new Evening();
        myMor.drink();

    }
}
