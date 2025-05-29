public class Main {
    public static void main(String[] args) {
        // Create a document -- receiver class
        Document document = new Document("MyDocument.txt");

        // Create actions
        IActionListerner openAction = new ActionOpen(document);
        IActionListerner saveAction = new ActionSave(document);

        // Create invoker and add actions; like the menu in a GUI has actions
        Invoker invoker = new Invoker();
        invoker.addAction(openAction);
        invoker.addAction(saveAction);

        // Execute all actions
        invoker.executeActions();
    }
}
