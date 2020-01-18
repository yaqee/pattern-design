package behavior.compnentEntity;

public class ComponentEntityPatternDemo {
    public static void main(String[] args) {
        Client client = new Client();
        client.setData("First Test", "Data1");
        client.printData();

        client.setData("Second Test", "Data2");
        client.printData();
    }
}
