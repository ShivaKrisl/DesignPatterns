package BuilderDesignPattern.DesktopExample;

public class Desktop {
    public String ram;
    public String processor;
    public String graphicsCard;
    public String storage;
    public String motherBoard;

    public void display() {
        System.out.println("Ram : " + this.ram);
        System.out.println("Processor: " + this.processor);
        System.out.println("Graphics Card: " + this.graphicsCard);
        System.out.println("Storage: " + this.storage);
        System.out.println("Mother Board: " + this.motherBoard);
    }

    public void setRam(String ram) {
        this.ram = ram;
    }

    public void setProcessor(String processor) {
        this.processor = processor;
    }

    public void setGraphicsCard(String graphicsCard) {
        this.graphicsCard = graphicsCard;
    }

    public void setStorage(String storage) {
        this.storage = storage;
    }

    public void setMotherBoard(String motherBoard) {
        this.motherBoard = motherBoard;
    }

    public String getRam() {
        return ram;
    }

    public String getProcessor() {
        return processor;
    }

    public String getGraphicsCard() {
        return graphicsCard;
    }

    public String getStorage() {
        return storage;
    }

    public String getMotherBoard() {
        return motherBoard;
    }

}