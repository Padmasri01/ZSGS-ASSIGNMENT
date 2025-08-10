//Write a Java program to append a text read from the user
// to an existing file without overwriting the original content

import java.io.FileWriter;
import java.util.Scanner;


public class AppendContent {
    public static void main(String[] args) {
        Scanner obj=new Scanner(System.in);
        System.out.println("Enter the text");
        String line=obj.nextLine();
        try
        {
            FileWriter FW=new FileWriter("output.txt",true);
            FW.write(line);
            FW.close();
            System.out.println("Successfully append");

        }
        catch (Exception e)
        {
            System.out.println("Exception occured");
        }

    }
}