package MacronutrientMeals;

public class Fats extends Macros{

    public Fats() {
        loadOptions();
    }
    @Override
    protected void loadOptions() {
        options.put(FoodCategory.veg, "Avocado");
        options.put(FoodCategory.dairy, "Sour cream");
        options.put(FoodCategory.meat, "Tuna");
        options.put(FoodCategory.nuts, "Peanuts");
    }
}
