package behavior.interceptfilter;

public class LogFilter implements Filter {
    @Override
    public void execute(String request) {
        System.out.println("log request:" + request);
    }
}
