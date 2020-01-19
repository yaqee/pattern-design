package behavior.servicelocator;

public class ServiceLocator {
    private Cache cache;
    private InitialContext initialContext = new InitialContext();

    public ServiceLocator() {
        this.cache = new Cache();
    }

    public Service getService(String serviceName) {
        Service service = cache.getService(serviceName);
        if(service == null) {
            service = initialContext.lookup(serviceName);
            cache.addService(service);
        }
        return service;
    }
}
