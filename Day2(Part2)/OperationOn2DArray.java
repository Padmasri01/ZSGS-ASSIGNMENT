/*10. Write a menu driven program to do following operation on two dimensional array A of size m x n. You should use user-defined methods which accept 2-D array A, and its size m and n as arguments. The options are:
● To input elements into matrix of size m x n
● To display elements of matrix of size m x n
● Sum of all elements of matrix of size m x n
● To display row-wise sum of matrix of size m x n
● To display column-wise sum of matrix of size m x n
● To create transpose of matrix of size n x m*/

import java.util.Scanner;

class OperationOn2DArray
{
	static Scanner sc = new Scanner(System.in);
	public static void inputElements(int[][] arr, int m, int n)
	{
		for(int i = 0; i<m; i++)
		{
			for(int j = 0; j<n; j++)
			{
				arr[i][j] =sc.nextInt();
			}
		}
	}
	public static void displayElements(int[][] arr, int m, int n)
	{
		for(int i = 0; i<m; i++)
		{
			for(int j = 0; j<n; j++)
			{
				System.out.print(arr[i][j] + "\t");
			}
			System.out.println();
		
		}
	}
	public static void sumOfAllElements(int[][] arr, int m, int n)
	{
		int sum = 0;
		for(int i = 0; i<m; i++)
		{
			for(int j = 0; j<n; j++)
			{
				sum += arr[i][j];	
			}
				
		}
		System.out.println("Sum of all elements = "+ sum);
	}
	public static void rowWiseSum(int[][] arr, int m, int n)
	{
		
		for(int i = 0; i<m; i++)
		{
			int rowsum = 0;
			for(int j = 0; j<n; j++)
			{
				rowsum += arr[i][j];	
			}
			System.out.println("Sum of row " + (i+1) + " = " + rowsum);	
		}
		
	}
	public static void columnWiseElements(int[][] arr, int m, int n)
	{
		
		for(int j = 0; j<n; j++)
		{
			int colsum = 0;
			for(int i = 0; i<m; i++)
			{
				colsum += arr[i][j];	
			}
			System.out.println("Sum of column " + (j+1) + " = " + colsum);
				
		}
		
	}
	public static void tranposeArray(int[][] arr, int m, int n)
	{
		
		for(int i = 0; i<m; i++)
		{
			for(int j = 0; j<n; j++)
			{
				System.out.print(arr[j][i] + "\t");	
			}
			System.out.println();	
		}
		
	}
	
	public static void main(String[] args)
	{
        	Scanner sc = new Scanner(System.in);
        	int m, n;
        	System.out.print("Enter number of rows: ");
        	m = sc.nextInt();
        	System.out.print("Enter number of columns: ");
        	n = sc.nextInt();

        	int[][] A = new int[m][n];
        	int choice;

        	do 
		{
            		System.out.println("\n==== MENU ====");
            		System.out.println("1. Input elements");
            		System.out.println("2. Display matrix");
           		System.out.println("3. Sum of all elements");
            		System.out.println("4. Row-wise sum");
            		System.out.println("5. Column-wise sum");
            		System.out.println("6. Transpose matrix");
            		System.out.println("7. Exit");
            		System.out.print("Enter your choice (1-7): ");
            		choice = sc.nextInt();

            		switch (choice) 
			{
                		case 1:
                    			inputElements(A, m, n);
                    			break;
                		case 2:
                    			displayElements(A, m, n);
                    			break;
                		case 3:
                    			sumOfAllElements(A, m, n);
                    			break;
                		case 4:
                    			rowWiseSum(A, m, n);
                    			break;
                		case 5:
                    			columnWiseElements(A, m, n);
                    			break;
                		case 6:
                    			tranposeArray(A, m, n);
                    			break;
                		case 7:
                    			System.out.println("Exiting program.");
                    			break;
                		default:
                    			System.out.println("Invalid choice! Please try again.");
            		}
        	} while (choice != 7);

        	sc.close();
	}
}