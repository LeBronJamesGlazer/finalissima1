// Concrete Builder class in the Builder design pattern.
// Implements the BInterfaceMealBuilder interface to construct a customizable ProductMeal.
// Provides default options for main dish, drink, and dessert, but can be modified for user preferences.
// Demonstrates flexibility of the Builder pattern by allowing easy extension or customization of meal components.
package builder;

// Custom Meal Builder - builds a specific type of meal
public class ConcreteBuilderCustomMealBuilder implements BInterfaceMealBuilder {
    private ProductMeal meal;  // the product being built

    // Constructor initializes a new empty meal to start building
    public ConcreteBuilderCustomMealBuilder() {
        this.meal = new ProductMeal();  // create a new ProductMeal instance
    }

    // Builds the main dish for the meal
    @Override
    public void buildMainDish() {
        meal.setMainDish("Burger");  // default main dish
    }

    // Builds the drink for the meal
    @Override
    public void buildDrink() {
        meal.setDrink("Cola");  // default drink
    }

    // Builds the dessert for the meal
    @Override
    public void buildDessert() {
        meal.setDessert("Ice Cream");  // default dessert
    }

    // Returns the completed meal object
    @Override
    public ProductMeal getMeal() {
        return meal;
    }
}
