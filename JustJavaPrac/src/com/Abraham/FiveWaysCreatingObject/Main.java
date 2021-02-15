package com.Abraham.FiveWaysCreatingObject;

import java.lang.reflect.Constructor;

/**
    This main class has FIVEWays to create object
 */

public class Main {

    public static void main(String[] args) {
        //Creating object very common way
        //This is the our first way to show
        CreatingObjectExmOne objOne = new CreatingObjectExmOne();
        System.out.println(objOne.hello);

        //Second way is
        //But we have to use try and catch block for exception
       // CreatingObjectExmOne objTwo = CreatingObjectExmOne.class.newInstance();
        try{
            CreatingObjectExmOne objTwo = CreatingObjectExmOne.class.newInstance();
            System.out.println(objOne.hello);
        }catch (InstantiationException e){
            e.printStackTrace();
        }catch (IllegalAccessException e) {
            e.printStackTrace();
        }

        //Third way we can do
        //Construction
        try {
            Constructor<CreatingObjectExmOne> objThird = CreatingObjectExmOne.class.getConstructor();
            CreatingObjectExmOne objth = objThird.newInstance();
            System.out.println(objth.hello);
        }catch(Exception e){
            e.printStackTrace();

        }


        //FourthWay to creating object
        //Which is Clone()
        CloneExample cloneObject = new CloneExample();

        try{
            CloneExample cloneObj2 = (CloneExample)cloneObject.clone();

            System.out.println(cloneObj2.name);
        }catch (Exception e){
            e.printStackTrace();

        }

        //Number FIVE ways to create object



    }

    /**
     class Demo implements Serializable
     {
     public int i;
     public String s;
     public Demo(int i, String s) //default constructor
     {
     this.i = i;
     this.s = s;
     }
     }
     public class DeserializationExample
     {
     public static void main(String[] args)
     {
     Demo object = new Demo(8, "javatpoint");
     String filename = "Demofile.ser";       //specified file name (must have extension .ser)
     /*-----------------Serialization----------*/
    /**    try
    {
        FileOutputStream file = new FileOutputStream(filename);  //Saving of object in the file
        ObjectOutputStream out = new ObjectOutputStream(file);
        out.writeObject(object);            //serialize object
        out.close();                    //closes the ObjectOutputStream
        file.close();                   //closes the file
        System.out.println("Object serialized");
    }
catch(IOException e)
    {
        e.printStackTrace();
    }
    Demo obj = null;
    /*-----------------Deserialization--------*/
   /**     try
    {
        FileInputStream file = new FileInputStream(filename); // reading an object from a file
        ObjectInputStream is = new ObjectInputStream(file);
        obj = (Demo)is.readObject();        //deserialize object
        is.close();                     //closes the ObjectInputStream
        file.close();                   //closes the file
        System.out.println("Object deserialized ");
        System.out.println("number = " + obj.i);
        System.out.println("string = " + obj.s);
    }
    catch(IOException e)
    {
        System.out.println("IOException is caught");
    }
    catch(ClassNotFoundException e)
    {
        System.out.println("ClassNotFoundException is caught");
     }
    }
     */


}
