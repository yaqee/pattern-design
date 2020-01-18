package behavior.compnentEntity;

public class Client {
    private ComponentEntity ce = new ComponentEntity();

    public void printData() {
        for(int i = 0; i < ce.getData().length; i++) {
            System.out.println("data: " + ce.getData()[i]);
        }
    }

    public void setData(String data1, String data2) {
        ce.setData(data1, data2);
    }
}
