package Behavioral_Patterns.Visitor.exemple.Pere;

public class Objet2 implements ObjetPere {
    public void accept(MonVisiteur v) {
        v.visit(this);
    }
}
