/*6. Write a Java program to accept a 4-digit ATM PIN from the user and validate whether it meets the following
        conditions:
        --->It must be exactly 4 digits long.
        --->It should contain only numeric characters.
        --->It must not start with 0.
        Display an appropriate message whether the PIN is valid or invalid.*/


import java.util.Scanner;

public class Question6 {

    public static void pinCheck() {
        Scanner obj = new Scanner(System.in);
        System.out.print("Enter the PIN: ");
        String pin = obj.nextLine();

        if (pin.length() == 4 && pin.matches("\\d{4}") && pin.charAt(0) != '0') {
            System.out.println("Valid PIN");
        } else {
            System.err.println("Invalid PIN! Please enter a correct 4-digit PIN that does not start with 0.");
        }
    }

    public static void main(String[] args) {
        pinCheck();
    }
}
