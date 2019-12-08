package creation.abstractfactory;

public class FactoryProducer {

    public static Factory createFactory(String factroyName) {
        if("shape".equalsIgnoreCase(factroyName)) {
            return new ShapeFactory();
        } else if("color".equalsIgnoreCase(factroyName)) {
            return new ColorFactory();
        }
        return null;
    }
}
