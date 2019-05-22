package Structural_Patterns.Decorator.exemple.Voiture;

class DS extends Voiture {

    public DS() {
        this.nom = "DS";
        this.marque = "Citroën";
    }

    int getPrix() {
        return 30000;
    }

    int getPoids() {
        return 1500;
    }
}
