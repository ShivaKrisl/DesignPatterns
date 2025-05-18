package AbstractFactoryDesignPattern.UIExample;

public interface IUIFactory {

    public IButton createButton();

    public ITextBox createTextBox();
}