package behavior.strategy;

public class OperationAdd implements Strategy {
    @Override
    public int doOperation(int x, int y) {
        return x + y;
    }
}
