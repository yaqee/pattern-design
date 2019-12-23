package struction.flyweight;

import java.util.HashMap;
import java.util.Map;

/**
 * @author zhangyaqi
 * @since JDK1.8
 */
public class ShapeFactory {
    private static final Map<String, Shape> circleMap = new HashMap<>();

    public static Shape getCircle(String color) {
        Shape circle = circleMap.get(color);
        if(circle == null) {
            circle = new Circle(color);
            circleMap.put(color, circle);
            System.out.println("Creating circle of color: " + color);
        }
        return circle;
    }

}
