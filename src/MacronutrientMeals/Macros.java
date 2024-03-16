package MacronutrientMeals;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;

public abstract class Macros {
    public enum FoodCategory {
        veg,
        dairy,
        meat,
        nuts
    }
    Map<FoodCategory, String> options = new HashMap<>();
    Random rand = new Random();


    protected abstract void loadOptions();


    protected void removeFoodByCategory(FoodCategory category) {
        options.remove(category);
    }


    public String getOption(){
        String[] outputs = options.values().toArray(new String[0]);
        return outputs[(rand.nextInt(options.size()))];
    }

    public void removeVeg(){
        removeFoodByCategory(FoodCategory.veg);
    }

    public void removeNuts(){
        removeFoodByCategory(FoodCategory.nuts);
    }

    public void removeMeats(){
        removeFoodByCategory(FoodCategory.meat);
    }

    public void removeDairy(){
        removeFoodByCategory(FoodCategory.dairy);
    }
}