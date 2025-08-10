/*3. Write a Java program where one thread prints only even numbers and another prints only odd numbers from 1 to 20.
Synchronize the threads so that they print alternately (i.e., 1 2 3 4 ...).*/
import java.lang.Throwable;
class NumberPrinter
{
    private int number = 1;
    private final int MAX = 20;

    public synchronized void printOdd()
    {
        while (number <= MAX)
        {
            if (number % 2 == 0)
            {
                try
                {
                    wait();
                }
                catch (InterruptedException e)
                {
                    e.printStackTrace();
                }
            }
            else
            {
                System.out.println("Odd: " + number);
                number++;
                notify();
            }
        }
    }

    public synchronized void printEven()
    {
        while (number <= MAX)
        {
            if (number % 2 != 0)
            {
                try
                {
                    wait();
                }
                catch (InterruptedException e)
                {
                    e.printStackTrace();
                }
            }
            else
            {
                System.out.println("Even: " + number);
                number++;
                notify();
            }
        }
    }
}

public class OddEvenThread
{
    public static void main(String[] args)
    {
        NumberPrinter printer = new NumberPrinter();

        Thread oddThread = new Thread(() -> printer.printOdd());
        Thread evenThread = new Thread(() -> printer.printEven());

        oddThread.start();
        evenThread.start();
    }
}

