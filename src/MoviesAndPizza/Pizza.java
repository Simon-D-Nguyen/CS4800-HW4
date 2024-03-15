package MoviesAndPizza;

import java.util.ArrayList;

public class Pizza {
    public enum Size{
        Large,
        Medium,
        Small;
    }

    private ArrayList<String> toppings;
    private Size size;
    private String pizzaChain;


    private Pizza(Builder builder) {
        this.pizzaChain = builder.pizzaChain;
        this.size = builder.size;
        this.toppings = builder.toppings;
    }

    public void eat() {
        System.out.println("Pizza Chain:\t" + pizzaChain);
        System.out.println("Size:\t\t\t" + size);
        System.out.print("Toppings: ");
        if(toppings.isEmpty()) {
            System.out.println("None");
        }
        else {
            System.out.println(toppings.toString());
        }

        System.out.println();
    }

    public static class Builder {
        private String pizzaChain;
        private Size size;
        private ArrayList<String> toppings;


        public Builder(Size size){
            this.size = size;
            toppings = new ArrayList<>();
            this.pizzaChain = "n/a";
        }

        public Builder addPizzaChain(String pizzaChain){
            this.pizzaChain = pizzaChain;
            return this;
        }

        private Builder addTopping(String topping){
            toppings.add(topping);
            return this;
        }
        public Builder addPepperoni(){
            return addTopping("Pepperoni");
        }

        public Builder addSausage() {
            return addTopping("Sausage");
        }

        public Builder addMushroom() {
            return addTopping("Mushroom");
        }

        public Builder addBacon() {
            return addTopping("Bacon");
        }

        public Builder addOnions() {
            return addTopping("Onions");
        }

        public Builder addExtraCheese() {
            return addTopping("Extra Cheese");
        }

        public Builder addPeppers() {
            return addTopping("Peppers");
        }

        public Builder addChicken() {
            return addTopping("Chicken");
        }

        public Builder addOlives() {
            return addTopping("Olives");
        }

        public Builder addSpinach() {
            return addTopping("Spinach");
        }

        public Builder addTomatoAndBasil() {
            return addTopping("Tomato and Basil");
        }

        public Builder addBeef() {
            return addTopping("Beef");
        }

        public Builder addHam() {
            return addTopping("Ham");
        }

        public Builder addPesto() {
            return addTopping("Pesto");
        }

        public Builder addSpicyPork() {
            return addTopping("Spicy Pork");
        }

        public Builder addHamAndPineapple() {
            return addTopping("Ham and Pineapple");
        }


        public Pizza build() {
            return new Pizza(this);
        }
    }
}
