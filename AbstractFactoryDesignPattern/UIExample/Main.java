package AbstractFactoryDesignPattern.UIExample;

// Created by: Shiva Krishna Beeraboina
public class Main {
    public static void main(String[] args) {
        // lets create a Windows UI that has a button and a text box
        GUIAbstractFactory factory = new GUIAbstractFactory(); // create a factory
        IUIFactory windFactory = factory.createFactory(OsType.WINDOWS); // create a factory for Windows

        IButton button = windFactory.createButton();
        ITextBox textBox = windFactory.createTextBox();
        button.press();
        textBox.setText("Hello Windows");
    }
}
