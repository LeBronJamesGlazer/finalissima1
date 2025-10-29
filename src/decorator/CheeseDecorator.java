package decorator;

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
