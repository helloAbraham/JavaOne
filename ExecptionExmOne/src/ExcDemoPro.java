/**
     This is the simple program for understanding the exception.
     We are going to use ArrayIndexOutOfBounds
 */

public class ExcDemoPro {

    public static void main(String[] args) {
        int[] number = new int[5]; //We create an integer array with bounds, not initialize any elements



        try {
            System.out.println("Before Exception is generated.");
            number[8] = 1001;
            System.out.println("This won't be displayed.");
        }catch (ArrayIndexOutOfBoundsException exc){
            System.out.println("Hey You made a mistake...");
        }


    }
}
