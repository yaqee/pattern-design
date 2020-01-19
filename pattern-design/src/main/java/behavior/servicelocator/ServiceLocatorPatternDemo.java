package behavior.servicelocator;

public class ServiceLocatorPatternDemo {
    public static void main(String[] args) {
        ServiceLocator serviceLocator = new ServiceLocator();
        Service service1 = serviceLocator.getService("Service1");
        service1.execute();
        Service service2 = serviceLocator.getService("Service2");
        service2.execute();

        service1 = serviceLocator.getService("Service1");
        service1.execute();
        service2 = serviceLocator.getService("Service2");
        service2.execute();
    }
}
