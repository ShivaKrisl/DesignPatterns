package PrototypeDesignPattern.DataPacketsExample;

public class Router extends NetworkDevicePrototype {
    private String routerName;
    private String ipAddress;

    public Router(String routerName, String ipAddress) {
        this.routerName = routerName;
        this.ipAddress = ipAddress;
    }

    @Override
    public NetworkDevicePrototype clone() {
        return new Router(this.routerName, this.ipAddress);
    }

    @Override
    public void display() {
        System.out.println("Router Name: " + routerName);
        System.out.println("IP Address: " + ipAddress);
    }
}
