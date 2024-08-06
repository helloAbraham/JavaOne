package com.Abraham.MouseMovement;


import javax.swing.*;
import java.awt.*;
import java.util.Timer;
import java.util.TimerTask;



public class MousePointerMoving {

    public static void main(String[] args) {

        try {

            //get the screen resolution

            Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();

            int screenWidth = (int) screenSize.getWidth();

            int screenHeight = (int) screenSize.getHeight();



            //Calculate the starting point and ending points

            Point startPoint = new Point(0, screenHeight/2);

            Point endPoint = new Point(screenWidth-1, screenHeight/2);



            //Create a Robot object
            Robot myRobot = new Robot();



            //Set the initial mouse position

            myRobot.mouseMove(startPoint.x, startPoint.y);



            //Calculate the step size

            int stepSize = 25; //Adjusted as needed



            //Move the mouse from left to right

            for(int x = startPoint.x; x <=endPoint.x; x +=stepSize){

                myRobot.mouseMove(x, startPoint.y);

                Thread.sleep(60000); //Adjusted the delay as

                System.out.println("Mouse pointer is moving...");



                //If we want to automatically thread stop

                //Create a new Timer Object

                Timer myTimer = new Timer();



                //Now schedule a task to execute after 2 hours

                myTimer.schedule(new TimerTask() {

                    @Override

                    public void run() {

                        //Perform cleanup or termination actions here

                        //System.out.println("Thread is terminated after 2 hours");

                        //JOptionPane.showMessageDialog(null, "Thread is terminated, Good bye! ");



                        int choice = JOptionPane.showConfirmDialog(null, "Do you want to terminate the mouse movement?", "Exit Option ...", JOptionPane.YES_NO_OPTION);

                        //If the user chooses to terminate the thread, interrupt the thread

                        if(choice == JOptionPane.YES_OPTION) {

                            //Terminate the program

                            System.exit(0);
                        }

                        //Terminate the program

                        //System.exit(0);

                    }

                }, 500); // 2 hours in milliseconds 2*60*60*1000

            }

        } catch (AWTException | InterruptedException ex){

            ex.printStackTrace();

        }

    }

}