/*1. Write a program that creates an integer array of 10 elements, accepts values of arrays and Find the sum of all odd numbers.*/
import java.util.Scanner;
class SumOfOddNumbers
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int[] arr = new int[10];
		int sum = 0;
		for(int i = 0; i<10; i++)
		{
			System.out.println("Enter number " + (i+1));
			arr[i] = sc.nextInt();	
		}
		for(int a : arr)
		{
			if(a%2!=0)
			{
				sum += a;
			}
			
		}
		System.out.println("Sum of all odd numbers: " + sum);
		
		
	}
}