package ObserverDesignPattern.MessageNotifier;

public class Main {

    public static void main(String[] args) {
        // Create a message notifier
        MessageNotifer messageNotifer = new MessageNotifer("Initial Message");

        // Create observers
        Email emailObserver = new Email("sky@123.com");
        SMS smsObserver = new SMS("1234567890");

        // Subscribe observers to the notifier
        messageNotifer.addObserver(emailObserver);
        messageNotifer.addObserver(smsObserver);

        // Change the message, which will notify observers
        messageNotifer.setMessage("New Message: Hello World!");

        // detach an observer
        messageNotifer.removeObserver(smsObserver);

        // Change the message again, which will notify remaining observers
        messageNotifer.setMessage("OTP: 3545");
    }
}
