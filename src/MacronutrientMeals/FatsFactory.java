package MacronutrientMeals;

import java.util.ArrayList;

public class FatsFactory {

    public static FatsFactory factory = null;
    private FatsFactory(){
    }

    public static FatsFactory getInstance(){
        if(factory == null) {
            factory = new FatsFactory();
        }
        return factory;
    }

    public Fats getFat(DietPlan fatType) {
        return switch (fatType) {
            case DietPlan.NoRestriction -> new NoRestrictionFats();
            case DietPlan.Paleo -> new PaleoFats();
            case DietPlan.Vegan -> new VeganFats();
            case DietPlan.NutAllergy -> new NutAllergyFats();
            default -> null;
        };
    }
}
