package SingletonDesignPattern.PaymentGatewayExample;

public class Main {
    public static void main(String args[]) {
        Runnable run = () -> {
            PaymentGateway paymentGateway = PaymentGateway.getInstance();
            paymentGateway.processPayment("Payment details for thread " + Thread.currentThread().getName());
            System.out.println("Payment processed by " + Thread.currentThread().getName());
        };

        Thread thread1 = new Thread(run);
        Thread thread2 = new Thread(run);
        Thread thread3 = new Thread(run);

        thread1.start();
        thread2.start();
        thread3.start();

        try {
            thread1.join();
            thread2.join();
            thread3.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
