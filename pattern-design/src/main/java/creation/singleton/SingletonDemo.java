package creation.singleton;

public class SingletonDemo {
    public static void main(String[] args) {
        SingleObject object1 = SingleObject.getInstance();
        SingleObject object2 = SingleObject.getInstance();
        System.out.println(object1 == object2);
    }
}
