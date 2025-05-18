package AbstractFactoryDesignPattern.FoodItemsExample;

public class AbstractFactory {

    public IFoodItemsFactory createFactory(FoodType foodType) {
        switch (foodType) {
            case VEG:
                return new VegFactory();
            case NON_VEG:
                return new NonVegFactory();
            default:
                return null;
        }
    }
}
