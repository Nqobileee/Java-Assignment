//Create another class AccountTest to test the with draw, deposit and getBalance methods. [25]

// Class to test the Account functionality
public class AccountTest {
    public static void main(String[] args) {
        Account acc = new Account("Edith Muyambiri", 1000);

        System.out.println("The Initial Balance: " + acc.getBalance());

        // This part tests deposit
        acc.deposit(500);   // To check Valid deposit
        acc.deposit(-100);  // To check Invalid deposit

        // This part tests withdraw
        acc.withdraw(300);  // To check Valid withdrawal
        acc.withdraw(1500); // To check Exceeds balance
        acc.withdraw(-50);  // To check Invalid withdrawal

        // To display final balance
        System.out.println("Your Final Balance: " + acc.getBalance());
    }
}
