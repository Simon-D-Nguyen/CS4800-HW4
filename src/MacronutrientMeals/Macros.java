package MacronutrientMeals;

import java.util.Map;
import java.util.Random;

public abstract class Macros {
    public enum FoodCategory {
        veg,
        dairy,
        meat,
        nuts
    }
    Map<FoodCategory, String> options;
    Random rand = new Random();


    protected abstract void loadOptions();


    protected void removeFatCategory(FoodCategory category) {
        options.remove(category);
    }


    public String getFat(){
        String[] outputFats = options.values().toArray(new String[0]);
        return outputFats[(rand.nextInt(options.size()))];
    }
}