package MacronutrientMeals;

public class DietPlanFactory {
    public static DietPlanFactory planFactory = null;

    public static DietPlanFactory getInstance(){
        if (planFactory == null) {
            planFactory = new DietPlanFactory();
        }
        return planFactory;
    }
    private DietPlanFactory() {}

    public MacronutrientFactory createPlan(String type) {

        switch (type.toLowerCase()){
            case "no restriction":
                return NoRestrictionPlanFactory.getInstance();
            case "paleo":

            case "vegan":

            case "nut allergy":

            default:
                return null;
        }
    }
}
