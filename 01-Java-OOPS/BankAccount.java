// BankAccount represents a real-world bank account
// This class combines DATA (fields) + BEHAVIOR (methods)
// → This is the core idea of OOP

public class BankAccount {

    // 🔒 Fields are private to enforce ENCAPSULATION
    // No external class can directly modify them
    private String accountNumber;
    private String accountHolderName;
    private double balance;

    // ✅ Default constructor
    // Used when no initial data is provided
    // Balance starts from 0
    public BankAccount() {
        this.balance = 0.0;
    }

    // ✅ Parameterized constructor
    // Used when all details are known at object creation
    public BankAccount(String accountNumber, String accountHolderName, double balance) {
        this.accountNumber = accountNumber;
        this.accountHolderName = accountHolderName;
        this.balance = balance;
    }

    // ✅ Getter methods
    // Allow READ access but not direct modification
    public String getAccountNumber() {
        return accountNumber;
    }

    public String getAccountHolderName() {
        return accountHolderName;
    }

    public double getBalance() {
        return balance;
    }

    // ✅ Deposit method
    // Balance can only be increased via this method
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited: " + amount);
        } else {
            System.out.println("Deposit amount must be positive");
        }
    }

    // ✅ Withdraw method
    // Prevents withdrawing more than available balance
    public void withdraw(double amount) {
        if (amount <= 0) {
            System.out.println("Withdrawal amount must be positive");
        } else if (amount > balance) {
            System.out.println("Insufficient balance");
        } else {
            balance -= amount;
            System.out.println("Withdrawn: " + amount);
        }
    }

    // ✅ Method to display account details
    public void displayAccountDetails() {
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Account Holder: " + accountHolderName);
        System.out.println("Balance: " + balance);
        System.out.println("----------------------------");
    }
}

MAIN.JAVA 

// Main class is used to CREATE OBJECTS and TEST behavior
// Logic should NOT live here — only usage

public class Main {
    public static void main(String[] args) {

        // 🧱 Object created using parameterized constructor
        BankAccount account1 =
                new BankAccount("ACC101", "Sumit Shaw", 5000);

        // 🧱 Object created using default constructor
        BankAccount account2 = new BankAccount();

        // Operations on account1
        account1.deposit(2000);
        account1.withdraw(1000);
        account1.displayAccountDetails();

        // Operations on account2
        account2.deposit(1000);
        account2.withdraw(1500); // should fail
        account2.displayAccountDetails();
    }
}
