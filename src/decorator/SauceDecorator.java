// Concrete decorator in the Decorator pattern.
// Adds "Spicy Sauce" as an additional feature to an existing FoodItem.
// Extends MealDecorator and overrides getDescription() and getCost()
// to enhance the base meal with new flavor and price.
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
