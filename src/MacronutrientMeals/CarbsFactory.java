package MacronutrientMeals;

public class CarbsFactory {
    public static CarbsFactory factory = null;
    private CarbsFactory(){}


    public static CarbsFactory getInstance(){
        if(factory == null) {
            factory = new CarbsFactory();
        }
        return factory;
    }

    public Carbs getCarbs(DietPlan dietPlan) {
        switch (dietPlan) {
            case DietPlan.NoRestriction:
                return new Carbs();

            case DietPlan.Paleo:
                Carbs paleo = new Carbs();
                paleo.removeVeg();
                paleo.removeDairy();
                return paleo;

            case DietPlan.Vegan:
                Carbs vegan = new Carbs();
                vegan.removeDairy();
                vegan.removeMeats();
                return vegan;

            case DietPlan.NutAllergy:
                Carbs noNuts = new Carbs();
                noNuts.removeNuts();
                return noNuts;

            default:
                return null;
        }
    }
}
