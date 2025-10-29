// Concrete Strategy class in the Strategy design pattern.
// Implements the PaymentStrategy interface to define a specific payment method: cash.
// When executed, it processes a payment by simply printing a confirmation message to the console.
// Used by the context (e.g., OrderFacade) to handle payments flexibly without modifying client code.
package strategy;

// Concrete strategy for cash payments
public class CashPayment implements PaymentStrategy {
    @Override
    public void pay(double amount) {
        System.out.println("Paid $" + amount + " in cash.");
    }
}
