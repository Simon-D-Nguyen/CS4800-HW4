public class Pizza {

    private String[] toppings;
    private String size;
    private String pizzaChain;

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


}
