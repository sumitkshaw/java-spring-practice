// SavingsAccount IS-A Account
// Inherits properties and behavior from Account
// child account 

public class SavingsAccount extends Account {

    public SavingsAccount(String accountNumber, double balance) {
        // super keyword calls parent constructor
        super(accountNumber, balance);
    }

    // Method OVERRIDING
    // Runtime Polymorphism happens here
    @Override
    public void calculateInterest() {
        System.out.println("Savings Account Interest: 4%");
    }
}
