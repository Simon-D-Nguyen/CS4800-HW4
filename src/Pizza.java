import java.util.ArrayList;

public class Pizza {

    private String[] toppings;
    private String size;
    private String pizzaChain;

    private Pizza(String pizzaChain, String size, String[] toppings) {
        this.pizzaChain = pizzaChain;
        this.size = size;
        this.toppings = toppings;
    }

    public void eat() {
        System.out.println("Pizza Chain: " + pizzaChain);
        System.out.println("Size: " + size);
        System.out.print("Toppings: ");
        if(toppings.length == 0) {
            System.out.println("n/a");
        }
        else {
            for(String topping: toppings) {
                System.out.println(topping + ", ");
            }
        }
    }

    public static class PizzaBuilder {
        private String pizzaChain;
        private String size;
        private ArrayList<String> toppings;

        public PizzaBuilder(String pizzaChain, String size){
            this.pizzaChain = pizzaChain;
            this.size = size;
            toppings = new ArrayList<>();
        }

        private void addTopping(String topping){
            toppings.add(topping);
        }
        public void addPepperoni(){
            addTopping("Pepperoni");
        }

        public void addSausage() {
            addTopping("Sausage");
        }

        public void addMushroom() {
            addTopping("Mushroom");
        }

        public void addBacon() {
            addTopping("Bacon");
        }

        public void addOnions() {
            addTopping("Onions");
        }

        public void addExtraCheese() {
            addTopping("Extra Cheese");
        }

        public void addPeppers() {
            addTopping("Peppers");
        }

        public void addChicken() {
            addTopping("Chicken");
        }

        public void addOlives() {
            addTopping("Olives");
        }

        public void addSpinach() {
            addTopping("Spinach");
        }

        public void addTomatoAndBasil() {
            addTopping("Tomato and Basil");
        }

        public void addBeef() {
            addTopping("Beef");
        }

        public void addHam() {
            addTopping("Ham");
        }

        public void addPest() {
            addTopping("Pest");
        }

        public void addSpicyPork() {
            addTopping("Spicy Pork");
        }

        public void addHamAndPineapple() {
            addTopping("Ham and Pineapple");
        }


        public Pizza build() {
            return new Pizza(pizzaChain, size, (String[])toppings.toArray());
        }

    }
}
