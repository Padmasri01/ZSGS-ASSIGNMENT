/*8. Write a program which takes in 10 people’s age and gives number of people who are <18, 18-60, >60.*/
import java.util.Scanner;
class PeopleCount
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter no. of persons: ");
		int size = sc.nextInt();
		int[] arr = new int[size];
		int count1 = 0;
		int count2 = 0;
		int count3=0;
		for(int i = 0; i<size; i++)
		{
			arr[i] = sc.nextInt();
		}
		for(int i = 0; i<size; i++)
		{
			if(arr[i]>0 && arr[i]<18)
			{
				count1++;
			}
			else if(arr[i]>=18 && arr[i]<=60)
			{
				count2++;
			}
			else
			{
				count3++;
			}
		}
		System.out.println("Count of people whose age is less than 18 is: " + count1);
		System.out.println("Count of people whose age is greater than or equal to 18 and less than or equal to 60 is: " + count2);
		System.out.println("Count of people whose age is greater than 60 is: " + count3);
	
	
		
		
	}	
}