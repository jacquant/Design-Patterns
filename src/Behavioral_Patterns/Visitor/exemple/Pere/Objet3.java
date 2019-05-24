package Behavioral_Patterns.Visitor.exemple.Pere;

public class Objet3 implements ObjetPere {
    public void accept(MonVisiteur v) {
        v.visit(this);
    }
}