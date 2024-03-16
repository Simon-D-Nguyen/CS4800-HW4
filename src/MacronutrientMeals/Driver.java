package MacronutrientMeals;

public class Driver {
    public static void main(String[] args) {

        Macronutrient mealMaker = Macronutrient.getInstance();
        MealPlan mealHolder;

        Customer c1 = new Customer("Edward", DietPlan.NoRestriction);
        mealHolder = mealMaker.createPlan(c1.getDietPlan());
        c1.setMealPlan(mealHolder);
        c1.printBalancedMeal();


        Customer c2 = new Customer("Cullen", DietPlan.Vegan);
        mealHolder = mealMaker.createPlan(c2.getDietPlan());
        c2.setMealPlan(mealHolder);
        c2.printBalancedMeal();


        Customer c3 = new Customer("Sophia H.", DietPlan.Paleo);
        mealHolder = mealMaker.createPlan(c3.getDietPlan());
        c3.setMealPlan(mealHolder);
        c3.printBalancedMeal();


        Customer c4 = new Customer("Toffee C.", DietPlan.Paleo);
        mealHolder = mealMaker.createPlan(c4.getDietPlan());
        c4.setMealPlan(mealHolder);
        c4.printBalancedMeal();


        Customer c5 = new Customer("Rock L.", DietPlan.Vegan);
        mealHolder = mealMaker.createPlan(c5.getDietPlan());
        c5.setMealPlan(mealHolder);
        c5.printBalancedMeal();


        Customer c6 = new Customer("Teri T.", DietPlan.NutAllergy);
        mealHolder = mealMaker.createPlan(c6.getDietPlan());
        c6.setMealPlan(mealHolder);
        c6.printBalancedMeal();
    }
}
