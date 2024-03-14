package MacronutrientMeals;

import java.util.ArrayList;
import java.util.Random;

public abstract class Fats {
    public ArrayList<String> fats = new ArrayList<>();
    private Random rand = new Random();

    protected void loadFats(){
        fats.add("Avocado");
        fats.add("Sour cream");
        fats.add("Tuna");
        fats.add("Peanuts");
    }

    protected void removeFat(String fat) {
        fats.remove(fat);
    }

    public String getFat(){
        return fats.get(rand.nextInt(fats.size()));
    }
}