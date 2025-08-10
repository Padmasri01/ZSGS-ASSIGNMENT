/*9. Write an array which takes in roll no and marks in 3 subjects for 10 students. Format and Print the roll no, total marks and average for all students in a table form.*/
import java.util.Scanner;
import java.util.Arrays;
class Student
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter no.of rows: ");
		int rows = sc.nextInt();
		System.out.println("Enter no. of columns: ");
		int columns = sc.nextInt();
		int[][] arr = new int[rows][columns];
		for(int i = 0; i<rows; i++)
		{
			System.out.println("Enter Roll Number " + (i+1));
			for(int j=0; j<columns; j++){
				arr[i][j] = sc.nextInt();
			}
		}
		for (int i = 0; i < rows; i++)
		{
            for (int j = 0; j < columns; j++)
		  	{
                  System.out.print(arr[i][j] + " ");
              }
            		System.out.println(); 
        }
		
		
		float avg = 0;
		
		System.out.printf("%-10s%-15s%-15s\n ", "Roll No.", "Total", "Average");
		System.out.println();
		for(int i = 0; i<rows; i++)
		{
			int r = arr[i][0];
			int total = 0;
			for(int j = 1; j< columns; j++)
			{
				total += arr[i][j];
			}
			
			avg = (float) total/(columns-1);
			System.out.printf("%-10d%-15d%-15.2f\n",r,total,avg);
			//System.out.print("Average: "+ avg);	
		}
		sc.close();
		
	}
}