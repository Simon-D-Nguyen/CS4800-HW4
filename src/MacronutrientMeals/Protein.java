package MacronutrientMeals;

public class Protein extends Macros{
    public Protein() {
        loadOptions();
    }


    @Override
    protected void loadOptions() {
        addFoodByCategory(FoodCategory.meat, "Fish");
        addFoodByCategory(FoodCategory.meat, "Chicken");
        addFoodByCategory(FoodCategory.meat, "Beef");
        addFoodByCategory(FoodCategory.veg, "Tofu");
    }
}
