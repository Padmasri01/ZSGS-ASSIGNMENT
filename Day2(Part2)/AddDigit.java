/*4. Design a function void print( ) with a single dimensional array x[ ] and n (as size of the array) as function arguments. The function calculates sum of only single digit and sum of only double digit elements from the array. Design a main() function to input size of the array ‘len' and single dimensional array of size 'len', and print the required result by invoking the function print( ).*/
import java.util.Scanner;
class AddDigit
{
	static void print(int[] arr, int n)
	{
		int sum1 = 0;
		int sum2 = 0;
		for(int i=0; i<n; i++)
		{
			
			if(arr[i]>=0 && arr[i]<=9)
			{
				sum1 += arr[i];
			}
			if(arr[i]>9 && arr[i]<100)
			{
				sum2 += arr[i];
			}
		}
		System.out.println("Sum of single digit elements: " + sum1);
		System.out.println("Sum of double digit elements: " + sum2);
	}
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of the array: ");
		int size = sc.nextInt();
		int[] arr1 = new int[size];
		for(int i = 0; i<size; i++)
		{
			arr1[i] = sc.nextInt();
		}
		print(arr1, size);
	}
	
}