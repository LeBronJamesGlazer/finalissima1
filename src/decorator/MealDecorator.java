package decorator;

// Абстрактный декоратор, реализует тот же интерфейс
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
