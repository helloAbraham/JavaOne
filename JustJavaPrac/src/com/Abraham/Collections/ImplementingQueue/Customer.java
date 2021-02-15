package com.Abraham.Collections.ImplementingQueue;

public class Customer {
    private boolean hasBeenServe;
    private String name;

    public Customer(String name){
        this.name = name;
    }



    //serve method
    public void serve(){
        hasBeenServe = true;
        System.out.println(name + " has been served.");
    }

    @Override
    public String toString(){
        return name;
    }
}
