/*7. Write a program to input and store the weight of ten people. Sort and display them in descending order using the Selection sort technique*/
import java.util.Scanner;
class FindWeight
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int[] arr = new int[10];
		for(int i =0; i<10; i++)
		{
			arr[i] = sc.nextInt();
		}
		
		int size = arr.length;
		int maxValue = 0;
		int temp = 0;
		for(int i = 0; i<size-1; i++)
		{
			maxValue = i;
			for(int j = i+1; j<size; j++ )
			{
				if(arr[maxValue]<arr[j])
				{
					maxValue = j;
				}
			
			}
			temp = arr[maxValue];
			arr[maxValue] = arr[i];
			arr[i] = temp;
		}
		System.out.println("Weight of people in descending order: ");
		for(int aa : arr)
		{
			System.out.print(aa + " ");
		}
		
 	}	
}
