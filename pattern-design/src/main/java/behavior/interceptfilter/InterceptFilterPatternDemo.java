package behavior.interceptfilter;

public class InterceptFilterPatternDemo {
    public static void main(String[] args) {
        FilterChainManager filterChainManager = new FilterChainManager(new Target());
        filterChainManager.setFilter(new AuthenticationFilter());
        filterChainManager.setFilter(new LogFilter());

        Client client = new Client(filterChainManager);
        client.sendRequest("Home");
    }
}
