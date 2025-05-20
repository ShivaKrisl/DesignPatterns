package BuilderDesignPattern.DesktopExample;

import java.util.HashMap;

public class DesktopBuilderDirectory {

    public Desktop buildDesktop(DesktopBuilder builder, HashMap<String, String> componentConfigs) {
        builder.buildRam(componentConfigs.get("ram"));
        builder.buildProcessor(componentConfigs.get("processor"));
        builder.buildStorage(componentConfigs.get("storage"));
        builder.buildGraphicsCard(componentConfigs.get("graphicsCard"));
        builder.buildMotherBoard(componentConfigs.get("motherBoard"));
        return builder.getDesktop();
    }
}
