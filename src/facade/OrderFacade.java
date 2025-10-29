package facade;

import builder.*;
import strategy.*;

// Facade that simplifies the ordering process
public class OrderFacade {
    private MealDirector mealDirector;       // uses Builder
    private PaymentStrategy paymentStrategy; // uses Strategy

    public OrderFacade(MealDirector mealDirector) {
        this.mealDirector = mealDirector;
    }

    // Allow the user to choose a payment method

    public void setPaymentMethod(PaymentStrategy paymentStrategy) {
        this.paymentStrategy = paymentStrategy;
    }

    // Simplified method to place an order

    public void placeOrder(double price) {
        System.out.println("\n--- Starting Order Process ---");

        // Step 1: Build the meal (Builder)
        ProductMeal meal = mealDirector.constructMeal();
        System.out.println("Meal prepared: " + meal);

        // Step 2: Process payment (Strategy)
        if (paymentStrategy != null) {
            paymentStrategy.pay(price);
        } else {
            System.out.println("No payment method selected!");
        }

        // Step 3: Delivery (simplified)
        System.out.println("Your order is on the way! 🍔🚗");

        System.out.println("--- Order Completed ---\n");
    }
}