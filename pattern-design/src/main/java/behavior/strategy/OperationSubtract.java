package behavior.strategy;

public class OperationSubtract implements Strategy {
    @Override
    public int doOperation(int x, int y) {
        return x - y;
    }
}
