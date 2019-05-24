package Behavioral_Patterns.Visitor.visitors;

import Behavioral_Patterns.Visitor.structure.*;

public interface NodeVisitor {
    void visitDeclVariable(DeclVariable variable);

    void visitExprSum(ExprSum sum);

    void visitProgram(Program program);

    void visitValue(Value value);

    void visitAssignment(Assignment assignment);

    void visitVariable(Variable variable);

    void visitPrintExpression(PrintExpression printExpression);
}
