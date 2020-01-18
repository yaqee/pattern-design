package behavior.compnentEntity;

public class ComponentEntity {
    private GoarseGraindObject ggo = new GoarseGraindObject();

    public String[] getData() {
        return ggo.getData();
    }

    public void setData(String data1, String data2) {
        ggo.setData(data1, data2);
    }
}
