package behavior.visitor;

public class Computer implements ComputerPart {
    ComputerPart[] parts = new ComputerPart[]{new Monitor(), new Keyboard(), new Mouse()};

    @Override
    public void accept(ComputerPartVisitor computerPartVisitor) {
        for (ComputerPart computerPart: parts) {
            computerPart.accept(computerPartVisitor);
        }
        computerPartVisitor.visit(this);
    }
}
