/*5. Create a program where the try block contains a return statement. Ensure that the finally block executes before the
method returns. Show this with output.*/

import java.util.Scanner;

public class Question5 {
    public static int excep()
    {
        try
        {
            Scanner obj=new Scanner(System.in);
            System.out.println("Enter the value");
            int num1=obj.nextInt();
            System.out.println("Try Block");
            return num1;
        }
        catch (Exception e)
        {
            System.err.println("Error Occured");
            return 0;
        }
        finally {
            System.out.println("Finally runs");
        }
    }
    public static void main(String[] args) {
        int num=Question5.excep();
        System.out.println("The Return value is "+num);

    }
}
