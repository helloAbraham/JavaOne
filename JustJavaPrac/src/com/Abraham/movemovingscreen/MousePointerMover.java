package com.Abraham.movemovingscreen;

import java.awt.*;

public class MousePointerMover {
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
            int stepSize = 50; //Adjusted as needed

            //Move the mouse from left to right
            for(int x = startPoint.x; x <=endPoint.x; x +=stepSize){
                myRobot.mouseMove(x, startPoint.y);;
                Thread.sleep(10000); //Adjusted the delay as
                System.out.println("Mouse is moving...");
            }
        } catch (AWTException | InterruptedException ex){
            ex.printStackTrace();
        }
    }
}
