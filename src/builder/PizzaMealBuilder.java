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
