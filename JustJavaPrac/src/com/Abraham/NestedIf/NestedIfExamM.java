package com.Abraham.NestedIf;
import javax.swing.JOptionPane;
import javax.swing.*;

public class NestedIfExamM {
    public static void main(String[] args) {
        String age;
        String money;

        age = JOptionPane.showInputDialog("Please Enter Your Age: ");
        int getAge = Integer.parseInt(age);
        money = JOptionPane.showInputDialog("Enter your available money: ");
        int getMoney = Integer.parseInt(money);

        //now let's use nested if
        if(getAge > 24){
            if(getMoney >10000){
                //System.out.println("Congratulation! You may get marry.");
                JOptionPane.showMessageDialog(null, "Congratulation! You may get marry.");
            }else {
                //System.out.println("Sorry! You do not have enough money.");
                JOptionPane.showMessageDialog(null, "Sorry! You do not have enough money.");
            }
        }else{
            //System.out.println("Sorry! Though You have money. You are too young to get marry!");
            JOptionPane.showMessageDialog(null, "Sorry! You are too young to get marry");
        }



    }



}
