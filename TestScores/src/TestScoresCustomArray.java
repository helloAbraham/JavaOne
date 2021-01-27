import java.util.Scanner;

/**
    This is the simple java program, user can specify how many test score wants
    to insert in the array to calculate - many option such as average, highest, lowest
 */
public class TestScoresCustomArray {
    public static void main(String[] args) {
        int numberOfExams;
        int[] exams;

        //taking user input as how many exams score
        Scanner userInput = new Scanner(System.in);
        System.out.println("How many exams score you want to insert? ");
        numberOfExams = userInput.nextInt();

        //Now lets create an array to hold that number of exams scores
        exams = new int[numberOfExams];
        //After that get the each of exam scores
        for(int i = 0; i<exams.length; i++){
            System.out.println(" Enter Your Exam " + (i+1) + " Score: ");
            exams[i] = userInput.nextInt();
        }

        //time to show the scores
        System.out.println();
        System.out.println(" The Scores You Entered: ");
        for(int i=0; i<exams.length; i++)
        System.out.print(exams[i] + " ");
    }

}
