package strategy;

// Concrete strategy for cash payments
public class CashPayment implements PaymentStrategy {
    @Override
    public void pay(double amount) {
        System.out.println("Paid $" + amount + " in cash.");
    }
}
