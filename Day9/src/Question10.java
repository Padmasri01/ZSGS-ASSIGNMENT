//Write a Java program to manage a voting system where a person must be at least 18 years old to be eligible to vote.
//Use a custom exception to handle the scenario when an ineligible person tries to register for voting. Display appropriate
//messages for eligible and ineligible voters.


import java.util.Scanner;

public class Question10 {
    public static void regi() throws Exception
    {
        Scanner obj=new Scanner(System.in);
        System.out.println("Enter your Age");
        Byte age=obj.nextByte();
        if(age<18)
        {
            throw new Exception();
        }
        else {
            System.out.println("Registration successfully .. You are eligible for vote.... ");
        }
    }

    public static void main(String[] args)
    {
        try
        {
            regi();
        }
        catch (Exception e)
        {
            System.err.println("Your are Not Eligible. wait few Years " );
        }

    }
}
