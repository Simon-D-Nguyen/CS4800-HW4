package MacronutrientMeals;

public class MealPlan {
    private Fats fats;
    private Carbs carbs;
    private Protein proteins;


    public MealPlan(Fats fats, Carbs carbs, Protein proteins){
        this.fats = fats;
        this.carbs = carbs;
        this.proteins = proteins;
    }


    public void printMealPlan() {
        System.out.println("\t- Carb:\t"+ carbs.getOption());
        System.out.println("\t- Protein:\t"+ proteins.getOption());
        System.out.println("\t- Fat:\t"+ fats.getOption());

    }
}
