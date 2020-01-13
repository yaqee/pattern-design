package behavior.strategy;

public class Context {
    private Strategy strategy;

    public Context(Strategy strategy) {
        this.strategy = strategy;
    }

    public int executeOperation(int x, int y) {
        return strategy.doOperation(x, y);
    }
}
