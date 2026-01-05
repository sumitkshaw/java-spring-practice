// Another child class of Account

public class CurrentAccount extends Account {

    public CurrentAccount(String accountNumber, double balance) {
        super(accountNumber, balance);
    }

    @Override
    public void calculateInterest() {
        System.out.println("Current Account has no interest");
    }
}


// MAIN JAVA 
public class Main {

    public static void main(String[] args) {

        // 🔥 Upcasting
        // Parent reference holding child object
        Account acc1 = new SavingsAccount("SAV101", 5000);
        Account acc2 = new CurrentAccount("CUR201", 10000);

        // Same method call
        // Different behavior at RUNTIME
        acc1.calculateInterest(); // SavingsAccount version
        acc2.calculateInterest(); // CurrentAccount version

        acc1.deposit(1000);
        acc1.showBalance();
    }
}
