/* Question -> Write a java program to solve the banking problem. Create an abstract class Bank that declare account
name and balance as state, abstract methods deposit, withdraw and getBalance as behavior. */

// This is the Abstract class Bank
abstract class Bank {
    protected String accountName;
    protected double balance;

    public Bank(String accountName, double balance) {
        this.accountName = accountName;
        this.balance = balance;
    }

    public abstract void deposit(double amount);
    public abstract void withdraw(double amount);
    public abstract double getBalance();
}
