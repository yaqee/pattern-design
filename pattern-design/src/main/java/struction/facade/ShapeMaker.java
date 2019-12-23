package struction.facade;

/**
 * @author zhangyaqi
 * @since JDK1.8
 */
public class ShapeMaker {
    Rectangle rectangle;
    Circle circle;
    Square square;

    public ShapeMaker() {
        rectangle = new Rectangle();
        circle = new Circle();
        square = new Square();
    }

    public void drawRectangle() {
        rectangle.draw();
    }

    public void drawCircle() {
        circle.draw();
    }

    public void drawSquare() {
        square.draw();
    }
}
