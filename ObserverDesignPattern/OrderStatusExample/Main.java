package ObserverDesignPattern.OrderStatusExample;

public class Main {
    public static void main(String args[]) {

        // Create an order status tracker
        OrderStatusTracker order = new OrderStatusTracker("12345");

        // Create observers
        Customer customer = new Customer("Alice");
        Restraunt restaurant = new Restraunt("Pizza Place");
        DeliveryDriver driver = new DeliveryDriver("Bob");
        // Register observers
        order.addObserver(customer);
        order.addObserver(restaurant);
        order.addObserver(driver);

        // Change order status
        order.setStatus("Out for Delivery");
    }
}
