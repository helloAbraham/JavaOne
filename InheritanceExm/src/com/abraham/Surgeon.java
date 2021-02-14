package com.abraham;

public class Surgeon extends DoctorPCP{

    @Override
    void patientGenTreat(){
        System.out.println("Usually perform Surgery");
    }

    void doIncision(){
        System.out.println("Does Incision whenever needed.");
    }
}
