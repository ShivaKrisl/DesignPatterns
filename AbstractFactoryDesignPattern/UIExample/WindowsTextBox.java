package AbstractFactoryDesignPattern.UIExample;

public class WindowsTextBox implements ITextBox {
    @Override
    public void setText(String text) {
        System.out.println("Windows TextBox: " + text);
    }
}
