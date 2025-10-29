// Concrete Builder class in the Builder design pattern.
// Implements the BInterfaceMealBuilder interface to construct a specific type of ProductMeal: a vegan meal.
// Defines steps to build a healthy, plant-based meal including a vegan salad, fresh juice, and a fruit bowl.
// Returns the completed ProductMeal through the getMeal() method.
package builder;

public class VeganMealBuilder implements BInterfaceMealBuilder {
    private ProductMeal meal = new ProductMeal();

    @Override
    public void buildMainDish() {
        meal.setMainDish("Vegan Salad");
    }

    @Override
    public void buildDrink() {
        meal.setDrink("Fresh Juice");
    }

    @Override
    public void buildDessert() {
        meal.setDessert("Fruit Bowl");
    }

    @Override
    public ProductMeal getMeal() {
        return meal;
    }
}
