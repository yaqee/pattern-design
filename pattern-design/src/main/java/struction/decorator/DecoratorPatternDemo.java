package struction.decorator;

/**
 * @author zhangyaqi
 * @since JDK1.8
 */
public class DecoratorPatternDemo {
    public static void main(String[] args) {
        Shape circle = new Circle();
        System.out.println("Circle with normal border");
        circle.draw();

        ShapeDecorator redCircle = new RedShapeDecorator(circle);
        System.out.println("\nCircle with red border");
        redCircle.draw();


        Shape rectangle = new Rectangle();
        ShapeDecorator redRectangle = new RedShapeDecorator(rectangle);
        System.out.println("\nRectangle with red border");
        redRectangle.draw();
    }
}
