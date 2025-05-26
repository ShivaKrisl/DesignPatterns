package ObserverDesignPattern.MessageNotifier;

public interface IObserver {

    void update(MessageNotifer messageNotifer);
    // This method will be called when the subject (MessageNotifer) notifies the
    // observer
}
