package com.ap;

public class CustomerName {

    //composition has - a relationship
    private Address addres;

    public CustomerName(){
        this.addres = new Address();
        addres.setCustomerName("Abraham Parker");
    }

    public String getName(){
        return addres.getCustomerName();
    }

}
