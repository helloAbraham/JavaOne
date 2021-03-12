import javax.swing.*;

public class BooleanExpression {

    public static void main(String[] args) {
        double hours, charges;
        String input;

        input = JOptionPane.showInputDialog("How many hours you were worked? ");
        hours = Double.parseDouble(input);

        hours = hours<5 ? 5:hours;

        charges = 50.0 * hours;
        JOptionPane.showMessageDialog(null, "You have been charged $" + charges);

        /**
            y = x<0 ? 25:75;
         It is same as if condition
         if(x<0)
            y=25;
         else
            y=75;
         */


    }
}
