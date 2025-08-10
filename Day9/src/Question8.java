/*8. Design a login system that throws AuthenticationException if the username or password is incorrect. Handle it and
display a login failure message.*/

import javax.naming.AuthenticationException;
import java.util.Scanner;

public class Question8 {
    static final String name;
    static final String password;

    static
    {
        System.out.println("Create New Account");
        System.out.println("==================");
        Scanner obj=new Scanner(System.in);
        System.out.println("Enter the UserName");
        name=obj.nextLine();
        System.out.println("Enter your password");
        password=obj.nextLine();
        System.out.println("Register................");
    }
    public static void login() throws AuthenticationException{

        Scanner obj=new Scanner(System.in);
        System.out.println("Enter the UserName");
        String name1=obj.nextLine();
        System.out.println("Enter your password");
        String password1=obj.nextLine();
        if((name1.equals(name))&& password1.equals(password))
        {
            System.out.println("successfully login");
            System.out.println("Welcome!!!!!!!!!!!");
        }
        else
        {
            throw new AuthenticationException("Incorrect!!!!! please check username or password");
        }

    }
    public static void errorcheck() throws AuthenticationException {
        login();

    }
    public static void main(String[] args)
    {
        try
        {
            errorcheck();
        }
        catch ( AuthenticationException e)
        {
            System.err.println("Invalid password or username");
        }


    }
}
