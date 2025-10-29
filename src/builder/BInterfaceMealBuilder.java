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