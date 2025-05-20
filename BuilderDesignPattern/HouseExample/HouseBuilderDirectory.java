package BuilderDesignPattern.HouseExample;

import java.util.HashMap;

// Think of this directory as civil engineer who is responsible for the construction of the house.
// The directory will use the builder to construct the house step by step.
public class HouseBuilderDirectory {

    public House buildHouse(HouseBuilder builder, HashMap<String, String> houseParts) {
        builder.buildBasement(houseParts.get("basement"));
        builder.buildRoof(houseParts.get("roof"));
        builder.buildWalls(houseParts.get("walls"));
        builder.buildInterior(houseParts.get("interior"));
        return builder.getHouse();
    }

}
