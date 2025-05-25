package ThreadingDemo;

public class Main {
    public static void main(String args[]) {
        // create a Runnable to create Singleton instances
        Runnable createSingleton = () -> {
            Singleton singleton = Singleton.getInstance();
            System.out.println("Singleton Instance: " + singleton);
        };
        // Create three threads
        Thread t1 = new Thread(createSingleton);
        Thread t2 = new Thread(createSingleton);
        Thread t3 = new Thread(createSingleton);

        // Start the threads
        t1.start();
        t2.start();
        t3.start();

        // Wait for threads to finish
        try {
            t1.join();
            t2.join();
            t3.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
