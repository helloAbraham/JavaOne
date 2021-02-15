package com.Abraham.SubstitutionPrinciple;

import java.util.ArrayList;
import java.util.List;
public class Main {

    public static void main(String[] args) {
        Building building = new Building();
        Office office = new Office();

        build(building);        //calling build method in the class static method
        build(office);          // same ||

        List<Building> buildings = new ArrayList();
        buildings.add(new Building());
        buildings.add(new Office());

        //now let's print
        printBuildings(buildings);

    }


    public static void build(Building building){
        System.out.println("Constructing a new " + building.toString());
    }

    //Fantastic method example of generic type List
    public static void printBuildings(List<Building> buildings){
        for(int i =0; i<buildings.size(); i++){
            System.out.println(i + 1 + ": " + buildings.get(i).toString());
            //If we want we can remove .toString() method because it is instance method
            //implicitly it will do the job
            //System.out.println(i + 1 + ": " + buildings.get(i));
        }
    }

}
