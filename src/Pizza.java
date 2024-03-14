import java.util.ArrayList;

public class Pizza {

    private ArrayList<String> toppings;
    private String size;
    private String pizzaChain;

    private Pizza(Builder builder) {
        this.pizzaChain = builder.pizzaChain;
        this.size = builder.size;
        this.toppings = builder.toppings;
    }

    public void eat() {
        System.out.println("Pizza Chain:\t" + pizzaChain);
        System.out.println("Size:\t\t\t" + size);
        System.out.println("Toppings: ");
        if(toppings.size() == 0) {
            System.out.println("n/a");
        }
        else {
            for(String topping: toppings) {
                System.out.println("\t" + topping);
            }
        }
    }

    public static class Builder {
        private String pizzaChain;
        private String size;
        private ArrayList<String> toppings;

        private String[] acceptedSizes = {"Small", "Medium", "Large"};


        public Builder(String pizzaChain, String size){
            this.pizzaChain = pizzaChain;
            this.size = size;
            toppings = new ArrayList<>();
        }

        private boolean sizeCheck(String size) {
            for (String acceptedSize : acceptedSizes){
                if (acceptedSize == size) {
                    return true;
                }
            }

            return false;
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
            if (!sizeCheck(size)){
                size = "Invalid Size";
            }
            return new Pizza(this);
        }

    }
}
