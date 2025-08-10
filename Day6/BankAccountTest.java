/*5. Design a class named BankAccount that uses the concept of encapsulation. The class should have the following private data members: account number, account holder name, and balance. Provide public getter and setter methods to access and modify these fields. Also, include a method to deposit and withdrawal of amount ensuring that the balance cannot go negative.*/


class BankAccount 
{

	private String accountNumber;
    private String accountHolderName;
    private double balance;

    public BankAccount(String accountNumber, String accountHolderName, double initialBalance)
    {
        this.accountNumber = accountNumber;
        this.accountHolderName = accountHolderName;
        this.balance = (initialBalance >= 0) ? initialBalance : 0;
    }
    public String getAccountNumber()
    {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber)
    {
        this.accountNumber = accountNumber;
    }

    public String getAccountHolderName()
    {
        return accountHolderName;
    }

    public void setAccountHolderName(String accountHolderName)
    {
        this.accountHolderName = accountHolderName;
    }

    public double getBalance()
    {
        return balance;
    }

    public void deposit(double amount)
    {
        if (amount > 0)
        {
            balance += amount;
            System.out.println("Deposited: " + amount);
        }
		else 
        {
            System.out.println("Invalid deposit amount.");
        }
    }

    
    public void withdraw(double amount)
    {
        if (amount > 0 && balance >= amount)
        {
            balance -= amount;
            System.out.println("Withdrawn: " + amount);
        }
		else 
        {
            System.out.println("Invalid amount.");
        }
    }

    public void displayAccountInfo()
    {
        System.out.println("Account Number     : " + accountNumber);
        System.out.println("Account Holder Name: " + accountHolderName);
        System.out.println("Current Balance    : " + balance);
    }
}

public class BankAccountTest 
{
	public static void main(String[] args) 
	{
        BankAccount account = new BankAccount("1234567890", "Akshayaa", 5000.00);

        account.displayAccountInfo();

        account.deposit(1500);
        account.withdraw(3000);
        account.withdraw(5000);
        System.out.println("\nAfter transactions:");
        account.displayAccountInfo();
    }
}

