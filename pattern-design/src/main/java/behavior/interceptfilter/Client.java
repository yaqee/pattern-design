package behavior.interceptfilter;

public class Client {
    private FilterChainManager filterChainManager;

    public Client(FilterChainManager filterChainManager) {
        this.filterChainManager = filterChainManager;
    }

    public void sendRequest(String request) {
        filterChainManager.filterRequest(request);
    }
}
