import java.util.Scanner;
class PowerOfTwo{
	public static void main(String[] args){
	Scanner sc  = new Scanner(System.in);
	System.out.println("Enter a number");
	int num = sc.nextInt();

	if(num>0 &&(num & (num-1))==0){
		System.out.println("Given number is power of two");
	}
	else{	
		System.out.println("Given number is not a power of two");
	}
	
}
}