/*1. Illustrate the concept-Encapsulation with the Payment Gateway System.[The class should encapsulate private data members such as transaction ID, payer name, payee name, amount, payment method, and transaction status. Provide appropriate public getter and setter methods to access and modify these details securely. Also include a method to display the transaction summary.]*/

class PaymentGateway {
   
    private String transactionID;
    private String payerName;
    private String payeeName;
    private double amount;
    private String paymentMethod;
    private String transactionStatus;

    
    PaymentGateway(String transactionID, String payerName, String payeeName, double amount, String paymentMethod) {
        this.transactionID = transactionID;
        this.payerName = payerName;
        this.payeeName = payeeName;
        this.amount = amount;
        this.paymentMethod = paymentMethod;
        this.transactionStatus = "Pending"; 
    }

    
    public String getTransactionID() {
        return transactionID;
    }

    public void setTransactionID(String transactionID) {
        this.transactionID = transactionID;
    }

    public String getPayerName() {
        return payerName;
    }

    public void setPayerName(String payerName) {
        this.payerName = payerName;
    }

    public String getPayeeName() {
        return payeeName;
    }

    public void setPayeeName(String payeeName) {
        this.payeeName = payeeName;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        if (amount > 0) {
            this.amount = amount;
        }
    }

    public String getPaymentMethod() {
        return paymentMethod;
    }

    public void setPaymentMethod(String paymentMethod) {
        this.paymentMethod = paymentMethod;
    }

    public String getTransactionStatus() {
        return transactionStatus;
    }

    public void setTransactionStatus(String transactionStatus) {
        this.transactionStatus = transactionStatus;
    }

    
    public void displayTransactionSummary() {
        System.out.println("Transaction Summary");
        System.out.println("--------------------");
        System.out.println("Transaction ID   : " + transactionID);
        System.out.println("Payer Name       : " + payerName);
        System.out.println("Payee Name       : " + payeeName);
        System.out.println("Amount           : " + amount);
        System.out.println("Payment Method   : " + paymentMethod);
        System.out.println("Transaction Status: " + transactionStatus);
    }
}

public class PaymentGateWayTest 
{
    public static void main(String[] args) {
        PaymentGateway payment = new PaymentGateway("TXN12345", "Alice", "Bob", 1500.75, "UPI");
        payment.setTransactionStatus("Success");
        payment.displayTransactionSummary();
    }
}

