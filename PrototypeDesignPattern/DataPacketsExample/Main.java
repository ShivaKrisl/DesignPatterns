package PrototypeDesignPattern.DataPacketsExample;

public class Main {

    public static void main(String args[]) {
        NetworkDevicePrototype router = new Router("router1", "127.12.13.1");
        NetworkDevicePrototype originalSwitch = new Switch("switch1", "132.14.12.1");
        NetworkDevicePrototype clonedRouter = router.clone();
        NetworkDevicePrototype clonedSwitch = originalSwitch.clone();
        System.out.println("Original Router:");
        router.display();
        System.out.println("Cloned Router:");
        clonedRouter.display();
        System.out.println("Original Switch:");
        originalSwitch.display();
        System.out.println("Cloned Switch:");
        clonedSwitch.display();
    }
}
