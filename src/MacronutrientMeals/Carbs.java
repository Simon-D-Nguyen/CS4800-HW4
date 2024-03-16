package MacronutrientMeals;

public class Carbs extends Macros {
    public Carbs() {
        loadOptions();
    }


    @Override
    protected void loadOptions() {
        options.put(FoodCategory.dairy, "Cheese");
        options.put(FoodCategory.veg, "Bread");
        options.put(FoodCategory.veg, "Lentils");
        options.put(FoodCategory.nuts, "Pistachio");
    }
}
