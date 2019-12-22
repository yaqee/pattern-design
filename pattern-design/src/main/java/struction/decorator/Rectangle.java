package struction.decorator;

/**
 * @author zhangyaqi
 * @since JDK1.8
 */
public class Rectangle implements Shape {
    @Override
    public void draw() {
        System.out.println("Shape: Rectangle");
    }
}
