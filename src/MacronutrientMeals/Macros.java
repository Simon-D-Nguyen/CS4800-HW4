package MacronutrientMeals;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.HashMap;
import java.util.Random;

public abstract class Macros {
    public enum FoodCategory {
        veg,
        dairy,
        meat,
        nuts
    }
    HashMap<FoodCategory, HashSet<String>> options =
            new HashMap<>();
    Random rand = new Random();
    int numberOfFood = 0;


    protected abstract void loadOptions();

    protected void addFoodByCategory(FoodCategory category, String food){
        if(!options.containsKey(category)){
            options.put(category, new HashSet<>());
        }
        options.get(category).add(food);
        numberOfFood++;
    }

    protected void removeFoodCategory(FoodCategory category) {
        options.remove(category);
    }

    public String getOption(){
        ArrayList<String> outputs = new ArrayList<>(numberOfFood);

        for(HashSet<String> category: options.values()){
            outputs.addAll(category);
        }

        return outputs.get((rand.nextInt(outputs.size())));
    }

    public void removeVeg(){
        removeFoodCategory(FoodCategory.veg);
    }

    public void removeNuts(){
        removeFoodCategory(FoodCategory.nuts);
    }

    public void removeMeats(){
        removeFoodCategory(FoodCategory.meat);
    }

    public void removeDairy(){
        removeFoodCategory(FoodCategory.dairy);
    }
}