package BuilderDesignPattern.HouseExample;

public class House {
    public String basement;
    public String roof;
    public String walls;
    public String interior;

    public void setBasement(String basement) {
        this.basement = basement;
    }

    public void setRoof(String roof) {
        this.roof = roof;
    }

    public void setWalls(String walls) {
        this.walls = walls;
    }

    public void setInterior(String interior) {
        this.interior = interior;
    }

    public void display() {
        System.out.println("House with:");
        System.out.println("Basement: " + basement);
        System.out.println("Roof: " + roof);
        System.out.println("Walls: " + walls);
        System.out.println("Interior: " + interior);
    }
}
