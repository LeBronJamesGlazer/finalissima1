// Main application entry point.
// Demonstrates the integration of multiple design patterns (Builder, Factory, Decorator, Strategy, Observer, Facade)
// in an Online Food Ordering System.
// The system flow:
// 1. Factory selects the appropriate MealBuilder type.
// 2. Builder constructs a full meal (main dish, drink, dessert).
// 3. Decorator dynamically adds extra toppings and calculates total cost.
// 4. Strategy defines the chosen payment method.
// 5. Facade simplifies the overall ordering process.
// 6. Observer notifies customers about order status updates.
// This class serves as the orchestrator that ties all design patterns together.

import builder.*;
import factory.*;
import strategy.*;
import decorator.*;
import observer.*;
import facade.*;

public class Main {
    public static void main(String[] args) {

        System.out.println("=== 🍔 ONLINE FOOD ORDERING SYSTEM ===");

        // 1 Factory — create the appropriate meal builder
        MealBuilderFactory builderFactory = new SimpleMealBuilderFactory();
        BInterfaceMealBuilder builder = builderFactory.createMealBuilder("burger");

        // 2 Builder — construct a complete meal (main dish + drink + dessert)
        MealDirector director = new MealDirector(builder);
        ProductMeal meal = director.constructMeal();
        System.out.println("\n[Builder] Meal constructed: " + meal);

        // 3 Decorator — dynamically add extra toppings
        FoodItem decoratedMeal = new BasicMeal(meal.toString(), 8.99);
        decoratedMeal = new CheeseDecorator(decoratedMeal);
        decoratedMeal = new BaconDecorator(decoratedMeal);
        System.out.println("\n[Decorator] Customized meal: " + decoratedMeal.getDescription());
        System.out.println("[Decorator] Total price: $" + decoratedMeal.getCost());

        // 4 Strategy — select a payment method
        PaymentStrategy payment = new CreditCardPayment("1234-5678-9999", "Kazbek Akhmetov");

        // 5 Facade — simplify the ordering process (uses Builder + Strategy)
        OrderFacade orderFacade = new OrderFacade(director);
        orderFacade.setPaymentMethod(payment);
        orderFacade.placeOrder(decoratedMeal.getCost());

        // 6 Observer — notify customers when order status changes
        OrderStatus orderStatus = new OrderStatus();
        Customer user1 = new Customer("LAMEKazbek");
        Customer user2 = new Customer("GOATDARYN");
        orderStatus.addObserver(user1);
        orderStatus.addObserver(user2);

        // Simulate order progress updates
        orderStatus.setStatus("Cooking");
        orderStatus.setStatus("Out for delivery");
        orderStatus.setStatus("Delivered");
    }
}
