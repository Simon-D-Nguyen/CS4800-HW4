package MacronutrientMeals;

public class VeganFats extends Fats{

    public VeganFats() {
        super();
        removeFatCategory(FoodCategory.meat);
        removeFatCategory(FoodCategory.dairy);
    }
}
