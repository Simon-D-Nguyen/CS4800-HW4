package MacronutrientMeals;

public abstract class MacronutrientFactory {
    private String type;
    public abstract String selectFat();
    public abstract String selectCarb();
    public abstract String selectProtein();

    public void printPlan(){
        System.out.println("- Meal Plan -");
        System.out.println("Fat:\t"+ selectFat());
        System.out.println("Carb:\t" + selectCarb());
        System.out.println("Protein:\t" + selectProtein());
    }

}
