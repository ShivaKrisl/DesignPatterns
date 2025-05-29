package CommandDesignPattern.UberRidesExample;

public class CancelRide implements ICommand {
    private RideService rideService;
    private String passenger;

    public CancelRide(RideService rideService, String passenger) {
        this.rideService = rideService;
        this.passenger = passenger;
    }

    @Override
    public void execute() {
        rideService.CancelRide(passenger);
    }
}
