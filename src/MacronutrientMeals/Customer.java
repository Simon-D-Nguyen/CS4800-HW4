package MacronutrientMeals;

public class Customer {
    private String name;
    private DietPlan dietPlan;
    private MealPlan mealPlan;


    public Customer(String name, DietPlan dietPlan){
        this.name = name;
        this.dietPlan = dietPlan;
        this.mealPlan = null;
    }

    public DietPlan getDietPlan() {
        return dietPlan;
    }

    public void setMealPlan(MealPlan mealPlan) {
        this.mealPlan = mealPlan;
    }

    public MealPlan getMealPlan() {
        return this.mealPlan;
    }

    public void printBalancedMeal(){
        System.out.println("Name: " + name);
        System.out.println("Diet Plan: " + dietPlan);
        mealPlan.printMealPlan();
        System.out.println();
    }
}
