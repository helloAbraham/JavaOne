package com.ap;

public class CustomerInfo {

    public static void main(String[] args) {
        CustomerName cname= new CustomerName();
        Address addingAddress = new Address("8345 Broadway", "Elmhurst", "New York", 11373);
        String custName = cname.getName();

        System.out.println(custName + "\nAddress " + addingAddress);
    }

}
