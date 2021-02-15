package com.Abraham.ReflectionInJava;

import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

public class TestReflection {

    public static void main(String[] args) {
        Class reflectClass = NewYork.class;
        //Let's say we want to know the class Name
        String className = reflectClass.getSimpleName();  //Not if we use just .getName it will print whole package "com.Abraham.ReflectionInJava.NewYork"
        System.out.println("The class name is " + className);

        //Now let's  we want to see modifier of the class, for example public or private
        int classModifier = reflectClass.getModifiers();
        System.out.println(Modifier.isPublic(classModifier));
        /**
            Also we can check like tha, isAbstract, isFinal, isInterface, isPrivate,
            isStatic, isStrict, isSynchronized, isVolatile
         */

            Class[] interfaces= reflectClass.getInterfaces();

            Class classSuper = reflectClass.getSuperclass();
        System.out.println("The Super class Name " + classSuper.getSimpleName());

        /**
            READme.md
            So you just manipulate the class that's all you are doing its nothing tricky here.
            You can also get Object methods and return type, and parameter types and all bunch
            of different things.
         */

        Method[] classMethods = reflectClass.getMethods();

        for(Method myMethods: classMethods){
            System.out.println("Method Name: " + myMethods.getName());
            if(myMethods.getName().startsWith("get")){
                System.out.println("Getter Method");
            }else if(myMethods.getName().startsWith("set")){
                System.out.println("setter Method");
            }
            System.out.println("return type: " + myMethods.getReturnType());
        }
    }

}
