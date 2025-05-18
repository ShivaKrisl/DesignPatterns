package AbstractFactoryDesignPattern.UIExample;

public class MacTextBox implements ITextBox {
    @Override
    public void setText(String text) {
        System.out.println("Mac TextBox Set Text: " + text);
    }
}
