package BuilderDesignPattern.HouseExample;

public class HouseFactory {
    public static HouseBuilder getHouseBuilder(String type) {
        if (type.equalsIgnoreCase("wooden")) {
            return new WoodenHouseBuilder();
        } else if (type.equalsIgnoreCase("cement")) {
            return new CementHouseBuilder();
        }
        return null;
    }
}