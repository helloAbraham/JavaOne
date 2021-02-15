package com.Abraham.LeapYear;

import javax.swing.*;

public class LearYearExmDialogBox {
    public static void main(String[] args) {

       int year = Integer.parseInt(JOptionPane.showInputDialog("Enter any Year 'YYYY' :"));
        if(((year % 4 ==0) && (year % 100 !=0)) || (year % 400==0)){

            JOptionPane.showMessageDialog(null, "IT IS LEAP YEAR");
        }else{

            JOptionPane.showMessageDialog(null, "IT IS COMMON YEAR");
        }
    }
}
