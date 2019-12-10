package creation.prototype;

/**
 * @author zhangyaqi
 * @since JDK1.8
 */
public class Circle extends Shape {
    public Circle() {
        type = "Circle";
    }

    @Override
    public void draw() {
        System.out.println("Inside Circle::draw() method");
    }
}
