package behavior.business;

public class JMSService implements BusinessService {
    @Override
    public void doProcessing() {
        System.out.println("processing task by invoking JMS service.");
    }
}
