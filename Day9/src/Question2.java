/*2. Demonstrate multiple catch blocks: accept two numbers as strings, then convert them to integers, and perform
        division, and catch the following exceptions: InputMismatchException, NumberFormatException, ArithmeticException
        and Exception.*/

import java.util.InputMismatchException;
import java.util.Scanner;

public class Question2 {
    public static void main(String[] args) {
        Scanner obj=new Scanner(System.in);

        try
        {
            System.out.println("Enter the Number");
            String num1=obj.nextLine();
            System.out.println("Enter the Number2");
            String num2=obj.nextLine();
            int n=Integer.parseInt(num1);
            int n1=Integer.parseInt(num2);
            int result=n/n1;
            System.out.println(result);
        }
        catch (InputMismatchException e)
        {
            System.err.println("Input Mis Match Exception");
        }
        catch (NumberFormatException e)
        {
            System.err.println("NumberFormat Exception");
        }
        catch (ArithmeticException e)
        {
            System.err.println("Arithmetic Exception");
        }
        catch (Exception e)
        {
            e.getMessage();
        }
    }
}