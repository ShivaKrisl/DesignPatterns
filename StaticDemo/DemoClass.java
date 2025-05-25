public class DemoClass {
    private static int Counter = 0;

    public DemoClass() {
        Counter++;
        System.out.println("DemoClass instance created. Current count: " + Counter);
    }

    public static int getCounter() {
        return Counter;
    }

}
