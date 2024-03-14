package MacronutrientMeals;

public class FactoryCreator {

    public static MacronutrientFactory createFactory(String type){

        if(type.equalsIgnoreCase("fats")){
            return new FatsFactory();
        }
        if(type.equalsIgnoreCase("carbs")){
            return new CarbsFactory();
        }
        if(type.equalsIgnoreCase("protein")){
            return new ProteinFactory();
        }
        else{
            System.out.println("\t--> Factory not found\n");
        }
    }
}
