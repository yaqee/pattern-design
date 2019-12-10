package creation.prototype;

import java.util.Hashtable;

/**
 * @author zhangyaqi
 * @since JDK1.8
 */
public class ShapeCache {
    private static Hashtable<String, Shape> shapeTable = new Hashtable<>();

    public static void loadCache() {
        Shape circle = new Circle();
        circle.setId("1");
        shapeTable.put(circle.getId(), circle);

        Shape rectangle = new Rectangle();
        rectangle.setId("2");
        shapeTable.put(rectangle.getId(), rectangle);

        Shape square = new Square();
        square.setId("3");
        shapeTable.put(square.getId(), square);
    }

    public static Shape getShape(String shapeId) {
        Shape shape = shapeTable.get(shapeId);

        return (Shape)shape.clone();
    }
}
