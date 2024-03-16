package MacronutrientMeals;

public class Macronutrient {
    public static Macronutrient planFactory = null;
    private FatsFactory fatMaker;
    private CarbsFactory carbMaker;
    private ProteinFactory proteinMaker;


    public static Macronutrient getInstance(){
        if (planFactory == null) {
            planFactory = new Macronutrient();
        }
        return planFactory;
    }


    public MealPlan createPlan(DietPlan dietPlan) {
        fatMaker = FatsFactory.getInstance();
        carbMaker = CarbsFactory.getInstance();
        proteinMaker = ProteinFactory.getInstance();

        Fats fatOptions = fatMaker.getFats(dietPlan);
        Carbs carbOptions = carbMaker.getCarbs(dietPlan);
        Protein proteinOptions = proteinMaker.getProtein(dietPlan);

        return new MealPlan(fatOptions, carbOptions, proteinOptions);
    }

    private Macronutrient() {}
}
