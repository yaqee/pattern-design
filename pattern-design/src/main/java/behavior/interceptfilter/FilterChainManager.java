package behavior.interceptfilter;

public class FilterChainManager {
    private FilterChain filterChain;

    public FilterChainManager(Target target) {

        filterChain = new FilterChain();
        filterChain.setTarget(target);
    }

    public void setFilter(Filter filter) {
        filterChain.addFilter(filter);
    }

    public void filterRequest(String request) {
        filterChain.execute(request);
    }
}
