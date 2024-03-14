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

    public String getFats(String type) {
        return switch (type) {
            case "no restriction" -> new AllFats().getFat();
            case "vegan" -> new VeganFats().getFat();
            case "paleo" -> new PaleoFats().getFat();
            case "nut allergy" -> new NutAllergyFats().getFat();
            default -> null;
        };
    }
}
