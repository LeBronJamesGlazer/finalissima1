import builder.*;
import facade.OrderFacade;
import strategy.*;

public class Main {
    public static void main(String[] args) {
        // 1. Build a meal using Builder
        ConcreteBuilderCustomMealBuilder builder = new ConcreteBuilderCustomMealBuilder();
        MealDirector director = new MealDirector(builder);

        // 2. Create Facade to manage ordering process
        OrderFacade orderFacade = new OrderFacade(director);

        // 3. Choose a payment method (Strategy)
        orderFacade.setPaymentMethod(new PayPalPayment("customer@email.com"));

        // 4. Place the order
        orderFacade.placeOrder(15.99);

        // Try another order with a different payment method
        orderFacade.setPaymentMethod(new CashPayment());
        orderFacade.placeOrder(9.50);
    }
}