package Observer;

public interface IYoutubeSubscriber {
    void subscribe (Subscriber subscriber);
    void unsubscribe (Subscriber subscriber);
    void notifyAllSubscriber();
}
