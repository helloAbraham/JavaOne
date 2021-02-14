/**
 This is the simple program to catch the error
 We can not divided by ZERO,
 Also if we have two array and do something both length are not equal. It will catch the
 out of Bounds exception.
 */

public class ExcDemoAnother {
    public static void main(String[] args) {

        int[] numerator = {3, 9, 81, 596, 81, 9, 3, 9};
        int[] denominator = {1, 3, 0, 9, 0, 3, 1};

        for(int i =0; i<numerator.length; i++){

            try{
                System.out.println(numerator[i] + " / " + denominator[i] + " is " + numerator[i] / denominator[i] );
            }catch (ArithmeticException exc){
                System.out.println("We can not Divided by ZERO.");
            }catch (ArrayIndexOutOfBoundsException e){
                System.out.println("Elements can't be reached. ");
            }
        }
    }
}
