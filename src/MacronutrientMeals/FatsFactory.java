package MacronutrientMeals;

import java.util.ArrayList;

public class FatsFactory {
    private ArrayList<String> fats;
    public FatsFactory(){
        fats = new ArrayList<>();
        fats.add("Avocado");
        fats.add("Sour cream");
        fats.add("Tuna");
        fats.add("Peanuts");
    }

    public Fats getFats(String dietPlan){
        String plan = dietPlan.toLowerCase();

        switch(plan){
            case "no restriction":
                return fats[x];

        }

    }

    private
}
