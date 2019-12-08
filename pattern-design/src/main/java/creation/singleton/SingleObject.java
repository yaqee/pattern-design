package creation.singleton;

/**
 * 饿汉模式的单例模式
 */
public class SingleObject {
    private static SingleObject singleton = new SingleObject();

    private SingleObject() {}

    public static SingleObject getInstance() {
        return singleton;
    }

    public void showMessage() {
        System.out.println("Singleton Pattern");
    }
}
