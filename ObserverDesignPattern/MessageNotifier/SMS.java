package ObserverDesignPattern.MessageNotifier;

public class SMS implements IObserver {

    private String phoneNumber;

    // Constructor
    public SMS(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    @Override
    public void update(MessageNotifer messageNotifer) {
        System.out.println("SMS to " + phoneNumber + ": " + messageNotifer.getMessage());
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

}
