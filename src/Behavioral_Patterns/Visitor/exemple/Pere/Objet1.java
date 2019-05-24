package Behavioral_Patterns.Visitor.exemple.Pere;

public class Objet1 implements ObjetPere {
    public void accept(MonVisiteur v) {
        v.visit(this);
    }
}