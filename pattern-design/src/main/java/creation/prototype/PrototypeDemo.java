package creation.prototype;

/**
 * @author zhangyaqi
 * @since JDK1.8
 */
public class PrototypeDemo {

    public static void main(String[] args) {
        ShapeCache.loadCache();

        Shape circle = ShapeCache.getShape("1");
        System.out.println("shape: " + circle.getType());

        Shape rectangle = ShapeCache.getShape("2");
        System.out.println("shape: " + rectangle.getType());

        Shape square = ShapeCache.getShape("3");
        System.out.println("shape: " + square.getType());
    }

}
