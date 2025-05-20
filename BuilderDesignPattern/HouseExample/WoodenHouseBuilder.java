package BuilderDesignPattern.HouseExample;

public class WoodenHouseBuilder extends HouseBuilder {
    @Override
    public void buildBasement(String basement) {
        house.setBasement(basement);
    }

    @Override
    public void buildRoof(String roof) {
        house.setRoof(roof);
    }

    @Override
    public void buildWalls(String walls) {
        house.setWalls(walls);
    }

    @Override
    public void buildInterior(String interior) {
        house.setInterior(interior);
    }
}
