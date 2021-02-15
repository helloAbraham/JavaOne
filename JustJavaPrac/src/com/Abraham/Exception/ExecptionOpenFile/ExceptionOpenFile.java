package com.Abraham.Exception.ExecptionOpenFile;
import java.io.*;
import java.util.Scanner;
import javax.swing.JOptionPane;

import static javax.swing.JOptionPane.showMessageDialog;

public class ExceptionOpenFile {

    public static void main(String[] args) {
        File file;
        Scanner inputFile;
        String fileName;

        //Get a file from the user to oepn
        fileName = JOptionPane.showInputDialog("Enter " + "the name of a file");

        //Attempt to open file
        try{
            file = new File(fileName);
            inputFile = new Scanner(file);
            JOptionPane.showMessageDialog(null, "The file was found");
        }catch (IOException e) {
            showMessageDialog(null, "The file wasn't found");
        }
        JOptionPane.showMessageDialog(null, "Done");
        System.exit(0);

       // System.out.println("Still Am I Searching the file????");
        //or we can try another JOptionPane.showMessageDialog(null, "Still I'm Searching!!!!");
        JOptionPane.showMessageDialog(null, "Still I'm Searching!!!!");
        //Note after System.exit(0) there will not be any line of code execute
        //Here JOptionPane.showMessageDialog(null, "Still I'm Searching") not executed
    }
}
