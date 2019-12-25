package struction.proxy;

/**
 * @author zhangyaqi
 * @since JDK1.8
 */
public class ProxyPatternDemo {

    public static void main(String[] args) {
        Image image = new RealImage("test.jpg");
        image.display();

        System.out.println();

        image.display();
    }
}
