public class ActionSave implements IActionListerner {
    private Document document;

    public ActionSave(Document document) {
        this.document = document;
    }

    @Override
    // the reason we are not writing the logic here is because when tomorrow a new
    // reciver is added like sheets then they have methods to save or open it
    public void execute() {
        document.save();
    }
}
