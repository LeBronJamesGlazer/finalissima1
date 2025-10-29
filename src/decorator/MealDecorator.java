package decorator;
// Abstract decorator class in the Decorator design pattern.
// Implements the same interface (FoodItem) as the objects it decorates.
// Holds a reference to a FoodItem object and delegates base functionality to it.
// Concrete decorators (like CheeseDecorator, BaconDecorator, etc.) will extend this class
// and override methods to add new behaviors or modify existing ones.
public abstract class MealDecorator implements decorator.FoodItem {
    protected decorator.FoodItem decoratedMeal;

    public MealDecorator(decorator.FoodItem meal) {
        this.decoratedMeal = meal;
    }

    @Override
    public String getDescription() {
        return decoratedMeal.getDescription();
    }

    @Override
    public double getCost() {
        return decoratedMeal.getCost();
    }
}
