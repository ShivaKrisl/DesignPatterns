package AbstractFactoryDesignPattern.FoodItemsExample;

public class Main {
    public static void main(String args[]) {
        // lets create a veg
        AbstractFactory factory = new AbstractFactory();
        IFoodItemsFactory vegFactory = factory.createFactory(FoodType.VEG);

        // create veg starter
        IFoodItems starter = vegFactory.createStarter();
        starter.prepareFood();
        starter.serveFood();

    }
}
