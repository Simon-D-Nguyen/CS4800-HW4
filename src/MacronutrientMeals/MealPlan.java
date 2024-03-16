package MacronutrientMeals;

public class MealPlan {
    private Fats fat;
    private Carbs carb;
    private Protein protein;


    public MealPlan(Fats fats, Carbs carbs, Protein proteins){
        this.fat = fats;
        this.carb = carbs;
        this.protein = proteins;
    }


    public void printMealPlan() {
        System.out.println("Fat: "+ fat.getFat());
        System.out.println("Carb: "+ carb);
        System.out.println("Protein"+ protein);
    }
}
