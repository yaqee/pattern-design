package struction.bridge;

/**
 * @author zhangyaqi
 * @since JDK1.8
 */
public abstract class Shape {
    protected DrawAPI drawAPI;

    public Shape(DrawAPI drawAPI) {
        this.drawAPI = drawAPI;
    }

    public abstract void draw();
}
