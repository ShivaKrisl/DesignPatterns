package CommandDesignPattern.UberRidesExample;

public class Main {
    public static void main(String[] args) {
        RideService rideService = new RideService();
        Invoker invoker = new Invoker();

        // Request a ride
        ICommand requestRide = new RideRequest(rideService, "Alice", "Downtown", "Uptown");
        invoker.executeCommand(requestRide);

        // Cancel a ride
        ICommand cancelRide = new CancelRide(rideService, "Alice");
        invoker.executeCommand(cancelRide);
    }
}
