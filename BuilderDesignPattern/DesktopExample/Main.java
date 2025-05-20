package BuilderDesignPattern.DesktopExample;

import java.util.HashMap;

public class Main {
    public static void main(String args[]) {
        DesktopBuilderDirectory directory = new DesktopBuilderDirectory();
        DesktopBuilder dellBuilder = new DellDesktopBuilder();
        HashMap<String, String> configs = new HashMap<>();
        configs.put("ram", "16GB");
        configs.put("processor", "Intel i7");
        configs.put("storage", "1TB SSD");
        configs.put("graphicsCard", "NVIDIA RTX 3080");
        configs.put("motherBoard", "Dell XPS Motherboard");

        Desktop dellDesktop = directory.buildDesktop(dellBuilder, configs);
        System.out.println("Dell Desktop Configurations:");
        dellDesktop.display();

    }
}
