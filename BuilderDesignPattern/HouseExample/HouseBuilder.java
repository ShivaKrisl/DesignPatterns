package BuilderDesignPattern.HouseExample;

public abstract class HouseBuilder {
    protected House house = new House();

    public House getHouse() {
        return house;
    }

    public abstract void buildBasement(String basement);

    public abstract void buildRoof(String roof);

    public abstract void buildWalls(String walls);

    public abstract void buildInterior(String interior);

}
