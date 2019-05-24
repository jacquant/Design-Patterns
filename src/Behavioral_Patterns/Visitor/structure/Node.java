package Behavioral_Patterns.Visitor.structure;

import Behavioral_Patterns.Visitor.visitors.NodeVisitor;

public abstract class Node {

    public abstract void accept(NodeVisitor visitor);

}