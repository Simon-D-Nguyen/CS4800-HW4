package MacronutrientMeals;

public class Macronutrient {
    public static Macronutrient planFactory = null;

    public static Macronutrient getInstance(){
        if (planFactory == null) {
            planFactory = new Macronutrient();
        }
        return planFactory;
    }

    private Macronutrient(){}

    public MealPlan createPlan(DietPlan dietPlan) {
        Fats fatOptions = FatsFactory.getInstance().getFats(dietPlan);
        Carbs carbOptions = CarbsFactory.getInstance().getCarbs(dietPlan);
        Protein proteinOptions = ProteinFactory.getInstance().getProtein(dietPlan);

        return new MealPlan(fatOptions, carbOptions, proteinOptions);
    }
}
