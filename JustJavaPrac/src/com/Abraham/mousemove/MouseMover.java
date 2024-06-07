package com.Abraham.mousemove;

import java.awt.*;
import java.awt.event.InputEvent;
import java.util.Timer;
import java.util.TimerTask;

public class MouseMover {
    public static void main(String[] args) {
        try {
            //Create Robot object
            Robot myRobot = new Robot();
            int delay = 5000; // Delay in milliseconds (e.g., 5000 ms = 5 seconds)

            while (true) {
                // Move the mouse to a specific coordinate
                myRobot.mouseMove(500, 500);

                System.out.println("Mouse is moving...");
                // Simulate a mouse click (optional)
                myRobot.mousePress(InputEvent.BUTTON1_DOWN_MASK);
                myRobot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);

                // Wait for the specified delay before moving again
                Thread.sleep(delay);
            }
        } catch (AWTException | InterruptedException ex) {
            ex.printStackTrace();
        }


        // Create a new Timer object
        Timer timer = new Timer();

        // Schedule a task to execute after 1 hour
        timer.schedule(new TimerTask() {
            @Override
            public void run() {
                // Perform cleanup or termination actions here
                System.out.println("Thread is terminated after 1 hours");
                // Terminate the program
                System.exit(0);
            }
        }, 1 * 60 * 60 * 1000); // 1 hour in milliseconds

        // Your main application logic here
        // For example, starting your mouse movement thread

        // Keep the main thread alive
        // In a real application, this would be your main application logic
        try {
            Thread.sleep(Long.MAX_VALUE);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }
}

