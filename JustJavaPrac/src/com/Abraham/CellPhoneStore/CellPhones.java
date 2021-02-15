package com.Abraham.CellPhoneStore;

public class CellPhones {

    //declaring String variables to holds the value

    String manufacture;
    String model;
    double retailPrice;


	/*
		Constructors.
	 */

        //Compiler generate
    public CellPhones(String manufacture, String model, double retailPrice) {
        this.manufacture = manufacture;
        this.model = model;
        this.retailPrice = retailPrice;
    }

    public String getManufacture() {
        return manufacture;
    }

    public void setManufacture(String manufacture) {
        this.manufacture = manufacture;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public double getRetailPrice() {
        return retailPrice;
    }

    public void setRetailPrice(double retailPrice) {
        this.retailPrice = retailPrice;
    }

    /**
    // I was creating myself
    public CellPhones(String manufacture, String model, double retailPrice) {

        this.manufacture = manufacture;
        this.model = model;
        this.retailPrice = retailPrice;

    }


    //Set and get method ..


    public void setManufect(String manu) {
        manufacture = manu;
    }

    public void setModel(String mode) {
        model = mode;
    }

    public void setPrice(double rprice) {
        retailPrice = rprice;
    }



    public String getManufect() {
        return manufacture;
    }

    public String getModel() {
        return model;
    }

    public double getPrice() {
        return retailPrice;
    }
        */
}
