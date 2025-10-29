package builder;

// Component: MealDirector
// Coordinates the construction of a meal using a given builder
public class MealDirector {
    private ConcreteBuilderCustomMealBuilder builder;  // builder used to create the meal

    // Constructor - receives a specific meal builder
    public MealDirector(ConcreteBuilderCustomMealBuilder builder) {
        // Assign the provided builder instance to the local builder field
        this.builder = builder;
    }

    // Builds the full meal by executing all building steps in order
    public ProductMeal constructMeal() {
        builder.buildMainDish();
        builder.buildDrink();
        builder.buildDessert();
        return builder.getMeal();  // return the completed meal
    }
}
