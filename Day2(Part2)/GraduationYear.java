/*6. Write a program to accept the year of graduation from school as an integer value from the users . Using the Binary search technique on the sorted array of integers given below . Output the message “record exists" if the value input is located in the array and if not output the message record does not exits”.
{1982, 1987, 1993, 1996, 1999, 2003, 2006, 2007, 2009, 2010, 2016, 2002}*/
import java.util.Scanner;
import java.util.ArrayList;
class GraduationYear
{
	public static void main(String[] args)
	{	
		int[] arr = new int[]{1982, 1987, 1993, 1996, 1999, 2003, 2006, 2007, 2009, 2010, 2016, 2020};
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the year of graduation: ");
		int year = sc.nextInt();
		int left = 0;
		int right = arr.length-1;
		boolean result = false;
		
		while(left<=right)
		{
			int mid = left + (right - left)/2;
			if(arr[mid]==year){
				result = true;
				break;
			}
			else if(year>arr[mid])
			{
				left = mid +1;
			}
			else if(year<arr[mid])
			{
				right = mid - 1;
			}
		}
		if(result)
		{
			System.out.println("Record exists");
		}
		else{
			System.out.println("Record does not exists");
		}
						
	}
}