package creation.abstractfactory;

public interface Factory {

    Shape createShape(String shape);

    Color createColor(String color);
}
