public class Driver {
    public static void main(String[] args) {

        Pizza tester = new Pizza.Builder("Pizza Hut", "Small")
                .addBeef()
                .addChicken()
                .addHamAndPineapple()
                .addMushroom()
                .addOlives()
                .build();

        tester.eat();
    }
}