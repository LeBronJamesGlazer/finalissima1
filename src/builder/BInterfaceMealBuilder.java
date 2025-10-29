// Interface for the Builder design pattern.
// Defines the step-by-step construction process of a complex object — in this case, a ProductMeal.
// Specifies methods for building main dish, drink, and dessert, as well as retrieving the completed meal.
// Concrete classes (e.g., BurgerMealBuilder, PizzaMealBuilder) implement this interface
// to provide specific meal-building logic.
package builder;

// Meal Builder interface - defines steps to create a meal
public interface BInterfaceMealBuilder {

    // Main dish (e.g., burger, pizza)
    void buildMainDish();

    // Drink (e.g., cola, juice)
    void buildDrink();

    // Dessert (e.g., cake, ice cream)
    void buildDessert();

    // Returns the finished meal
    ProductMeal getMeal();
}