package MacronutrientMeals;

public class PaleoFats extends Fats{

    public PaleoFats() {
        loadFats();
        this.removeFatCategory(FoodCategory.dairy);
    }
}
