package factory;

import builder.BInterfaceMealBuilder;

public interface MealBuilderFactory {
    BInterfaceMealBuilder createMealBuilder(String type);
}
