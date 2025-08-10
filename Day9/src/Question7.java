/*7. Write a Java program that shows exception propagation across multiple methods (method1 calls method2 calls
        method3, which throws the exception). Handle the exception in method1.*/

public class Question7 {
    public static void meth1()
    {
        System.out.println("Method -- 1");
        meth2();
    }
    public static void meth2()
    {
        System.out.println("Method -- 2");
        meth3();
    }
    public static void meth3()
    {
        System.out.println("Method -- 3");
        meth4();
    }
    public static void meth4()
    {
        try {
            int result = 10 / 0;
            System.out.println(result);
        }
        catch (ArithmeticException e)
        {
            System.err.println("Error Occured");
        }
    }

    public static void main(String[] args) {
        meth1();
    }
}