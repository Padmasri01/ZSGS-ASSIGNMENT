import java.util.Scanner;
class FirstSetBit{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number:");
		int num = sc.nextInt();
		String result = "";
		while(num>0)
		{
			int rem = num%2;
			result = rem + result;
			num = num/2;
		}
		int position = 1;
		for(int i = result.length()-1; i>=0; i--)
		{
			
			if(result.charAt(i)=='1')
			{
				
				System.out.println(position);
				return;
			}
			position++;
		}
		 System.out.println("No set bit found");
	}
}