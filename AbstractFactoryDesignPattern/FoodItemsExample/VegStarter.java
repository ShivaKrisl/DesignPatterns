package AbstractFactoryDesignPattern.FoodItemsExample;

public class VegStarter implements IStarter {
    @Override
    public void prepareFood() {
        System.out.println("Preparing Veg Starter");
    }

    @Override
    public void serveFood() {
        System.out.println("Serving Veg Starter");
    }

}
