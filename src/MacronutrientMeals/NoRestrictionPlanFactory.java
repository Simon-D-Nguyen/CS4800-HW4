package MacronutrientMeals;


public class NoRestrictionPlanFactory extends MacronutrientFactory {

    private static NoRestrictionPlanFactory factory = null;

    public static MacronutrientFactory getInstance() {
        if (factory == null){
            factory = new NoRestrictionPlanFactory();
            return factory;
        }
        return factory;
    }

    @Override
    public Fats selectFat() {
        return null;
    }

    @Override
    public Carbs selectCarb() {
        return null;
    }

    @Override
    public Protein selectProtein() {
        return null;
    }
}
