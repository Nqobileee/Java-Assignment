/*  This segment is a class Account that extends the abstract Bank. */

import java.io.FileWriter; // To help with writing characters into the file
import java.io.IOException; // To help with input and output
import java.io.PrintWriter; // For formatted text

class Account extends Bank {
    private static final String FILE_NAME = "Bank.txt";

    public Account(String accountName, double balance) {
        super(accountName, balance);
    }

    public void deposit(double amount) {
        if (amount > (double)0.0F) {
            this.balance += amount;
            System.out.println(amount + " deposited. New balance: " + this.balance);
            this.recordTransaction("Deposit", amount);
        } else {
            System.out.println("Deposit amount must be greater than 0!");
        }

    }

    public void withdraw(double amount) {
        if (amount > (double)0.0F) {
            if (amount <= this.balance) {
                this.balance -= amount;
                System.out.println(amount + " withdrawn. New balance: " + this.balance);
                this.recordTransaction("Withdraw", amount);
            } else {
                System.out.println("The withdrawal amount has exceeded account balance");
            }
        } else {
            System.out.println("The withdrawal amount must be greater than 0!");
        }

    }

    public double getBalance() {
        return this.balance;
    }

    private void recordTransaction(String type, double amount) {
        try (
                FileWriter fw = new FileWriter("Bank.txt", true);
                PrintWriter pw = new PrintWriter(fw);
        ) {
            pw.println(type + ": " + amount + ", Account: " + this.accountName + ", Balance: " + this.balance);
        } catch (IOException e) {
            System.out.println("There was an error recording your transaction: " + e.getMessage());
        }

    }
}
