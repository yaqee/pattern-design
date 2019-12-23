package struction.facade;

/**
 * @author zhangyaqi
 * @since JDK1.8
 */
public class Square implements Shape {
    @Override
    public void draw() {
        System.out.println("Square::draw()");
    }
}
