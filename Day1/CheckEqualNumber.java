import java.util.Scanner;
class CheckEqualNumber{
	public static void main(String[] args){
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter Number1: ");
	int num1 = sc.nextInt();
	System.out.println("Enter Number1: ");
	int num2 = sc.nextInt();
	int result = num1 ^ num2;
	switch(result)
	{
	case 0: 
		System.out.println("Given numbers are equal." );
		break;
	default: 
		System.out.println("Given numbers are not equal.");
		break;
	}
	//System.out.println(result);	
	
}
}