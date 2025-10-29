// Director class in the Builder design pattern.
// Responsible for controlling the construction process of a ProductMeal.
// Uses a BInterfaceMealBuilder instance to build a complete meal step by step
// by calling methods like buildMainDish(), buildDrink(), and buildDessert().
// Ensures that the meal creation process is consistent and follows a defined sequence.
package builder;

public class MealDirector {
    private BInterfaceMealBuilder builder;

    public MealDirector(BInterfaceMealBuilder builder) {
        this.builder = builder;
    }

    public ProductMeal constructMeal() {
        builder.buildMainDish();
        builder.buildDrink();
        builder.buildDessert();
        return builder.getMeal();
    }
}
