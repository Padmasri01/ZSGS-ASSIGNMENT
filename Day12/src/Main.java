/*1. Write a Java program to demonstrate multi-threading by extending the Thread class.
        --->Create a class MyThread that extends Thread.
        --->Override the run() method to display the thread name and a message five times with a delay of 500 milliseconds
between prints.
        --->In the main() method, create two objects of MyThread and start them.
        --->Each thread prints its message independently, showing concurrent execution.*/


class MyThread extends Thread
{
    public void run()
    {
        for (int i = 1; i <= 5; i++) {
            System.out.println(Thread.currentThread().getName() + " - Message " + i);
            try
            {
                Thread.sleep(500);
            }
            catch (InterruptedException e)
            {
                System.out.println("Thread interrupted: " + e);
            }
        }
    }
}

public class Main {
    public static void main(String[] args)
    {

        MyThread t1 = new MyThread();
        MyThread t2 = new MyThread();


        t1.setName("Thread-One");
        t2.setName("Thread-Two");


        t1.start();
        t2.start();
    }
}
