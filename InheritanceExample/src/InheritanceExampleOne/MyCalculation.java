package InheritanceExampleOne;

/**
    This is the simple program will show how to use inheritance using
    extends keyword.
 */
public class MyCalculation extends SimpleCalculation{

    public void multiplication(int first, int second){
        int result = first * second;
        System.out.println("The product of the given input is " + result);
    }

    public static void main(String[] args) {
        int n = 25;
        int p = 4;

        MyCalculation myCalculation = new MyCalculation();
        myCalculation.addition(n, p);
        myCalculation.subtraction(n, p);
        myCalculation.multiplication(n, p);
    }
}
