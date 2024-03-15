package MoviesAndPizza;

public class Driver {
    public static void main(String[] args) {

        System.out.println("== Part 1 ==\n");

        String pizzaH = "Pizza Hut";

        Pizza tester = new Pizza.Builder(Pizza.Size.Small)
                .addPizzaChain(pizzaH)
                .addBeef()
                .addChicken()
                .addHamAndPineapple()
                .build();

        Pizza tester1 = new Pizza.Builder(Pizza.Size.Medium)
                .addPizzaChain(pizzaH)
                .addExtraCheese()
                .addOlives()
                .addPepperoni()
                .addPesto()
                .addSausage()
                .addSpinach()
                .build();

        Pizza tester2 = new Pizza.Builder(Pizza.Size.Large)
                .addPizzaChain(pizzaH)
                .addTomatoAndBasil()
                .addMushroom()
                .addPeppers()
                .addOlives()
                .addSpicyPork()
                .addOnions()
                .addChicken()
                .addPepperoni()
                .addExtraCheese()
                .build();

        tester.eat();
        tester1.eat();
        tester2.eat();

        System.out.println("== Part 2 ==\n");

        System.out.println("--- Pizza Hut: ");
        Pizza pH1 = new Pizza.Builder(Pizza.Size.Large)
                .addPizzaChain(pizzaH)
                .addSpinach().addBacon().addPeppers()
                .build();

        pH1.eat();

        Pizza pH2 = new Pizza.Builder(Pizza.Size.Small)
                .addPizzaChain(pizzaH)
                .addPeppers().addHam()
                .build();

        pH2.eat();


        System.out.println("\n--- Little Caesars: ");
        Pizza lC1 = new Pizza.Builder(Pizza.Size.Medium)
                .addPizzaChain("Little Caesars")
                .addBacon().addBeef().addHam().addExtraCheese()
                .addChicken().addMushroom().addOnions().addOlives()
                .addPesto()
                .build();

        lC1.eat();

        Pizza lC2 = new Pizza.Builder(Pizza.Size.Small)
                .addPizzaChain("Little Caesars")
                .addBacon().addExtraCheese().addPeppers()
                .addPesto().addTomatoAndBasil().addSausage()
                .build();

        lC2.eat();


        System.out.println("\n--- Dominos:");

        Pizza dom1 = new Pizza.Builder(Pizza.Size.Small)
                .addPizzaChain("Dominos")
                .addPepperoni()
                .build();

        dom1.eat();

        Pizza dom2 = new Pizza.Builder(Pizza.Size.Large)
                .addPizzaChain("Dominos")
                .addChicken().addPesto().addOnions()
                .build();

        dom2.eat();


    }
}