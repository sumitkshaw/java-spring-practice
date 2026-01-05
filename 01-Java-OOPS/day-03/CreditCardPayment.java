// Concrete implementation of abstract class

public class CreditCardPayment extends Payment {

    public CreditCardPayment(double amount) {
        super(amount);
    }

    @Override
    public void makePayment() {
        System.out.println("Processing credit card payment of " + amount);
    }
}
