import java.text.NumberFormat;

public class Main {

    public static void main(String[] args) {
        var doubleValue = 10.2378;


        var numF = NumberFormat.getNumberInstance();


        // var doubleValue = 10.2378;

        // var numF = NumberFormat.getNumberInstance();
    //    var decimalNumber = Double.parseDouble(doubleValue);


     //   System.out.println("This is decimal number " + decimalNumber.format(decimalNumber));

       // var number = Double.parseDouble(doubleValue);

      // /System.out.println(number);
        System.out.println("Number: " + numF.format(doubleValue));

        System.out.println("Number " + doubleValue);


        var name = "Abraham";

        var lname = "Parker";

        var fullname = "You name , %s, $%.2f, ";

        System.out.println(name + lname);


    }

}
