package behavior.observer;

public class ObserverPatternDemo {
    public static void main(String[] args) {
        Subject subject = new Subject();

        Observer binaryObserver = new BinaryObserver(subject);
        Observer octalObserver = new OctalObserver(subject);
        Observer hexObserver = new HexObserver(subject);

        System.out.println("First State Change: 15");
        subject.setState(15);
        System.out.println("Second State Change: 10");
        subject.setState(10);
    }
}
