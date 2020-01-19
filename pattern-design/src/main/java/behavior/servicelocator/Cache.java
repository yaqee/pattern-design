package behavior.servicelocator;

import java.util.ArrayList;
import java.util.List;

public class Cache {
    List<Service> serviceList = new ArrayList<>();

    public Service getService(String serviceName) {
        for(Service service: serviceList) {
            if(service.getName().equalsIgnoreCase(serviceName)) {
                System.out.println("Return cached " + serviceName + " object.");
                return service;
            }
        }
        return null;
    }

    public void addService(Service service) {
        serviceList.add(service);
    }
}
