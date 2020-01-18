package behavior.interceptfilter;

public class AuthenticationFilter implements Filter {
    @Override
    public void execute(String request) {
        System.out.println("Authentic Request:" + request);
    }
}
