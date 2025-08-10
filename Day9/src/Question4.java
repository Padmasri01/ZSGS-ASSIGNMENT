/*4. Write a method to parse a string to an integer. Throw an exception if the string is not a valid number. Handle it using
        try-catch.*/

import java.util.Scanner;

public class Question4 {
    public static void main(String[] args) {
        try
        {
            Scanner obj=new Scanner(System.in);
            System.out.println("Enter the String");
            String str=obj.nextLine();
            int num=Integer.parseInt(str);

        }
        catch (NumberFormatException e)
        {
            System.err.println("String is not a valid Number");
        }
    }
}