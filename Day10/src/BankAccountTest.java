import java.util.ArrayList;

/*8. Develop a Java program to manage a list of bank accounts using ArrayList.
--->Create an Account class with the following attributes:
        a. accountNumber (int)
b. holderName (String)
c. balance (double)
--->Use auto-boxing to store the balance and interest as Double wrapper objects.
--->Use manual boxing to convert a primitive interest rate into a Double object.
--->Unbox the values (both automatic and manual) to calculate and update the new balance.
--->Add at least three Account objects to an ArrayList<Account>.
--->For each account:
a. Display the holder name, account number, original balance
b. Apply 5% interest
c. Show the new balance using primitive values (unboxed).*/
class Account{
    int accountNumber;
    String holderName;
    Double balance;

    Account(int accountNumber, String holderName, double balance)
    {
        this.accountNumber = accountNumber;
        this.holderName =holderName;
        this.balance = balance;
    }

    public void applyInterest(Double interestRate){
        double updatedBalance = balance + (balance * interestRate/100);
        balance = updatedBalance;

    }

    public void display(){
        System.out.println("Account holder: " + holderName);
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Current Balance: " + balance.doubleValue());
    }
}
public class BankAccountTest {
    public static void main(String[] args) {
        double rate = 5;
        Double interestRate = Double.valueOf(rate);

        ArrayList<Account> accounts = new ArrayList<>();

        accounts.add(new Account(101, "Akshayaaa", 10000));
        accounts.add(new Account(102, "Vasunthra", 20000));
        accounts.add(new Account(103, "Sri", 30000));

        for (Account acc : accounts) {
            System.out.println("Before Interest:");
            acc.display();

            acc.applyInterest(interestRate);

            System.out.println("After Applying 5% Interest:");
            acc.display();
        }
    }
}
