package MacronutrientMeals;


public class FatsFactory {
    public static FatsFactory factory = null;
    private FatsFactory(){}


    public static FatsFactory getInstance(){
        if(factory == null) {
            factory = new FatsFactory();
        }
        return factory;
    }

    public Fats getFats(DietPlan fatType) {
        switch (fatType) {
            case DietPlan.NoRestriction:
                return new Fats();

            case DietPlan.Paleo:
                Fats paleo = new Fats();
                paleo.removeDairy();
                return paleo;

            case DietPlan.Vegan:
                Fats vegan = new Fats();
                vegan.removeDairy();
                vegan.removeMeats();
                return vegan;

            case DietPlan.NutAllergy:
                Fats noNuts = new Fats();
                noNuts.removeNuts();
                return noNuts;

            default:
                return null;
        }
    }
}
