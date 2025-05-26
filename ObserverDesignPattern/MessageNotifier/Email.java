package ObserverDesignPattern.MessageNotifier;

public class Email implements IObserver {

    private String emailAddress;

    // Constructor
    public Email(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    @Override
    public void update(MessageNotifer messageNotifer) {
        System.out.println("Email to " + emailAddress + ": " + messageNotifer.getMessage());
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

}
