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
