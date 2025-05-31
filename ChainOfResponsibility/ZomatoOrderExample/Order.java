package ChainOfResponsibility.ZomatoOrderExample;

public class Order {
    private String orderId;
    private String orderName;

    public boolean isValid() {
        // For simplicity, let's assume an order is valid if it has a non-empty ID and
        // name
        return orderId != null && !orderId.isEmpty() && orderName != null && !orderName.isEmpty();
    }

    public Order(String orderId, String orderName) {
        this.orderId = orderId;
        this.orderName = orderName;
    }

    public String getOrderId() {
        return orderId;
    }

    public String getOrderName() {
        return orderName;
    }

    @Override
    public String toString() {
        return "Order : {order id = " + this.orderId + " and order name = " + this.orderName + "}";
    }
}
