package Behavioral_Patterns.Visitor.structure;

import Behavioral_Patterns.Visitor.visitors.NodeVisitor;

import java.util.LinkedList;
import java.util.List;

public class Program extends Node {
    public final List<Node> statements = new LinkedList<Node>();

    public Program() {

    }

    public Program add(Node node) {
        assert node != null;

        statements.add(node);
        return this;
    }

    @Override
    public void accept(NodeVisitor visitor) {
        assert visitor != null;

        visitor.visitProgram(this);
    }

}