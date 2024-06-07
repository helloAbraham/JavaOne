package InheritanceExampleOne;


public class CalculationObjectCreating {

    public void multiplication(int first, int second){
        int result = first * second;
        System.out.println("The product of the given input is " + result);
    }

    public static void main(String[] args) {
        SimpleCalculation scal = new SimpleCalculation();
        scal.addition(10, 20);

        scal.subtraction(50, 49);

        CalculationObjectCreating calObj = new CalculationObjectCreating();
        calObj.multiplication(10, 20);

        //But if we have the method is static we just can use the method
        //inside the main method direct the method
       // multiplication(10,20);

    }
}
