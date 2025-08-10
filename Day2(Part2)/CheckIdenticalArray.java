/*5. Write a program to initialize the following character arrays and print a suitable message after checking the arrays whether the two arrays are identical or not. Make suitable use of Boolean data type. X[] =('m', 'n', 'o', 'p'} and Y[] =('m', 'n', 'o', 'p' }
X[] =('m', 'n', 'o', 'p'} and
Y[] =('m', 'n', 'o', 'p' }*/
import java.util.Scanner;
class CheckIdenticalArray
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of the array1:");
		int size1 = sc.nextInt();
		
		char[] X = new char[size1];
		for(int i = 0; i<size1; i++)
		{
			System.out.println("Enter character " + (i+1));
			X[i] = sc.next().charAt(0);
		}
		System.out.println("Enter the size of the array2:");
		
		int size2 = sc.nextInt();
		char[] Y = new char[size2];
	
		for(int i = 0; i<size2; i++)
		{
			System.out.println("Enter character " + (i+1));
			Y[i] = sc.next().charAt(0);
		}
		if(check(X, Y,size1, size2))
		{
			System.out.println("Given arrays are identical");
		}
		else{
			System.out.println("Given arrays are not identical");
		}
		
	}
	static boolean check(char[] arr1, char[] arr2, int size1, int size2)
	{
		if(size1!= size2) return false;
		for(int i = 0; i<size1; i++)	
		{			
			if(arr1[i]!=arr2[i]) return false;
		
		}
		return true;
	}
}