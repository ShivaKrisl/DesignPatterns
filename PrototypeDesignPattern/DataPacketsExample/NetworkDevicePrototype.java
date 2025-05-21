package PrototypeDesignPattern.DataPacketsExample;

public abstract class NetworkDevicePrototype {
    // Abstract method to clone the object
    public abstract NetworkDevicePrototype clone();

    // Abstract method to display the details of the object
    public abstract void display();
}
