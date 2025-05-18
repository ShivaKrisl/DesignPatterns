package AbstractFactoryDesignPattern.FoodItemsExample;

public interface IFoodItemsFactory {

    public IStarter createStarter();

    public IMainCourse createMainCourse();
}
