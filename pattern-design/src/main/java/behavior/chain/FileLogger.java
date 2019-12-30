package behavior.chain;

/**
 * @author zhangyaqi
 * @since JDK1.8
 */
public class FileLogger extends AbstractLogger {

    public FileLogger(int level) {
        this.level = level;
    }

    @Override
    public void write(String message) {
        System.out.println("File Console::Logger: " + message);
    }
}
