/*3. Write a program which generates 30 terms of Fibonacci no in an array and then prints it.*/
class FibonacciSeries
{
	public static void main(String[] args)
	{
		int num = 30;
		int sum = 0;
		for(int i = 1; i<=num; i++)
		{
			System.out.println(fib(i));
		}
	}
	static int fib(int n)
		{
			if(n<=0) return 0;
			if(n==1) return 1;

            return fib(n-1)+fib(n-2);


		}
}