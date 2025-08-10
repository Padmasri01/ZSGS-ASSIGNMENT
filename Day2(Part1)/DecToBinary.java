import java.util.Scanner;
class DecToBinary{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number: ");
		int num = sc.nextInt();
		String result = "";
		if(num==0){

		}
		while(num>0)
		{
			int n = num%2;
			result = n+result;
			num = num/2;
		}
		System.out.println(result);
	}
}