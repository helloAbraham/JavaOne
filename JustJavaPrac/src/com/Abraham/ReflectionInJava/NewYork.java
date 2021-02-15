package com.Abraham.ReflectionInJava;

public class NewYork extends UnitedStates{
    private String idcode="123456789";

    private String getPrivate(){
        return "How did you get this ";
    }

    private String getOtherPrivate(int thisInt, String str){
        return "How did you get in here " + thisInt + " "+ str;
    }

    //Constructor
    public NewYork(int num, String str){
        System.out.println("You sent: " + num + " " + str);
    }

    UnitedStates unitedStates;
    public NewYork(UnitedStates unitedStates){
        this.unitedStates=unitedStates;
    }

    private void theySayIt(){
        System.out.println("If you make it here, you can make it anywhere ");
        String slogan = unitedStates.toString();

        int sum = unitedStates.add(10,20);
    }

}

















