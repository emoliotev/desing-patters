package observer;

public class Client {
    public static void main(String[] args) {
        Observer observer1 = new Observer1();
        Observer observer2 = new Observer2();

                Subject subject = new Subject();
                subject.registerObserver(observer1);
                subject.registerObserver(observer2);

                subject.setStateChange(true);
                System.out.println("123456789");

                subject.unRegisterObserver(observer1);
                subject.setStateChange(true);

    }
}
