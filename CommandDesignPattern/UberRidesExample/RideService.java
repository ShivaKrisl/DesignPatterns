package CommandDesignPattern.UberRidesExample;

// Receiver class
public class RideService {

    public void RequestRide(String passanger, String src, String dest) {
        System.out.println("Ride requested for " + passanger + " from " + src + " to " + dest);
    }

    public void CancelRide(String passanger) {
        System.out.println("Ride cancelled for " + passanger);
    }
}
