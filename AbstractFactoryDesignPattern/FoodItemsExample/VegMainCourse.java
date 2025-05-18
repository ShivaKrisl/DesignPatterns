package AbstractFactoryDesignPattern.FoodItemsExample;

public class VegMainCourse implements IMainCourse {
    @Override
    public void prepareFood() {
        System.out.println("Preparing Veg Main Course");
    }

    @Override
    public void serveFood() {
        System.out.println("Serving Veg Main Course");
    }

}
