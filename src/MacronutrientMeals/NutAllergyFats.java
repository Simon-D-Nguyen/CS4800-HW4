package MacronutrientMeals;

public class NutAllergyFats extends Fats {
    public NutAllergyFats(){
        super();
        removeFatCategory(FoodCategory.nuts);
    }
}
