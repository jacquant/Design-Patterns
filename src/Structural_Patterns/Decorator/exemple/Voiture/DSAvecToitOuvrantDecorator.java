package Structural_Patterns.Decorator.exemple.Voiture;

class DSAvecToitOuvrantDecorator extends VoitureAvecToitOuvrant {
    public DSAvecToitOuvrantDecorator(DS ds) {
        this.voiture = ds;
    }
}
