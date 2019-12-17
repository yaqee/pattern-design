package creation.prototype;

import java.util.Hashtable;

/**
 * @author zhangyaqi
 * @since JDK1.8
 */
public class ShapeCache {
    private static Hashtable<String, Shape> cache = new Hashtable<>();

    public static Shape getShape(String id) {
        Shape shape = cache.get(id);
        return shape;
    }

    public static void loadCache() {
        Shape circle = new Circle();
        circle.setId("1");
        cache.put(circle.getId(), circle);

        Shape rectangle = new Rectangle();
        rectangle.setId("2");
        cache.put(rectangle.getId(), rectangle);

        Shape square = new Square();
        square.setId("3");
        cache.put(square.getId(), square);
    }
}
