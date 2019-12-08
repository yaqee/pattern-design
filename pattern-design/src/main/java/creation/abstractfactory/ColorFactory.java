package creation.abstractfactory;

public class ColorFactory implements Factory {
    public Shape createShape(String shape) {
        return null;
    }

    public Color createColor(String color) {
        if(null == color)
            return null;
        if("red".equalsIgnoreCase(color)) {
            return new Red();
        } else if("blue".equalsIgnoreCase(color)) {
            return new Blue();
        } else if("green".equalsIgnoreCase(color)) {
            return new Green();
        }

        return null;
    }
}
