// Concrete Factory class in the Factory design pattern.
// Responsible for creating specific MealBuilder objects based on the provided meal type (e.g., Burger, Pizza, Vegan).
// It encapsulates the object creation logic and returns the appropriate builder instance.
// If an unknown type is provided, it defaults to ConcreteBuilderCustomMealBuilder.
package factory;

import builder.BInterfaceMealBuilder;
import builder.ConcreteBuilderCustomMealBuilder;

import builder.BurgerMealBuilder;
import builder.PizzaMealBuilder;
import builder.VeganMealBuilder;

public class SimpleMealBuilderFactory implements MealBuilderFactory {

    @Override
    public BInterfaceMealBuilder createMealBuilder(String type) {
        switch (type.toLowerCase()) {
            case "burger":
                return new BurgerMealBuilder();
            case "pizza":
                return new PizzaMealBuilder();
            case "vegan":
                return new VeganMealBuilder();
            default:
                System.out.println("⚠ Unknown type, using default builder");
                return new ConcreteBuilderCustomMealBuilder();
        }
    }
}
