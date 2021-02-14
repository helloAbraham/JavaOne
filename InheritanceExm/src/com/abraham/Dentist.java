package com.abraham;

public class Dentist extends DoctorPCP{
    void toothCare(){
        System.out.println("Dentist can do Tooth Extraction.");
    }

    @Override
    void patientGenTreat(){
        System.out.println("Dentist regular treatment such as Removing plaque and tartar.");
    }
}
