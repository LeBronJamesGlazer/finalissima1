package builder;

public class MealDirector {
    private BInterfaceMealBuilder builder;

    public MealDirector(BInterfaceMealBuilder builder) {
        this.builder = builder;
    }

    public ProductMeal constructMeal() {
        builder.buildMainDish();
        builder.buildDrink();
        builder.buildDessert();
        return builder.getMeal();
    }
}
