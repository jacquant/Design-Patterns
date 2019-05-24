package Behavioral_Patterns.Visitor.structure;

import Behavioral_Patterns.Visitor.visitors.NodeVisitor;

public class Value extends Expression {
    public final int value;

    public Value(int value) {
        this.value = value;
    }

    @Override
    public void accept(NodeVisitor visitor) {
        assert visitor != null;

        visitor.visitValue(this);
    }

}