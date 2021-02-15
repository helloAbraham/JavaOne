package com.Abraham.InheritanceExampleTwo;


public class GradedActivity {
    private double score; // to hold numeric value for score

    public void setScore(double score)
    {
        this.score = score;
    }

    public double getScore()
    {
        return score;
    }

    //Creating method which will return the letter Grade
    //According to the student score
    public char getGrade()
    {
        char letterGrade;
        if(score >= 90)
            letterGrade = 'A';
        else if(score >= 80)
            letterGrade = 'B';
        else if(score >= 70)
            letterGrade = 'C';
        else if(score >=60)
            letterGrade = 'D';
        else
            letterGrade = 'F';
        return letterGrade;
    }

}
