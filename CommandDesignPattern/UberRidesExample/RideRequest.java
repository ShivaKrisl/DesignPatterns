package CommandDesignPattern.UberRidesExample;

public class RideRequest implements ICommand {
    private RideService rideService;
    private String passenger;
    private String src;
    private String dest;

    public RideRequest(RideService rideService, String passenger, String src, String dest) {
        this.rideService = rideService;
        this.passenger = passenger;
        this.src = src;
        this.dest = dest;
    }

    @Override
    public void execute() {
        rideService.RequestRide(passenger, src, dest);
    }
}
