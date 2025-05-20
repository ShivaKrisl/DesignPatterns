package BuilderDesignPattern.HouseExample;

import java.util.HashMap;

public class Main {
    public static void main(String args[]) {
        HouseBuilderDirectory directory = new HouseBuilderDirectory();
        // Get the builder for a wooden house
        HouseBuilder woodenHouseBuilder = HouseFactory.getHouseBuilder("wooden");

        // configurations for the house
        HashMap<String, String> houseParts = new HashMap<>();
        houseParts.put("basement", "Concrete Basement");
        houseParts.put("roof", "Wooden Roof");
        houseParts.put("walls", "Wooden Walls");
        houseParts.put("interior", "Wooden Interior");
        // Build the house using the builder
        House house = directory.buildHouse(woodenHouseBuilder, houseParts);
        house.display();

    }
}
