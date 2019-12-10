package creation.prototype;

/**
 * @author zhangyaqi
 * @since JDK1.8
 */
public class Square extends Shape {
    public Square() {
        type = "Square";
    }

    @Override
    public void draw() {
        System.out.println("Inside Square::draw() method");
    }
}
