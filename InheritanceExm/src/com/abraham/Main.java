package com.abraham;

public class Main {

    public static void main(String[] args) {
        DoctorPCP dp = new SpecialistDoc();

        DoctorPCP schedule= new DoctorPCP(9, 5);
        System.out.println(schedule.toString());
        dp.patientGenTreat();

        System.out.println("-------------" + "PCP Doctor done" + "---------------");
        System.out.println(" ");

        Surgeon sr = new Surgeon();
        sr.setStartTime(2);
        sr.setEndTime(6);
        //We can use direct the @Overriding toString method() to display schedule time
        System.out.println(sr.toString());
        // Below line of code we can take sr.getStartTime() + " " + sr.getEndTime() to show schedule time
       // System.out.println(sr.getStartTime() + " to " + sr.getEndTime());

        sr.patientGenTreat();
        sr.doIncision();

        System.out.println("-------------" + "Surgeon done" + "---------------");
        System.out.println(" ");

        Dentist dn = new Dentist();
        dn.patientGenTreat();
        dn.toothCare();

        System.out.println("-------------" + "Dentist done" + "---------------");
    }
}
