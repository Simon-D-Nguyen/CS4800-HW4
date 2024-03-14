package MacronutrientMeals;

public class Driver {
    public static void main(String[] args) {

        Customer c1 = new Customer("Edward", "no restriction");

        DietPlanFactory mealPlanner = DietPlanFactory.getInstance();

        MacronutrientFactory c1Plan = mealPlanner.createPlan(c1.getDietPlan());
        c1Plan.printPlan();

        Customer c2 = new Customer("Cullen", "no restriction");
        MacronutrientFactory c2Plan = mealPlanner.createPlan(c2.getDietPlan());
        c2Plan.printPlan();



    }
}
