package MacronutrientMeals;

public class ProteinFactory {
    public static ProteinFactory factory = null;


    private ProteinFactory() {}

    public static ProteinFactory getInstance(){
        if(factory == null) {
            factory = new ProteinFactory();
        }
        return factory;
    }

    public Protein getProtein(DietPlan dietPlan) {
        switch (dietPlan) {
            case DietPlan.NoRestriction:
                return new Protein();

            case DietPlan.Paleo:
                Protein paleo = new Protein();
                paleo.removeDairy();
                paleo.removeVeg();
                return paleo;

            case DietPlan.Vegan:
                Protein vegan = new Protein();
                vegan.removeDairy();
                vegan.removeMeats();
                return vegan;

            case DietPlan.NutAllergy:
                Protein noNuts = new Protein();
                noNuts.removeNuts();
                return noNuts;

            default:
                return null;
        }
    }
}
