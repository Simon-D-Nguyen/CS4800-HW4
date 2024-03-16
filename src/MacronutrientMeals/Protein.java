package MacronutrientMeals;

public class Protein extends Macros{
    public Protein() {
        loadOptions();
    }


    @Override
    protected void loadOptions() {
        options.put(FoodCategory.meat, "Fish");
        options.put(FoodCategory.meat, "Chicken");
        options.put(FoodCategory.meat, "Beef");
        options.put(FoodCategory.veg, "Tofu");
    }
}
