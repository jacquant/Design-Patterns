package Structural_Patterns.Decorator.exemple.Voiture;

class VoitureAvecToitOuvrant extends VoitureAvecOption {

    int getPrix() {
        return voiture.getPrix() + 10000;
    }

    int getPoids() {
        return voiture.getPoids() + 15;
    }
}