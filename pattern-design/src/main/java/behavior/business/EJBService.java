package behavior.business;

public class EJBService implements BusinessService {
    @Override
    public void doProcessing() {
        System.out.println("processing task by invoking EJB service.");
    }
}
