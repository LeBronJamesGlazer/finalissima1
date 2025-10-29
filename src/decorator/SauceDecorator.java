package decorator;

public class SauceDecorator extends MealDecorator {

    public SauceDecorator(FoodItem meal) {
        super(meal);
    }

    @Override
    public String getDescription() {
        return decoratedMeal.getDescription() + " + Spicy Sauce";
    }

    @Override
    public double getCost() {
        return decoratedMeal.getCost() + 0.75;
    }
}
