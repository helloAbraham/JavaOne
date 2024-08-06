package com.Abraham.GenericClassTwo;

public class Abc<T, F> {
    private T value1;
    private F value2;

    public Abc(T value1, F value2) {
        this.value1 = value1;
        this.value2 = value2;
    }

    public T getValue1() {
        return value1;
    }

    public void setValue1(T value1) {
        this.value1 = value1;
    }

    public F getValue2() {
        return value2;
    }

    public void setValue2(F value2) {
        this.value2 = value2;
    }

    //Method Usage: Methods inside `Abc` can utilize `T` and `F` as return types or parameter types
    public void displayValues(T val1, F val2){
        System.out.println("Value 1 : " + val1);
        System.out.println("Value 2 : " + val2);
    }

    /**
     Benefits of Generics:

     Type Safety: Helps detect and eliminate errors at compile time.
     Code re-usability : Enables writing reusable code that can work with different types.
     Flexibility: Provides flexibility to developers to create customizable data structures and algorithms.
     In summary, Abc<T, F> is a generic class declaration in Java,
     where T and F are type parameters that can be substituted with
     specific types when instances of Abc are created or methods of
     Abc are invoked. This feature enhances type safety and code
     reusability in Java programming.

     */
}
