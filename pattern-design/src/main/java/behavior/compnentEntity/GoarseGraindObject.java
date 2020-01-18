package behavior.compnentEntity;

public class GoarseGraindObject {
    private DependentObject1 object1 = new DependentObject1();
    private DependentObject2 object2 = new DependentObject2();

    public String[] getData() {
        return new String[]{object1.getData1(), object2.getData2()};
    }

    public void setData(String data1, String data2) {
        object1.setData1(data1);
        object2.setData2(data2);
    }
}
