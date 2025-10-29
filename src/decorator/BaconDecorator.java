package decorator;
// Concrete decorator in the Decorator pattern.
// Adds "Crispy Bacon" as an extra feature to the base meal.
// Extends MealDecorator and modifies both description and cost.
public class BaconDecorator extends MealDecorator {

    public BaconDecorator(FoodItem meal) {
        super(meal);
    }

    @Override
    public String getDescription() {
        return decoratedMeal.getDescription() + " + Crispy Bacon";
    }

    @Override
    public double getCost() {
        return decoratedMeal.getCost() + 2.00;
    }
}
