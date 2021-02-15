package com.Abraham.FiveWaysCreatingObject;
import java.lang.*;
public class CreatingObjectExmClassnewInstanceMethod {

    public static void main(String[] args) {
        try {
            CreatingObjectExmOne obj = CreatingObjectExmOne.class.newInstance();
            System.out.println(obj.hello);
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }

    }



}
