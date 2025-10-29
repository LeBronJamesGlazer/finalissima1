package decorator;

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
