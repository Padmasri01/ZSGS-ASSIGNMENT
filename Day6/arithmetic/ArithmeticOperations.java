/*2. Create a Java application that demonstrates the use of user-defined packages by organising classes based on their functionality:
--- arithmetic: This package should include a class that defines methods to perform the following operations on two numbers:
a. Addition
b. Subtraction
c. Multiplication
d. Division
e. Modulo
--- stringutils: This package should include a class that defines methods for:
a. Concatenating two strings
b. Reversing a string
c. Finding the length of a string
In your main class (outside those packages), import the above packages and demonstrate the usage of all the methods.*/

package arithmetic;
public class ArithmeticOperations 
{
	public int add(int a, int b) 
	    {
        	return a + b;
    	}
        public int subtract(int a, int b) 
	    {
        	return a - b;
    	}
        public int multiply(int a, int b) 
	    {
        	return a * b;
    	}
        public double divide(int a, int b) 
	    {
        	if (b != 0)
            		return (double) a / b;
        	else
            		throw new ArithmeticException("Division by zero not allowed.");
    	}

        public int modulo(int a, int b) 
	    {
        	return a % b;
    	}
}
