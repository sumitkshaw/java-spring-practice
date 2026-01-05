// Parent class
// Represents common behavior for all account types

public class Account {

    protected String accountNumber;
    protected double balance;

    public Account(String accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    // Common method
    public void deposit(double amount) {
        balance += amount;
        System.out.println("Deposited: " + amount);
    }

    // This method will be OVERRIDDEN by child classes
    public void calculateInterest() {
        System.out.println("Generic account interest");
    }

    public void showBalance() {
        System.out.println("Balance: " + balance);
    }
}
