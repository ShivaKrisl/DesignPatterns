public class Document { // Receiver class
    private String name;

    public Document(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void open() {
        System.out.println("Document " + name + " is opened.");
    }

    public void save() {
        System.out.println("Document " + name + " is saved.");
    }
}
