package behavior.chain;

/**
 * @author zhangyaqi
 * @since JDK1.8
 */
public class ChainPatternDemo {
    private static AbstractLogger getChainOfLoggers() {
        AbstractLogger consoleLogger = new ConsoleLogger(AbstractLogger.DEBUG);
        AbstractLogger fileLogger = new FileLogger(AbstractLogger.INFO);
        AbstractLogger errorLogger = new ErrorLogger(AbstractLogger.ERROR);
        errorLogger.setNextLogger(fileLogger);
        fileLogger.setNextLogger(consoleLogger);
        return errorLogger;
    }

    public static void main(String[] args) {
        AbstractLogger loggerChain = getChainOfLoggers();
        System.out.println("------------------>debug info");
        loggerChain.logMessage(AbstractLogger.DEBUG, "This is an information.");

        System.out.println();
        System.out.println("------------------>normal info");
        loggerChain.logMessage(AbstractLogger.INFO, "This is a normal information");

        System.out.println();
        System.out.println("------------------>error info");
        loggerChain.logMessage(AbstractLogger.ERROR, "This is an error information.");


    }
}
