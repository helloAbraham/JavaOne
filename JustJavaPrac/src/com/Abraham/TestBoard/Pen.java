package com.Abraham.TestBoard;

public class Pen {
    private String name;
    private String type;
    private double cost;

    public Pen(){

    }

    public Pen(String name, String type, double cost){
        this.name=name;
        this.type=type;
        this.cost=cost;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

    @Override
    public String toString(){
        return "Pen Name " + name + " Type " + type + " Price $ " + cost;
    }

}
