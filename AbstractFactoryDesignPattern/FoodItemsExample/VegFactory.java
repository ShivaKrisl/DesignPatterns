package AbstractFactoryDesignPattern.FoodItemsExample;

public class VegFactory implements IFoodItemsFactory {
    @Override
    public IStarter createStarter() {
        return new VegStarter();
    }

    @Override
    public IMainCourse createMainCourse() {
        return new VegMainCourse();
    }

}
