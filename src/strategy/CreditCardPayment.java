// Concrete Strategy class in the Strategy design pattern.
// Implements the PaymentStrategy interface to handle payments made via credit card.
// Stores card details such as the card number and cardholder name.
// When pay() is called, it simulates processing a credit card transaction.
// Used by the context (e.g., OrderFacade) to allow flexible payment method selection.
package strategy;

// Concrete strategy for credit card payments
public class CreditCardPayment implements PaymentStrategy {
    private String cardNumber;
    private String cardHolder;

    public CreditCardPayment(String cardNumber, String cardHolder) {
        this.cardNumber = cardNumber;
        this.cardHolder = cardHolder;
    }

    @Override
    public void pay(double amount) {
        System.out.println("Paid $" + amount + " using Credit Card (" + cardHolder + ").");
    }
}