import arithmetic.ArithmeticOperations;
import stringutils.StringOperations;

public class Main 
{
	public static void main(String[] args) 
	{
                ArithmeticOperations obj = new ArithmeticOperations();
        	int a = 15, b = 4;

        	System.out.println("Arithmetic Operations:");
        	System.out.println("Addition: " + obj.add(a, b));
        	System.out.println("Subtraction: " + obj.subtract(a, b));
        	System.out.println("Multiplication: " + obj.multiply(a, b));
        	System.out.println("Division: " + obj.divide(a, b));
        	System.out.println("Modulo: " + obj.modulo(a, b));

     
        	StringOperations obj2 = new StringOperations();
       		String str1 = "Hello";
        	String str2 = "World";

       		 System.out.println("\nString Operations:");
        	System.out.println("Concatenation: " + obj2.concatenate(str1, str2));
        	System.out.println("Reversed: " + obj2.reverse(str1));
        	System.out.println("Length: " + obj2.length(str2));
    }
}
