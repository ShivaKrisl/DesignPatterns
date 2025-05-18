package AbstractFactoryDesignPattern.FoodItemsExample;

public class NonVegStarter implements IStarter {
    @Override
    public void prepareFood() {
        System.out.println("Preparing Non-Veg Starter");
    }

    @Override
    public void serveFood() {
        System.out.println("Serving Non-Veg Starter");
    }

}
