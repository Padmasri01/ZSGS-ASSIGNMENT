/*2. Write a Java program to create a thread using the Runnable interface.
        --->Create a class TaskRunner that implements Runnable.
        --->Inside the run() method, print the current thread name and a task-specific message 10 times with a delay of 1000ms.
--->In the main() method, create two Thread objects passing different TaskRunner instances and start both threads.
        --->The console should reflect the concurrent execution of both tasks.*/

class TaskRunner implements Runnable
{
    private String taskName;

    public TaskRunner(String taskName)
    {
        this.taskName = taskName;
    }
    @Override
    public void run()   {

        for (int i = 1;i<=10; i++)
        {
            System.out.println(Thread.currentThread().getName() + " - " + taskName + " - Message " + i);

            try{
                Thread.sleep(1000);
            }
            catch(InterruptedException e){
                System.out.println("Thread got interrupted");
            }

        }
    }
}
public class TaskRunnerTest
{
    public static void main(String[] args) throws InterruptedException {
        TaskRunner task1 = new TaskRunner("Thread1");
        TaskRunner task2 =new TaskRunner("Thread2");

        Thread t1 = new Thread(task1);
        Thread t2 = new Thread(task2);

        t1.setName("Thread-A");
        t2.setName("Thread-B");

        t1.start();
        t2.start();
    }
}
