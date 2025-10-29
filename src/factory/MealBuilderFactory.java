// Interface for the Factory design pattern.
// Defines a contract for creating different types of Meal Builders (Burger, Pizza, Vegan, etc.).
// Implementations of this interface decide which specific builder to return
// based on the provided type parameter.
package factory;

import builder.BInterfaceMealBuilder;

public interface MealBuilderFactory {
    BInterfaceMealBuilder createMealBuilder(String type);
}
