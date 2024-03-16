package MacronutrientMeals;

public class Fats extends Macros{

    public Fats() {
        loadOptions();
    }

    @Override
    protected void loadOptions() {
        addFoodByCategory(FoodCategory.veg, "Avocado");
        addFoodByCategory(FoodCategory.dairy, "Sour cream");
        addFoodByCategory(FoodCategory.meat, "Tuna");
        addFoodByCategory(FoodCategory.nuts, "Peanuts");
    }
}
