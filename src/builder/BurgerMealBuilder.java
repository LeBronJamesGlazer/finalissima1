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
