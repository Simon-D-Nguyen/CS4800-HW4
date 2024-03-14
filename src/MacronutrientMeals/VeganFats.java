package MacronutrientMeals;

public class VeganFats extends Fats {
    public VeganFats() {
        loadFats();
        removeFat("Tuna");
        removeFat("Sour Cream");
    }
}
