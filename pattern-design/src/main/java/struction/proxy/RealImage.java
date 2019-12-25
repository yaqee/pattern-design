package struction.proxy;

/**
 * @author zhangyaqi
 * @since JDK1.8
 */
public class RealImage implements Image {
    private String filename;

    public RealImage(String filename) {
        this.filename = filename;
        loadFromDisk(filename);
    }

    @Override
    public void display() {
        System.out.println("Display " + filename);
    }

    private void loadFromDisk(String filename) {
        System.out.println("Loading " + filename);
    }
}
