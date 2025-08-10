/*1. Write a Java program to read the contents of a text file and display it on the console.*/
import java.io.*;
public class ReadContent {
    public static void main(String[] args) {
        try {
            FileWriter fw = new FileWriter("output.txt", true);
//            fw.write("hiiiiii fghjkl; kl; fghjkl;");
            fw.write("hello world");
            fw.close();
            FileReader fr=new FileReader("output.txt");
            int c=fr.read();
            while(c!=-1)
            {
                System.out.print((char)c);
                c=fr.read();
            }
        } catch (Exception e) {
            System.out.println(e);
        }

    }
}
