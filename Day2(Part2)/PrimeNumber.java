/*2. Write a program to take in 10 values and print only those numbers which are prime.*/
import java.util.Scanner;
class PrimeNumber
{
	public static void main(String[] args)
	{
		int[] arr = new int[10];
		Scanner sc = new Scanner(System.in);
		for(int i = 0; i<10; i++)
		{
			System.out.println("Enter number: " + (i+1));
			arr[i] = sc.nextInt();
		}
		System.out.println("Prime numbers are: ");
		
		for(int i = 0; i<10; i++)
		{
			if(isPrime(arr[i]))
			{
				System.out.println(arr[i]);
			}
		}
		
		 
	}
	static boolean isPrime(int num)
		{
			if(num<=1) return false;
			if(num==2) return true;
			for(int i=2; i<=num/2; i++)
			{
				if(num%i==0) return false;
				 
			}
			return true;
		}
}