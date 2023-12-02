public class main {
    public static void main(String[] args) {
        NewsAgency newsAgency = new NewsAgency();

        Subscriber subscriber1 = new Subscriber("Juan");
        Subscriber subscriber2 = new Subscriber("Andres");
        newsAgency.addSubscriber(subscriber1);
        newsAgency.addSubscriber(subscriber2);

        newsAgency.publishNews("Breaking news: Example news update 1");

        newsAgency.removeSubscriber(subscriber2);

        newsAgency.publishNews("Breaking news: Example news update 2");
    }
}