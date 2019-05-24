package Behavioral_Patterns.Visitor.exemple.Computer;

public interface ComputerPart {
    public void accept(ComputerPartVisitor computerPartVisitor);
}