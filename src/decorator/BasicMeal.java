package decorator;

// Базовое блюдо, к которому можно добавлять декораторы
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
