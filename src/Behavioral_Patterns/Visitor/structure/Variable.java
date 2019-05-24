package Behavioral_Patterns.Visitor.structure;

import Behavioral_Patterns.Visitor.visitors.NodeVisitor;

public class Variable extends Expression {
    public final String name;

    public Variable(String name) {
        assert name != null;

        this.name = name;
    }

    @Override
    public void accept(NodeVisitor visitor) {
        assert visitor != null;

        visitor.visitVariable(this);
    }

}