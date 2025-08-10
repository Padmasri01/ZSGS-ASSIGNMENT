import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

//Write a Java program that reads a file and prints the number of lines, words, and characters
public class PrintCount {
    public static void main(String[] args) {
        try
        {

            int CharCount=0,WordsCount=0,LinesCount=0;

            FileReader FR2=new FileReader("ass.csv");

            BufferedReader BR=new BufferedReader(FR2);
            String line=BR.readLine();
            while (line!=null)
            {
                String arr[]=line.split(" " );
                LinesCount++;
                WordsCount+=arr.length;
                CharCount+=line.length();
                line=BR.readLine();
            }
            FR2.close();
            BR.close();
            System.out.println("Character Count : "+CharCount);
            System.out.println("Word Count : "+WordsCount);
            System.out.println("Line Count : "+LinesCount);
        }
        catch (Exception e)
        {
            e.printStackTrace();
            System.out.println("Error Occured");
        }
    }
}
