package com.Abraham.FiveWaysCreatingObject;

public class CloneExample implements Cloneable{
    protected Object clone() throws CloneNotSupportedException
    {
        return super.clone();
    }

    String name = "This is clone String class";
    public void showMessage(){
        System.out.println("You create the object using the Clone");
    }

}
