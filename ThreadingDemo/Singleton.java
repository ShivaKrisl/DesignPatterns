package ThreadingDemo;

public class Singleton {
    private static Singleton instance;

    private static int Counter = 0;

    private Singleton() {
        Counter++;
        System.out.println("Object Created; No.of objects =  " + Counter);
    }

    public static Singleton getInstance() {
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }

    public static int getCounter() {
        return Counter;
    }
}
