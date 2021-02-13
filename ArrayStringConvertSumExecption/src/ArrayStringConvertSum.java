/**
    This is the simple program will show how to exception work.
    For example, if an array has String elements
    It will convert integer. it will add all of them and produce sum.
    if it has some string, it will show the exception.
    program will show which are correct, also will show the elements is string
 */

public class ArrayStringConvertSum {

    public static void main(String[] args) {
        String[] myNum = {"1", "7", "2", "6", "Volvo", "BMW", "5", "Ford", "9", "Toyota", };
        int sum = 0;

        //using enhance for loop retrieve array element data and converted to integer;
        // to calculate the sum and try catch if there are not integer do not crash the program
        for(String element: myNum){
            try{
                int convertedNum = Integer.parseInt(element);
                sum += convertedNum;
            }catch (NumberFormatException exc){
                System.out.println("Element " + element + " in the array NOT integer.");
            }

        }
        System.out.println("Some elements in the array are integer and their SUM is " + sum);
    }
}
