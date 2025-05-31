package ChainOfResponsibility.ZomatoOrderExample;

public class Main {
    public static void main(String[] args) {
        // Create the order
        Order order = new Order("1233", "Dell 1155");

        // create Order Validator
        OrderHandler orderValidator = new OrderValidator();
        // create Payment Handler
        OrderHandler paymentHandler = new PaymentHandler();
        // create Delivery Handler
        OrderHandler deliveryHandler = new DeliveryHandler();

        // Set up the chain of responsibility
        orderValidator.setNextHandler(paymentHandler);
        paymentHandler.setNextHandler(deliveryHandler);
        deliveryHandler.setNextHandler(null);

        // Process the order through the chain
        // This will start the chain with the order validator
        orderValidator.processOrder(order);

    }

}
