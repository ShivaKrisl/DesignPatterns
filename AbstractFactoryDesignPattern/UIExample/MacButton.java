package AbstractFactoryDesignPattern.UIExample;

public class MacButton implements IButton {
    @Override
    public void press() {
        System.out.println("Mac Button Pressed");
    }
}
