package MacronutrientMeals;

public class Customer {
    private String name;
    private String dietPlan;

    public Customer(String name, String dietPlan){
        this.name = name;
        this.dietPlan = dietPlan;
    }

    public String getDietPlan() {
        return dietPlan;
    }
}
