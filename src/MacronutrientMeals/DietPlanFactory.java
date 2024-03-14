package MacronutrientMeals;

public class DietPlanFactory {

    public static MacronutrientFactory createPlan(String type) {

        switch (type.toLowerCase()){
            case "no restriction":
                return NoRestrictionPlanFactory.getInstance();

            default:
                return null;
        }
    }
}
