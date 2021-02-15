package com.Abraham.InheritanceExampleTwo;

import javax.swing.*;

public class FinalExamDemo {
    public static void main(String[] args) {
        String input;
        int questions;
        int missed;

        //get the number of questions on the exam
        input = JOptionPane.showInputDialog("How many " + "questions are on the final exam?");
        questions = Integer.parseInt(input);

        //get the number of questions the student missed.
        input = JOptionPane.showInputDialog("How many " + "question did student miss? ");
        missed = Integer.parseInt(input);

        //now lets create FinalExam object
        FinalExam exam = new FinalExam(questions, missed);  // Because we already have constructor
                                                            //on FinalExam class
        // Time to display display the test result
        JOptionPane.showMessageDialog(null, "Each questions counts " + exam.getPointsEach()
                + " points.\nThe exam score is " + exam.getScore() + "\nThe exam grade is " + exam.getGrade() );

        System.exit(0);

    }
}
