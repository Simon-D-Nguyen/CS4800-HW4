package MacronutrientMeals;

public class VeganFats extends Fats{

    public VeganFats() {
        loadFats();
        removeFatCategory(FoodCategory.meat);
        removeFatCategory(FoodCategory.dairy);
    }
}
