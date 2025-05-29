public class ActionOpen implements IActionListerner {
    private Document document;

    public ActionOpen(Document document) {
        this.document = document;
    }

    @Override
    public void execute() {
        document.open();
    }

}
