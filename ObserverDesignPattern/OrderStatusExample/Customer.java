package ObserverDesignPattern.OrderStatusExample;

public class Customer implements IObserver {

    private String name;

    public Customer(String name) {
        this.name = name;
    }

    @Override
    public void updateOrderStatus(OrderStatusTracker order) {
        System.out.println("Customer " + name + " has been notified of order status change: " + order.getStatus() +
                " for Order Id: " + order.getOrderId());
    }

    public String getName() {
        return name;
    }
}
