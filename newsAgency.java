public class newsAgency {
    private List<Subscriber> subscribers;

    public void publishNews(String news) {
        notifySubscribers(news);
    }

    public void notifySubscribers(String news) {
        for (Subscriber subscriber : subscribers) {
            subscriber.receiveNotification(news);
        }
    }

    public void addSubscriber(Subscriber subscriber) {
        subscribers.add(subscriber);
    }

    public void removeSubscriber(Subscriber subscriber) {
        subscribers.remove(subscriber);
    }
}