package AbstractFactoryDesignPattern.UIExample;

public class WindowFactory implements IUIFactory {
    @Override
    public IButton createButton() {
        return new WindowsButton();
    }

    @Override
    public ITextBox createTextBox() {
        return new WindowsTextBox();
    }

}
