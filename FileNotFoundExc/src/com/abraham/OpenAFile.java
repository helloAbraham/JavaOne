package com.abraham;

import javax.swing.*;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class OpenAFile {

    public static void main(String[] args) {
        File file;
        Scanner inputFile;
        String fileName;

        //Let's get a file name from the user.
        fileName = JOptionPane.showInputDialog("Enter " + "the name of a file: ");

        //Attempt to open the file

        try{
             file = new File(fileName);
             inputFile = new Scanner(file);
             JOptionPane.showMessageDialog(null, "The file was found");

        }catch (FileNotFoundException fexe){
            JOptionPane.showMessageDialog(null, "The File " + fileName + "  does not exits.");
           // JOptionPane.showMessageDialog(null, fexe.getMessage());

        }

        JOptionPane.showMessageDialog(null, " It's done");
        System.exit(0);
    }
}



