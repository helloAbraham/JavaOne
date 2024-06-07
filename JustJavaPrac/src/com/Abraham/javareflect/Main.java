package com.Abraham.javareflect;
import java.lang.reflect.Field;


public class Main {

    public static void main(String[] args) throws Exception {

        User myUser = new User();
        //Get all the field objects of the User class
        Field[] fields = User.class.getFields();

        for(int i=0;  i< fields.length; i++){
            //get value of fields
            Object value = fields[i].get(myUser);
            //print
            System.out.println("Value of Fields: " + fields[i].getName() + " is " + value );
        }
    }
}
class User{
    public static String name = "Abraham";

    public static String getName() {
        return name;
    }

    public static void setName(String name) {
        User.name = name;
    }
}