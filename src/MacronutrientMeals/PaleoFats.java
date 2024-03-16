package MacronutrientMeals;

public class PaleoFats extends Fats{

    public PaleoFats() {
        super();
        this.removeFatCategory(FoodCategory.dairy);
    }
}
