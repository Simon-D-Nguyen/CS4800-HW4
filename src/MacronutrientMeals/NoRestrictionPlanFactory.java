package MacronutrientMeals;


public class NoRestrictionPlanFactory extends MacronutrientFactory {

    private static NoRestrictionPlanFactory factory = null;
    private String type;

    public static MacronutrientFactory getInstance() {
        if (factory == null){
            factory = new NoRestrictionPlanFactory();
            return factory;
        }
        return factory;
    }
    private NoRestrictionPlanFactory(){
        type = "no restriction";
    }

    @Override
    public String selectFat() {
        return FatsFactory.getInstance().getFats(type);
    }

    @Override
    public String selectCarb() {
        return null;
    }

    @Override
    public String selectProtein() {
        return null;
    }
}
