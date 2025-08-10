/*2. Design a Payment Gateway System using an interface named PaymentMethod with a method pay(double amount). Implement this interface in different classes like CreditCardPayment, DebitCardPayment, and UPIPayment. Write a main class where you can accept payment using different methods.*/


interface PaymentMethod
{
	void pay(double amount);
}

class CreditCardPayment implements PaymentMethod
{
	private String cardNumber;

	public CreditCardPayment(String cardNumber)
	{
		this.cardNumber = cardNumber;
	}
	public void pay(double amount)
	{
		System.out.println("Paid Rs." + amount + " using this credit card ending with " + cardNumber.substring(cardNumber.length()-4));
	}
}

class DebitCardPayment implements PaymentMethod
{
	private String cardNumber;

	public DebitCardPayment(String cardNumber)
	{
		this.cardNumber = cardNumber;
	}
	
	public void pay(double amount)
	{
		System.out.println("Paid Rs." + amount + " using this debit card ending with " + cardNumber.substring(cardNumber.length()-4));
	}

}

class UPIPayment implements PaymentMethod
{
	private String upiId;

	public UPIPayment(String upiId)
	{
		this.upiId = upiId;
	}

	public void pay(double amount)
	{
		System.out.println("Paid Rs." + amount + " using UPI ID: " + upiId);
	}

}

public class PaymentMethodTest
{
	public static void main(String[] args)
	{
		PaymentMethod credit = new CreditCardPayment("1234567890123456");
		credit.pay(1500);

	
		PaymentMethod debit = new DebitCardPayment("9876543210987654");
		debit.pay(3000);


		PaymentMethod upi = new UPIPayment("user@upi");
		upi.pay(1000);
	}
}