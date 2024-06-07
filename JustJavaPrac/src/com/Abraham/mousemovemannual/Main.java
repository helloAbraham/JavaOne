package com.Abraham.mousemovemannual;

import javax.swing.*;

/*
    this is the program thread will run infinitely unless user kill it/ interrupt it
 */
public class Main {
    public static void main(String[] args) {

        //Create and start the thread
        Thread myMouseThread = new Thread(new MouseMovementThread());
        myMouseThread.start();

        //Show the JOptionPaneDialog to prompt the user to terminate the thread
        int userChoice = JOptionPane.showConfirmDialog(null,
                "Do you want to terminate the mouse movement", "Exit ...", JOptionPane.YES_NO_OPTION);
        //If the user chooses to terminate the thread, interrupt the thread
        if(userChoice == JOptionPane.YES_OPTION) {
            myMouseThread.interrupt();
        }
    }

    static class MouseMovementThread implements Runnable {
        @Override
        public void run(){
            try {
                while(!Thread.currentThread().isInterrupted()){
                    //Your mouse movement logic here
                    System.out.println("Mouse is moving ...");
                    //Simulate mouse movement
                    Thread.sleep(60000);
                }
            } catch(InterruptedException e) {
                System.out.println("Mouse movement thread interrupted.");
            }
        }
    }
}
