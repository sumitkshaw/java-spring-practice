// Abstract class defines WHAT must be done
// but not HOW it is done completely

public abstract class Payment {

    protected double amount;

    public Payment(double amount) {
        this.amount = amount;
    }

    // Abstract method
    // Child classes MUST implement this
    public abstract void makePayment();

    // Concrete method (common behavior)
    public void showAmount() {
        System.out.println("Payment Amount: " + amount);
    }
}
