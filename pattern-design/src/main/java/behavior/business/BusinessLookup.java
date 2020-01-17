package behavior.business;

public class BusinessLookup {

    public BusinessService lookupService(String serviceType) {
        if("EJB".equals(serviceType)) {
            return new EJBService();
        } else {
            return new JMSService();
        }
    }
}
