package com.Abraham.ReadingFilesWB;


import java.io.*;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOError;
import java.io.EOFException;


public class ReadingFilesWithBuffered {

    public static void main(String[] args) {

        File myFile = new File("example.txt");

        try {
            BufferedReader reader = new BufferedReader(new FileReader("myFile"));
            String line;
            while(( line = reader.readLine()) != null){
                System.out.println(line);
            }
        } catch (IOException e) {

        }
    }
}
