import java.util.Scanner;
class MaxNumber{
	public static void main(String[] args){
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter Number 1: ");
	int num1 = sc.nextInt();
	System.out.println("Enter Number 2: ");
	int num2 = sc.nextInt();
	String result = num1>num2 ? "Maximum number is " + num1 : "Maximum number is " + num2;
	System.out.println(result);
}
}