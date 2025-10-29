package decorator;
// Concrete decorator in the Decorator pattern.
// Adds "Extra Cheese" feature to the existing FoodItem.
// Wraps another FoodItem (decoratedMeal) and enhances its description and cost.
public class CheeseDecorator extends MealDecorator {

    public CheeseDecorator(FoodItem meal) {
        super(meal);
    }

    @Override
    public String getDescription() {
        return decoratedMeal.getDescription() + " + Extra Cheese";
    }

    @Override
    public double getCost() {
        return decoratedMeal.getCost() + 1.50;
    }
}
