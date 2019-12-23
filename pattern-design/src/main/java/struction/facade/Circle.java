package struction.facade;

/**
 * @author zhangyaqi
 * @since JDK1.8
 */
public class Circle implements Shape {
    @Override
    public void draw() {
        System.out.println("Circle::draw()");
    }
}
