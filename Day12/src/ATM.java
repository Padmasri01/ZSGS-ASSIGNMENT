/*5.(2)Use Threads to implement the ATM, where you create threads to check the PIN, another thread to perform the cash withdrawal, another one to check the balance amount and print the receipt.*/

class CheckPIN extends Thread {
    public void run() {
        System.out.println("Checking PIN...");
        try {
            Thread.sleep(1000);
        }
        catch (InterruptedException e) {}
        System.out.println("PIN Verified.");
    }
}

class WithdrawCash extends Thread {
    public void run() {
        System.out.println("Withdrawing Cash...");
        try {
            Thread.sleep(1000);
        }
        catch (InterruptedException e) {}
        System.out.println("Cash Withdrawn.");
    }
}

class CheckBalance extends Thread {
    public void run() {
        System.out.println("Checking Balance...");
        try {
            Thread.sleep(1000);
        }
        catch (InterruptedException e) {}
        System.out.println("Balance Checked.");
    }
}

class PrintReceipt extends Thread {
    public void run() {
        System.out.println("Printing Receipt...");
        try {
            Thread.sleep(1000);
        }
        catch (InterruptedException e) {}
        System.out.println("Receipt Printed.");
    }
}

public class ATM {
    public static void main(String[] args) {
        try {
            CheckPIN t1 = new CheckPIN();
            WithdrawCash t2 = new WithdrawCash();
            CheckBalance t3 = new CheckBalance();
            PrintReceipt t4 = new PrintReceipt();

            t1.start();
            t1.join();

            t2.start();
            t2.join();

            t3.start();
            t3.join();

            t4.start();
            t4.join();

            System.out.println("Transaction Completed Successfully.");
        }
        catch (InterruptedException e) {
            System.out.println("ATM Process Interrupted.");
        }
    }
}

