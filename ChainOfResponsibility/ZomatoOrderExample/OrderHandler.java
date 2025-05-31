package ChainOfResponsibility.ZomatoOrderExample;

public abstract class OrderHandler {
    protected OrderHandler nextHandler;

    public void setNextHandler(OrderHandler nextHandler) {
        this.nextHandler = nextHandler;
    }

    public abstract void processOrder(Order order);

    public void callNextHanlder(Order order) {
        if (this.nextHandler != null) {
            this.nextHandler.processOrder(order);
        } else {
            System.out.println("No further handler to process the order: " + order.getOrderId());
        }
    }
}
