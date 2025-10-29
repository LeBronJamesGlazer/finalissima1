package decorator;
// Basic component in the Decorator pattern.
// Represents a simple meal item before any additional features (decorators) are added.
public class BasicMeal implements decorator.FoodItem {
    private String description;
    private double cost;

    public BasicMeal(String description, double cost) {
        this.description = description;
        this.cost = cost;
    }

    @Override
    public String getDescription() {
        return description;
    }

    @Override
    public double getCost() {
        return cost;
    }
}
