// Concrete Builder class in the Builder design pattern.
// Implements the BInterfaceMealBuilder interface to construct a specific type of ProductMeal: a burger meal.
// Defines the steps for building a complete meal with a main dish, drink, and dessert.
// Returns a fully assembled ProductMeal object through the getMeal() method.
package builder;

public class BurgerMealBuilder implements BInterfaceMealBuilder {
    private ProductMeal meal = new ProductMeal();

    @Override
    public void buildMainDish() {
        meal.setMainDish("Cheese Burger");
    }

    @Override
    public void buildDrink() {
        meal.setDrink("Coca-Cola");
    }

    @Override
    public void buildDessert() {
        meal.setDessert("Brownie");
    }

    @Override
    public ProductMeal getMeal() {
        return meal;
    }
}
