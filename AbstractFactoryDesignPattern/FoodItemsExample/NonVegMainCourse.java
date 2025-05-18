package AbstractFactoryDesignPattern.FoodItemsExample;

public class NonVegMainCourse implements IMainCourse {
    @Override
    public void prepareFood() {
        System.out.println("Preparing Non-Veg Main Course");
    }

    @Override
    public void serveFood() {
        System.out.println("Serving Non-Veg Main Course");
    }
}
