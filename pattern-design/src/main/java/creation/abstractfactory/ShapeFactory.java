package creation.abstractfactory;

public class ShapeFactory implements Factory {
    public Shape createShape(String shape) {
        if(null == shape)
            return null;
        if("rectangle".equalsIgnoreCase(shape)) {
            return new Rectangle();
        } else if("square".equalsIgnoreCase(shape)) {
            return new Square();
        } else if("circle".equalsIgnoreCase(shape)) {
            return new Circle();
        }
        return null;
    }

    public Color createColor(String color) {
        return null;
    }
}
