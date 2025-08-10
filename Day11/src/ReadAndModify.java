/*
* Write a Menu driven Java program a) to read content from the user and write it into another file and b) from the file
to another file c) to modify the content of a file d) to search for a particular word in a file and display how many times it
appears e) read the content(List of Electronic Products) of a .txt file and copy them to the .csv file.*/

import java.util.Scanner;
import java.io.*;
public class ReadAndModify {
    public static void main(String[] args)
    {
        System.out.println("1. To Read content from the user and write a file");
        System.out.println("2. Copy to another file");
        System.out.println("3. Modify the content of file");
        System.out.println("4. Search word and how many time its appears");
        System.out.println("5. Read Electronic Products from .txt and write to .csv ");

        Scanner obj=new Scanner(System.in);
        System.out.println("Enter the choice");
        int choice=obj.nextInt();

        switch (choice)
        {
            case 1:
                obj.nextLine();
                System.out.println("Enter the content");
                String userInput=obj.nextLine();
                try {
                    FileWriter FW = new FileWriter("menudriven.txt");
                    FW.write(userInput);
                    FW.close();
                }
                catch (Exception e)
                {
                    System.out.println("Exception occur");
                }
                break;
            case 2:
                try
                {
                    FileReader FR=new FileReader("menudriven.txt");
                    int c=FR.read();
                    FileWriter fileWrite=new FileWriter("copymenudriven.txt");
                    while(c!=-1)
                    {
                        fileWrite.write((char)c);
                        c=FR.read();
                    }
                    fileWrite.close();
                    FR.close();
                    System.out.println("Successfully copied");
                }
                catch (Exception e)
                {
                    System.out.println("Exception occur");
                }

                break;
            case 3:
                try
                {
                    FileWriter fileWrite=new FileWriter("menudriven.txt",true);
                    fileWrite.write("\nModifying content");
                    fileWrite.close();
                    System.out.println("Successfully Modified");
                }
                catch (Exception e)
                {
                    System.out.println("Exception occur");
                }
                break;
            case 4:
                System.out.println("Enter the filename : ");
                obj.nextLine();
                String fileName=obj.nextLine();
                System.out.println("Enter the Search word : ");
                String searchword=obj.nextLine();
                try
                {
                    int count=0;
                    FileReader FR=new FileReader(fileName);
                    BufferedReader BR=new BufferedReader(FR);
                    String line=BR.readLine();
                    while (line!=null)
                    {
                        String arr[]=line.split(" ");
                        for(String a:arr)
                        {
                            if(a.toLowerCase().equals(searchword.toLowerCase()))
                                count++;
                        }
                        line=BR.readLine();

                    }
                    FR.close();
                    BR.close();
                    System.out.println(searchword+" is appeared in "+count+" times");

                }
                catch(Exception e)
                {
                    System.out.println("Error occured");
                }

                break;
            case 5:
                try
                {
                    FileWriter FRcsv=new FileWriter("ass.csv",true);
                    FileWriter FRele=new FileWriter("ele.txt",true);
                    FRele.write("Fridge\n");
                    FRele.write("TV\n");
                    FRele.write("Mobile\n");
                    FRele.write("Fan\n");
                    FRele.write("Washing machine\n");
                    FileReader FReler=new FileReader("ele.txt");
                    BufferedReader BRele1=new BufferedReader(FReler);
                    String line=BRele1.readLine();
                    while(line!=null)
                    {
                        FRcsv.write(line+"\n");
                        line=BRele1.readLine();
                    }
                    FRcsv.close();
                    FRele.close();
                    FReler.close();
                    BRele1.close();
                    System.out.println("Successfully copied to csv file");



                }
                catch (Exception e)
                {
                    e.printStackTrace();
                }
                break;

        }

    }
}
