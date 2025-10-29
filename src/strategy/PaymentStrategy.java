// Strategy interface in the Strategy design pattern.
// Defines a common contract for all payment methods (e.g., Cash, Credit Card, PayPal).
// Each concrete strategy will implement the pay() method differently.
// This allows dynamic selection of payment behavior at runtime without changing the core logic.
package strategy;

// Strategy interface: defines the payment action
public interface PaymentStrategy {
    void pay(double amount);
}
