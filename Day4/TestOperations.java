/*7. Design a calculator application using Java Inheritance.
‌
Create the following class hierarchy:
‌
--->BasicCalculator (Base class):
Implement at least three basic arithmetic methods, such as:
‌
--->add(int a, int b)
--->subtract(int a, int b)
--->multiply(int a, int b)
--->divide(int a, int b)
‌
--->AdvancedCalculator (Inherits from BasicCalculator):
Add 3 to 4 advanced mathematical operations, such as:
‌
--->power(int base, int exponent)
--->modulus(int a, int b)
--->squareRoot(double number)
‌
--->ScientificCalculator (Inherits from AdvancedCalculator):
Add scientific functions, such as:
‌
--->sin(double angle)
--->cos(double angle)
--->log(double value)
--->exp(double value)
* Demonstrate the use of inheritance by creating an object of ScientificCalculator and calling methods from all three levels of the class hierarchy.
* Use appropriate access specifiers and method overrides where required.
* Add a main() method to test all operations.*/


import java.util.Scanner;
class BasicCalculator
{
	public void add(int a, int b)
	{
		System.out.println(a+b);
	}
	public void subtract(int a, int b)
	{
		System.out.println(a-b);
	}
	public void multiply(int a, int b)
	{
		System.out.println(a*b);
	}
	public void divide(int a, int b)
	{
		System.out.println(a/b);
	}	
}


class AdvancedCalculator extends BasicCalculator
{
	public void power(int base, int exponent)
	{
		int powres = 1;
		for(int i = 1; i<=exponent; i++)	
		{
			powres *= base;
		}
		System.out.println(powres);
	}
	public void modulus(int a, int b)
	{
		System.out.println(a%b);
	}
	public void squareRoot(double number)
	{
		double start = 0;
		double end = number;

		

		double mid = 0;
		while((end-start) > 0.1)
		{
			mid = (start + end)/2;
			
			if(mid * mid < number)
			{
				start = mid;
			}
			else
			{
				end = mid;
			}
		}
		System.out.println(mid);
		 
	}

}

class ScientificCalculator extends AdvancedCalculator
{
	public int factorial(int x)
	{
		int fact = 1;
		for(int i =1; i<=x; i++)
		{
			fact *= i;
		}
		return fact;
	}
	public double Sin(double angle)
	{
		/*double temp = 1;
		int denominator = -1;
		
		if(angle == 0) return 0.0;
		if(angle !=0)
		{
			for(int i = 0; i<= angle; i++)
			{
				denominator +=2;
			}
		}
		return 0.0;*/
		
		return Math.sin(angle);
	}
	public double Cos(double angle)
	{
		return Math.cos(angle);
	}
	public double Log(double value)
	{
		return Math.log(value);
	}
	public double Exp(double value)
	{
		return Math.exp(value);
	}	
}

class TestOperations
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number: ");
		double num = sc.nextDouble();

		AdvancedCalculator obj = new AdvancedCalculator();
		obj.squareRoot(num);

		ScientificCalculator obj2 = new ScientificCalculator();
		int r = obj2.factorial(5);
		System.out.println(r);

		double sinVal = obj2.Sin(1);
		System.out.println("sinVal " + sinVal);

		double cosVal = obj2.Cos(1);
		System.out.println("cosVal "+cosVal);

		double logVal = obj2.Log(1);
		System.out.println("logVal "+ logVal);

		double expVal = obj2.Exp(1);
		System.out.println("ExpVal "+ expVal);

		System.out.println("Power: ");
		obj2.power(5, 2);
		System.out.println();

		System.out.println("Modulus: ");
		obj2.modulus(10, 3);
		System.out.println();

		System.out.println("Square Root: ");
		obj2.squareRoot(25);
		System.out.println();

		System.out.print("Add: ");
		obj2.add(25, 25);
		System.out.println();

		System.out.print("Subtract: ");
		obj2.subtract(25, 10);
		System.out.println();

		System.out.print("Multiply: ");
		obj2.multiply(11, 2);
		System.out.println();

		System.out.print("Divide: ");
		obj2.divide(3, 3);
		System.out.println();

	}

}


