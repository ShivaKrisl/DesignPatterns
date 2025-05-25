public class Main {
    public static void main(String[] args) {
        DemoClass demo1 = new DemoClass();
        DemoClass demo2 = new DemoClass();
        System.out.println("Total instances created: " + DemoClass.getCounter());
    }
}
