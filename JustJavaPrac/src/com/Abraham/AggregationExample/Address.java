package com.Abraham.AggregationExample;
/**
 Aggregation is a term which is used to refer
 one way relationship between two objects. ...
 In Java, aggregation represents HAS-A relationship,
 which means when a class contains reference of another class known to have aggregation.
 */

/**
    This is the example of simple aggregationExample how it works.
    This is the class Address, this Address will be implemented Employee class
 */
public class Address {

    String Street, City, State, Country;
    int  ZipCode;


    public Address(String Street, String City, String State, int ZipCode, String Country ){
        this.Street = Street;
        this.City = City;
        this.State = State;
        this.ZipCode = ZipCode;
        this.Country = Country;
    }

}
