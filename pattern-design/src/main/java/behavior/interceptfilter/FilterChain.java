package behavior.interceptfilter;

import java.util.ArrayList;
import java.util.List;

public class FilterChain {
    private List<Filter> filterList;
    private Target target;

    public FilterChain() {
        filterList  = new ArrayList<>();
    }

    public void addFilter(Filter filter) {
        filterList.add(filter);
    }

    public void setTarget(Target target) {
        this.target = target;
    }

    public void execute(String request) {
        for (Filter filter: filterList) {
            filter.execute(request);
        }
        target.execute(request);
    }
}
