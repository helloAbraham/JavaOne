package com.Abraham.InheritanceExampleOne;
import javax.swing.JOptionPane;

public class GradeDemo {

    public static void main(String[] args) {
        GradedActivity grade = new GradedActivity(); //Create a object grade

        String input; // to hold input
        double testScore; // A test score

        //taking input from the users
        input = JOptionPane.showInputDialog("Enter " + "numeric test score ");
        testScore = Double.parseDouble(input);

        //store the score in the grade object score
        grade.setScore(testScore);
        JOptionPane.showMessageDialog(null, "The grade for that test is " + grade.getGrade());
        System.exit(0);

    }
}
