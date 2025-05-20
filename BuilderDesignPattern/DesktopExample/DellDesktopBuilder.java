package BuilderDesignPattern.DesktopExample;

public class DellDesktopBuilder extends DesktopBuilder {

    @Override
    public void buildRam(String ram) {
        desktop.setRam(ram);
    }

    @Override
    public void buildMotherBoard(String motherBoard) {
        desktop.setMotherBoard(motherBoard);
    }

    @Override
    public void buildProcessor(String processor) {
        desktop.setProcessor(processor);
    }

    @Override
    public void buildGraphicsCard(String graphicsCard) {
        desktop.setGraphicsCard(graphicsCard);
    }

    @Override
    public void buildStorage(String storage) {
        desktop.setStorage(storage);
    }

}
