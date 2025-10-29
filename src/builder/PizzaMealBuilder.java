// Concrete Builder class in the Builder design pattern.
// Implements the BInterfaceMealBuilder interface to construct a specific type of ProductMeal: a pizza meal.
// Defines the steps for assembling the meal with a main dish (pizza), a drink, and a dessert.
// Returns a fully built ProductMeal object through the getMeal() method.
package builder;

public class PizzaMealBuilder implements BInterfaceMealBuilder {
    private ProductMeal meal = new ProductMeal();

    @Override
    public void buildMainDish() {
        meal.setMainDish("Pepperoni Pizza");
    }

    @Override
    public void buildDrink() {
        meal.setDrink("Sprite");
    }

    @Override
    public void buildDessert() {
        meal.setDessert("Tiramisu");
    }

    @Override
    public ProductMeal getMeal() {
        return meal;
    }
}
