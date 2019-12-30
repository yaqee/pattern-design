package behavior.chain;

/**
 * @author zhangyaqi
 * @since JDK1.8
 */
public class ConsoleLogger extends AbstractLogger {

    public ConsoleLogger(int level) {
        this.level = level;
    }

    @Override
    public void write(String message) {
        System.out.println("Standard Console::Logger: " + message);
    }
}
