package BuilderDesignPattern.DesktopExample;

public abstract class DesktopBuilder {

    protected Desktop desktop = new Desktop();

    public abstract void buildRam(String ram);

    public abstract void buildProcessor(String processor);

    public abstract void buildStorage(String storage);

    public abstract void buildGraphicsCard(String graphicsCard);

    public abstract void buildMotherBoard(String motherBoard);

    public Desktop getDesktop() {
        return desktop;
    }

}
