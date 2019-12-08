package creation.abstractfactory;

public class AbstractFactroyDemo {
    public static void main(String[] args) {
        //根据工厂名称使用工厂生成器生成形状工厂
        Factory shapeFactory = FactoryProducer.createFactory("shape");
        //生成长方形
        Shape rectangle = shapeFactory.createShape("rectangle");
        rectangle.draw();

        //生成正方形
        Shape square = shapeFactory.createShape("square");
        square.draw();

        //生成圆
        Shape circle = shapeFactory.createShape("circle");
        circle.draw();

        //生成颜色工厂
        Factory colorFactory = FactoryProducer.createFactory("color");
        //生成红色
        Color red = colorFactory.createColor("red");
        red.fill();

        //生成绿色
        Color green = colorFactory.createColor("green");
        green.fill();

        //生成蓝色
        Color blue = colorFactory.createColor("blue");
        blue.fill();
    }
}
