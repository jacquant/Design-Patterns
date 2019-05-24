package Behavioral_Patterns.Visitor.structure;

import Behavioral_Patterns.Visitor.visitors.NodeVisitor;

public class Assignment extends Node {

    public final String variable;
    public final Expression expression;

    public Assignment(String variable, Expression e) {
        this.variable = variable;
        this.expression = e;
    }

    @Override
    public void accept(NodeVisitor visitor) {
        assert visitor != null;

        visitor.visitAssignment(this);
    }

}
