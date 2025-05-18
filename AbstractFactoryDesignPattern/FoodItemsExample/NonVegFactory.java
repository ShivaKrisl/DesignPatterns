package AbstractFactoryDesignPattern.FoodItemsExample;

public class NonVegFactory implements IFoodItemsFactory {

    @Override
    public IStarter createStarter() {
        return new NonVegStarter();
    }

    @Override
    public IMainCourse createMainCourse() {
        return new NonVegMainCourse();
    }

}
