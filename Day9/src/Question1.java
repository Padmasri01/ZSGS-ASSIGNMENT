/*1. int[] arr = {2, 5, 1, 4, 0, 7};
int quotient = arr[7] / arr[4];
Develop a Java program which handles any unexpected situations that may arise during execution.*/

public class Question1 {
    public static void main(String[] args) {
        int[] arr={2,5,2,4,0,7};
        try
        {
            int quotient=arr[7]/arr[4];
        }
        catch(ArrayIndexOutOfBoundsException e)
        {
            System.err.println("Array index out of bound");
        }
        catch(ArithmeticException e)
        {
            System.err.println("Arithmetic Exception");
        }
        catch (Exception e)
        {
            System.err.println("Exception catched please check!.");
        }
    }
}
