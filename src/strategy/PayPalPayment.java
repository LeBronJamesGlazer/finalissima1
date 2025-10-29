// Concrete Strategy class in the Strategy design pattern.
// Implements the PaymentStrategy interface to process payments via PayPal.
// Stores the user's email address used for PayPal transactions.
// When pay() is called, it simulates sending a payment through the specified PayPal account.
// Provides flexibility for clients to switch between different payment methods at runtime.
package strategy;

// Concrete strategy for PayPal payments
public class PayPalPayment implements PaymentStrategy {
    private String email;

    public PayPalPayment(String email) {
        this.email = email;
    }

    @Override
    public void pay(double amount) {
        System.out.println("Paid $" + amount + " using PayPal account: " + email);
    }
}