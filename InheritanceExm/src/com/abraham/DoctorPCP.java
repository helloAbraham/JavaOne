package com.abraham;

public class DoctorPCP {

    void patientGenTreat(){
        System.out.println("Perform regular Checkup");
    }

    private int startTime;
    private int endTime;

    public DoctorPCP(){

    }
    public DoctorPCP(int startTime, int endTime) {
        this.startTime = startTime;
        this.endTime = endTime;
    }

    public int getStartTime() {
        return startTime;
    }

    public void setStartTime(int startTime) {
        this.startTime = startTime;
    }

    public int getEndTime() {
        return endTime;
    }

    public void setEndTime(int endTime) {
        this.endTime = endTime;
    }

    @Override
    public String toString(){
        return "Visiting Time is " + startTime+ " to " + endTime + " PM";
    }

}
