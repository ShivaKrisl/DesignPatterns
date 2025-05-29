package CommandDesignPattern.UberRidesExample;

// invoker class now with association
public class Invoker {
    public void executeCommand(ICommand command) {
        command.execute();
    }
}
