package MacronutrientMeals;

public class Carbs extends Macros {
    public Carbs() {
        loadOptions();
    }


    @Override
    protected void loadOptions() {
        addFoodByCategory(FoodCategory.dairy, "Cheese");
        addFoodByCategory(FoodCategory.veg, "Bread");
        addFoodByCategory(FoodCategory.veg, "Lentils");
        addFoodByCategory(FoodCategory.nuts, "Pistachio");
    }
}
