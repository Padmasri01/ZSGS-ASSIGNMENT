/*3. Write a program to illustrate how to throw a ClassNotFoundException.*/

public class Question3 {
    public static void main(String[] args) {
        try
        {
            Class.forName("ques");
        }
        catch (ClassNotFoundException e)
        {
            System.err.println("Class Not Fount Exception");

        }
        catch (Exception e)
        {
            System.err.println("Error Occured");
        }
    }
}
