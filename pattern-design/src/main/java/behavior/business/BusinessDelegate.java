package behavior.business;

public class BusinessDelegate {
    private BusinessLookup lookup = new BusinessLookup();
    private BusinessService service;
    private String serviceType;

    public void setServiceType(String serviceType) {
        this.serviceType = serviceType;
    }

    public void doTask() {
        service = lookup.lookupService(serviceType);
        service.doProcessing();
    }
}
