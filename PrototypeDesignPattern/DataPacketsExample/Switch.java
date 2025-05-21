package PrototypeDesignPattern.DataPacketsExample;

public class Switch extends NetworkDevicePrototype {
    private String switchName;
    private String ipAddress;

    public Switch(String switchName, String ipAddress) {
        this.switchName = switchName;
        this.ipAddress = ipAddress;
    }

    @Override
    public NetworkDevicePrototype clone() {
        return new Switch(this.switchName, this.ipAddress);
    }

    @Override
    public void display() {
        System.out.println("Switch Name: " + switchName);
        System.out.println("IP Address: " + ipAddress);
    }

}
