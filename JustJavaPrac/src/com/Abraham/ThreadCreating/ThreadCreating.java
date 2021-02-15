package com.Abraham.ThreadCreating;

// Example of Creating thread using extends Thread
import javax.swing.plaf.TableHeaderUI;

public class ThreadCreating extends Thread{
    public void run()
    {
        System.out.println("My thread is in running state");
    }


    public static void main(String[] args) {
        ThreadCreating myThread = new ThreadCreating();
        myThread.start();

    }
}
