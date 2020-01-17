package behavior.visitor;

public interface ComputerPartVisitor {
    void visit(Mouse mouse);

    void visit(Monitor monitor);

    void visit(Keyboard keyboard);

    void visit(Computer computer);
}
