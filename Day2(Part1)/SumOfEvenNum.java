import java.util.Scanner;
class SumOfEvenNum{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number");
		int num = sc.nextInt();
		int result = 0;
		if(num>0)
		{
			for(int i = 0; i<=num; i++)
			{
				if(i%2==0)
				{
					result += i;
				}
				else{
					continue;
				}
			}
		}
		System.out.println(result);
	}
}