package AbstractFactoryDesignPattern.UIExample;

public class GUIAbstractFactory {
    public IUIFactory createFactory(OsType osType) {
        switch (osType) {
            case MAC:
                return new MacFactory();
            case WINDOWS:
                return new WindowFactory();
            default:
                throw new IllegalArgumentException("Unknown OS type: " + osType);
        }
    }
}