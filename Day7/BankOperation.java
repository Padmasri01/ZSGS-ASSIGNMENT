/*1. All the banks operating in India are controlled by the RBI. RBI has set a well defined guideline (e.g. minimum interest rate, minimum balance allowed, maximum withdrawal limit etc) which all banks must follow. For example, suppose RBI has set the minimum interest rate applicable to a saving bank account to be 4% annually; however, banks are free to use the 4% interest rate or to set any rates above it.
Write a program to implement bank functionality in the above scenario. Note: Create few classes namely Customer, Account, RBI (Base Class) and few derived classes (SBI, ICICI, PNB etc). Assume and implement required member variables and methods in each class.
Hint:
class Customer
{
//Personal Details ...
// Few functions ...
}
class Account
{
// Account Detail ...
// Few functions ...
}
abstract class RBI
{
Customer c; //hasA relationship
Account a; //hasA relationship
..
public abstract double getInterestRate();
public abstract double getWithdrawalLimit();
}
class SBI extends RBI
{
//Use RBI functionality or define own functionality.
}
class ICICI extends RBI
{
//Use RBI functionality or define own functionality.
}*/


class Customer 
{
	private String name;
    	private String aadhaar;

    	public Customer(String name, String aadhaar) 
	{
        	this.name = name;
        	this.aadhaar = aadhaar;
    	}

    	public void displayCustomerInfo() 
	{
        	System.out.println("Customer Name : " + name);
        	System.out.println("Aadhaar No    : " + aadhaar);
    	}
}
class Account 
{
	private String accNumber;
    	private double balance;

    	public Account(String accNumber, double balance) 
	{
        	this.accNumber = accNumber;
        	this.balance = balance;
    	}

    	public String getAccNumber() 
	{
       		return accNumber;
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
            		System.out.println("Deposited :" + amount);
        	}
    	}

    	public void withdraw(double amount) 
	{
        	if (amount <= balance)
		{
            		balance -= amount;
            		System.out.println("Withdrawn :" + amount);
        	}
	 	else 
		{
            		System.out.println("Insufficient balance!");
        	}
    	}

    	public void displayAccountInfo() 
	{
        	System.out.println("Account Number: " + accNumber);
        	System.out.println("Balance       : " + balance);
    	}
}


abstract class RBI 
{
	protected Customer customer;
	protected Account account;

    	public RBI(Customer c, Account a) 
	{
        	this.customer = c;
        	this.account = a;
    	}

    	public abstract double getInterestRate();      
    	public abstract double getWithdrawalLimit();    
	
	public void withdraw(double amount) 
	{
        	if (amount > getWithdrawalLimit()) 
		{
            		System.out.println("Withdrawal amount exceeds the bank's limit of " + getWithdrawalLimit());
        	}
		else if (amount > account.getBalance()) 
		{
            		System.out.println("Insufficient balance!");
        	}
		else
		{
            		account.withdraw(amount);
        	}
    	}

    	public void showDetails() 
	{
        	System.out.println("------ Customer Info ------");
        	customer.displayCustomerInfo();
        	System.out.println("------ Account Info -------");
        	account.displayAccountInfo();
        	System.out.println("Interest Rate    : " + getInterestRate() + "%");
        	System.out.println("Withdrawal Limit : " + getWithdrawalLimit());
    	}
}


class SBI extends RBI 
{
	public SBI(Customer c, Account a) 
	{
        	super(c, a);
    	}

    	public double getInterestRate() 
	{
        	return 4.5; 
	}

    	public double getWithdrawalLimit() 
	{
        	return 50000; 
    	}
}

class ICICI extends RBI 
{    
	public ICICI(Customer c, Account a) 
	{
        	super(c, a);
    	}

    	public double getInterestRate() 
	{
        	return 5.0;
        }

    	public double getWithdrawalLimit() 
	{
        	return 75000; 
    	}
}


public class BankOperation
{
	public static void main(String[] args) 
	{
        	Customer customer1 = new Customer("Ravi Kumar", "1234-5678-9101");
        	Account account1 = new Account("SBI1001", 100000);

        	RBI sbiBank = new SBI(customer1, account1);
        	sbiBank.showDetails();

        	System.out.println("\nPerforming deposit and withdrawal:");
        	account1.deposit(5000);
        	account1.withdraw(30000);
        	account1.withdraw(70000); 

        	System.out.println("\nUpdated Account Info:");
        	account1.displayAccountInfo();


	        Customer iciciCustomer = new Customer("Priya Sharma", "9876-5432-1010");
        	Account iciciAccount = new Account("ICICI2002", 150000);
        	RBI iciciBank = new ICICI(iciciCustomer, iciciAccount);

        	System.out.println("\n========= ICICI BANK =========");
        	iciciBank.showDetails();

        	System.out.println("\n--- ICICI Transactions ---");
        	iciciAccount.deposit(10000);
        	iciciBank.withdraw(60000); 
       		iciciBank.withdraw(80000); 

        	System.out.println("\nUpdated ICICI Account Info:");
        	iciciAccount.displayAccountInfo();
    
    }
}





