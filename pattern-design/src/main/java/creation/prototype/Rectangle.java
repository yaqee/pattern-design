package creation.prototype;

/**
 * @author zhangyaqi
 * @since JDK1.8
 */
public class Rectangle extends Shape {
    public Rectangle() {
        type = "rectangle";
    }

    @Override
    public void draw() {
        System.out.println("Inside Rectangle::draw() method");
    }
}
