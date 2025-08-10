/*9. Create a method to read a file from disk. Handle FileNotFoundException and IOException using try-catch-finally*/

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Question9 {
    public static void main(String[] args) {
        BufferedReader BR=null;
        try
        {
            FileReader FRR=new FileReader("errch.txt");
            BR=new BufferedReader(FRR);
            String line= BR.readLine();
            while(line!=null)
            {
                line= BR.readLine();
            }

        }
        catch (FileNotFoundException e)
        {
            System.err.println("File Not Found Exception");
        }
        catch(IOException e)
        {
            System.err.println("fill is empty");
        }
        finally {
            try
            {
                if(BR!=null)
                {
                    BR.close();
                }
            } catch (IOException e) {
                System.err.println("Error occured");
            }
        }
    }
}
