package ObserverDesignPattern.OrderStatusExample;

public class DeliveryDriver implements IObserver {

    private String name;

    public DeliveryDriver(String name) {
        this.name = name;
    }

    @Override
    public void updateOrderStatus(OrderStatusTracker order) {
        System.out.println("Delivery Driver " + name + " has been notified of order status change: " + order.getStatus()
                + " for Order Id: " + order.getOrderId());
    }

    public String getName() {
        return name;
    }

}
