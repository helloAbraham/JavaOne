package com.Abraham.InheritanceExampleTwo;

public class FinalExam extends GradedActivity{
    private int numOfQuestions; //number of questions
    private double pointsEach;  //Points for each questions
    private int numMissed;     //Questions missed

    /**
         The constructor sets the number of questions on the exam
         and the number of questions missed.
         @param numOfQuestions The number of questions.
         @param numMissed The number of questions missed
     */

    public FinalExam(int numOfQuestions, int numMissed)
    {
        double numericScore;   // To hold a numeric score
        //set the questions and numMissed fields
        this.numOfQuestions = numOfQuestions;
        this.numMissed = numMissed;
        //Let's calculate the points for each questions and the numeric score fot the exam
        pointsEach = 100.0 /numOfQuestions;
        numericScore = 100.0 -(numMissed * pointsEach); //This will give us student score for calculating letter Grade

        //now call the inherited setScore method to set the numeric score
        setScore(numericScore);
    }

    /** The getPointsEach method return the number of points each question is worh
    @return The value in the pointsEach field.
    */

    public double getPointsEach()
    {
        return pointsEach;
    }

    /**
     The getNumMissed method returns the number of questions missed
     @return The value in the method field.
     */

    public int getNumMissed()
    {
        return numMissed;
    }

}
