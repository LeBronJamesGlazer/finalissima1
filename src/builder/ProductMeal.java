package builder;

// Represents the complex meal object being built
public class ProductMeal {
    private String mainDish;
    private String drink;
    private String dessert;

    // Setters
    public void setMainDish(String mainDish) {
        this.mainDish = mainDish;
    }

    public void setDrink(String drink) {
        this.drink = drink;
    }

    public void setDessert(String dessert) {
        this.dessert = dessert;
    }

    // Optional: Display meal information
    @Override
    public String toString() {
        return "Meal [Main Dish: " + mainDish + ", Drink: " + drink + ", Dessert: " + dessert + "]";
    }
}
