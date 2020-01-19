package behavior.servicelocator;

/**
 * 查找服务
 */
public class InitialContext {

    public Service lookup(String serviceName) {
        if("Service1".equalsIgnoreCase(serviceName)) {
            System.out.println("Looking up and creating Service1");
            return new Service1();
        } else if("Service2".equalsIgnoreCase(serviceName)) {
            System.out.println("Looking up and creating Service2");
            return new Service2();
        }
        return null;
    }
}
